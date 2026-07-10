package com.infosys.customer.controller;

import com.infosys.customer.model.Customer;
import com.infosys.customer.repo.CustomerRepo;
import com.infosys.customer.service.CustomerService; // Imported the new service layer
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private CustomerService customerService; // Injected the customer service layer

    // 1. REGISTER CUSTOMER (POST)
    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer) {
        return repo.save(customer);
    }

    // 2. VIEW ALL CUSTOMERS (GET)
    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return (List<Customer>) repo.findAll();
    }

    // 3. VIEW SINGLE CUSTOMER PROFILE WITH LINKED ACCOUNTS (GET)
    // Upgraded to coordinate with the Account Microservice via OpenFeign
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") UUID id) {
        return customerService.getCustomerWithAccounts(id);
    }

    // 4. UPDATE CUSTOMER DETAILS (PUT)
    @PutMapping("/update/{id}")
    public Customer updateCustomer(@PathVariable("id") UUID id, @RequestBody Customer updatedData) {
        Customer existingCustomer = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer profile not found"));
        
        existingCustomer.setName(updatedData.getName());
        existingCustomer.setAddress(updatedData.getAddress());
        existingCustomer.setKycStatus(updatedData.getKycStatus());
        
        return repo.save(existingCustomer);
    }

    // 5. DELETE CUSTOMER PROFILE (DELETE)
    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") UUID id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Customer profile not found");
        }
        repo.deleteById(id);
        return "Customer profile with ID " + id + " has been deleted safely.";
    }
}
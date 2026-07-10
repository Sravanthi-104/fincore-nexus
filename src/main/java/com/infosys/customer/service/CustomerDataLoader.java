package com.infosys.customer.service;

import com.infosys.customer.model.Customer;
import com.infosys.customer.repo.CustomerRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataLoader {

    private final CustomerRepo repo;

    @Autowired
    public CustomerDataLoader(CustomerRepo repo) {
        this.repo = repo;
    }

    @PostConstruct
    public void loadDummyData() {
        if (repo.count() == 0) {
            // Using our custom constructor matching the expanded entity variables
            repo.save(new Customer("John Smith", "123 Financial District", "Verified"));
            repo.save(new Customer("Jane Doe", "456 Commerce Avenue", "Pending"));
            repo.save(new Customer("Nikhil Kumar", "789 Tech Boulevard", "Verified"));
            
            System.out.println(">>> FinCore Production-Grade Customer Data Loaded Successfully!");
        }
    }
}
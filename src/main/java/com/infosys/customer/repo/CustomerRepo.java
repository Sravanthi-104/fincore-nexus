package com.infosys.customer.repo;

import com.infosys.customer.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, UUID> {
}
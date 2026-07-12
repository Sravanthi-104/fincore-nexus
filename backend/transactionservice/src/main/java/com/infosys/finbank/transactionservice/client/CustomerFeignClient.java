package com.infosys.finbank.transactionservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.infosys.finbank.transactionservice.client.dto.CustomerResponse;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerFeignClient {

    @GetMapping("/customers/{id}")
    CustomerResponse getCustomerById(@PathVariable Long id);

}

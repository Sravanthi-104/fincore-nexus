package com.infosys.customer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.UUID;

// We point to the local network port where your team partner will run their Account service (e.g., port 8082)
@FeignClient(name = "account-service", url = "http://localhost:8082")
public interface AccountFeignClient {

    // This must match the exact URL pattern your teammate configures in their AccountController
    @GetMapping("/accounts/customer/{custId}")
    List<Account> getAccountsByCustomerId(@PathVariable("custId") UUID custId);
}
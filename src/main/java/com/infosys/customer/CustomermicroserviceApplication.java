package com.infosys.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients; // 1. IMPORT THIS

@SpringBootApplication
@EnableFeignClients(basePackages = "com.infosys.customer.client") // 2. ADD THIS SPECIFIC PATH SWITCH
public class CustomermicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomermicroserviceApplication.class, args);
    }
}
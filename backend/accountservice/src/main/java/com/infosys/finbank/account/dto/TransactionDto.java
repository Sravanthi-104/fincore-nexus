package com.infosys.finbank.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
    private String accountNumber;
    private String transactionType; // DEPOSIT, WITHDRAWAL, TRANSFER
    private BigDecimal amount;
    private String description;
}

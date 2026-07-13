package com.infosys.finbank.transactionservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.finbank.transactionservice.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByAccountId(Long accountId);

    List<Transaction> findByCustomerId(Long customerId);

    Optional<Transaction> findByTransactionReference(String reference);

    List<Transaction> findByAccountIdOrderByTransactionDateDesc(Long accountId);

}

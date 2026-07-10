package com.infosys.finbank.transactionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.finbank.transactionservice.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}

package com.infosys.finbank.loanservice.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanSagaRepository extends JpaRepository<LoanSaga, Long> {

    Optional<LoanSaga> findByLoanId(Long loanId);

}

package com.smartbankhub.repository;

import com.smartbankhub.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // Transactions sent from a specific account
    List<Transaction> findByFromAccountId(Long fromAccountId);

    // Transactions received by a specific account
    List<Transaction> findByToAccountId(Long toAccountId);

    // Transactions handled by a specific agent
    List<Transaction> findByAgentId(Long agentId);

    // Transactions between two dates
    List<Transaction> findByTransactionDateBetween(LocalDateTime start, LocalDateTime end);
}

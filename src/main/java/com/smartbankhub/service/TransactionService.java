package com.smartbankhub.service;

import com.smartbankhub.entity.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction performTransaction(Transaction transaction);

    List<Transaction> getTransactionsByAccount(Long accountId);

    List<Transaction> getTransactionsByAgent(Long agentId);
}

package com.smartbankhub.service.impl;

import com.smartbankhub.entity.Account;
import com.smartbankhub.entity.Transaction;
import com.smartbankhub.repository.AccountRepository;
import com.smartbankhub.repository.TransactionRepository;
import com.smartbankhub.service.TransactionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository,
                                  AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public Transaction performTransaction(Transaction transaction) {

        Account from = accountRepository.findById(transaction.getFromAccountId()).orElseThrow();
        Account to = accountRepository.findById(transaction.getToAccountId()).orElseThrow();

        if (from.getBalance() < transaction.getAmount()) {
            throw new RuntimeException("Insufficient balance");
        }

        from.setBalance(from.getBalance() - transaction.getAmount());
        to.setBalance(to.getBalance() + transaction.getAmount());

        accountRepository.save(from);
        accountRepository.save(to);

        transaction.setTransactionDate(LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getTransactionsByAccount(Long accountId) {
        return transactionRepository.findByFromAccountId(accountId);
    }

    @Override
    public List<Transaction> getTransactionsByAgent(Long agentId) {
        return transactionRepository.findByAgentId(agentId);
    }
}

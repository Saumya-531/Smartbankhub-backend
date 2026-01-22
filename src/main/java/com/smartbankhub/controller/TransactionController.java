package com.smartbankhub.controller;

import com.smartbankhub.entity.AuditLog;
import com.smartbankhub.entity.Transaction;
import com.smartbankhub.service.AuditLogService;
import com.smartbankhub.service.TransactionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;
    private final AuditLogService auditLogService;

    public TransactionController(TransactionService transactionService,
                                 AuditLogService auditLogService) {
        this.transactionService = transactionService;
        this.auditLogService = auditLogService;
    }

    @PostMapping
    public Transaction performTransaction(@RequestBody Transaction transaction) {

        Transaction savedTransaction = transactionService.performTransaction(transaction);

        auditLogService.logAction(
                new AuditLog(
                        "MONEY_TRANSFERRED",
                        "SYSTEM",
                        "Transaction",
                        savedTransaction.getId(),
                        "Transfer successful"
                )
        );

        return savedTransaction;
    }
}

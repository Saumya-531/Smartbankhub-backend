package com.smartbankhub.dto.response;

import java.time.LocalDateTime;

public class TransactionResponseDTO {

    private Long transactionId;
    private double amount;
    private LocalDateTime transactionDate;
    private String status;

    public Long getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

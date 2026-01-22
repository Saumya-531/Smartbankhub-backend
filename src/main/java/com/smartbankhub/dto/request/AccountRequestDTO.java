package com.smartbankhub.dto.request;

public class AccountRequestDTO {

    private String accountNumber;
    private double initialBalance;
    private Long customerId;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}

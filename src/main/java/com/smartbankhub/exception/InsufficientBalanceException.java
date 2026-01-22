package com.smartbankhub.exception;

public class InsufficientBalanceException extends SmartBankException {

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient balance. Available: " + balance + ", Required: " + amount);
    }
}

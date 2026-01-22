package com.smartbankhub.exception;

public class OverdraftLimitExceededException extends SmartBankException {

    public OverdraftLimitExceededException(double limit) {
        super("Overdraft limit exceeded. Max allowed: " + limit);
    }
}

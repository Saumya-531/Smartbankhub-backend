package com.smartbankhub.dto.request;

public class TransactionRequestDTO {

    private Long fromAccountId;
    private Long toAccountId;
    private double amount;
    private Long agentId;

    public Long getFromAccountId() {
        return fromAccountId;
    }

    public Long getToAccountId() {
        return toAccountId;
    }

    public double getAmount() {
        return amount;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setFromAccountId(Long fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    public void setToAccountId(Long toAccountId) {
        this.toAccountId = toAccountId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }
}

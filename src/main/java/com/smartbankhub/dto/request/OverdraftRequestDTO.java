package com.smartbankhub.dto.request;

import java.math.BigDecimal;

public class OverdraftRequestDTO {

    private Long accountId;
    private BigDecimal overdraftLimit;
    private Double interestRate;

    public Long getAccountId() {
        return accountId;
    }

    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setOverdraftLimit(BigDecimal overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}

package com.smartbankhub.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "overdrafts")
public class Overdraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long overdraftId;

    @OneToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(nullable = false)
    private BigDecimal overdraftLimit;

    @Column(nullable = false)
    private BigDecimal usedAmount;

    @Column(nullable = false)
    private Double interestRate;
    // Example: 12.5 (% per annum)

    @Column(nullable = false)
    private Boolean active;

    private LocalDate activatedOn;

    /* ================== Constructors ================== */

    public Overdraft() {
        this.usedAmount = BigDecimal.ZERO;
        this.active = true;
        this.activatedOn = LocalDate.now();
    }

    public Overdraft(Account account, BigDecimal overdraftLimit, Double interestRate) {
        this.account = account;
        this.overdraftLimit = overdraftLimit;
        this.interestRate = interestRate;
        this.usedAmount = BigDecimal.ZERO;
        this.active = true;
        this.activatedOn = LocalDate.now();
    }

    /* ================== Business Logic ================== */

    public BigDecimal getAvailableOverdraft() {
        return overdraftLimit.subtract(usedAmount);
    }

    /* ================== Getters & Setters ================== */

    public Long getOverdraftId() {
        return overdraftId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(BigDecimal overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public BigDecimal getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDate getActivatedOn() {
        return activatedOn;
    }
}

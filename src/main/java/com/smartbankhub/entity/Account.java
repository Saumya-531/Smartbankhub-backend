package com.smartbankhub.entity;


import jakarta.persistence.*;


@Entity
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(unique = true)
    private String accountNumber;


    private double balance;


    private double overdraftLimit;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }


    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }


    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }


    public double getOverdraftLimit() { return overdraftLimit; }
    public void setOverdraftLimit(double overdraftLimit) { this.overdraftLimit = overdraftLimit; }


    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
}
package com.smartbankhub.service;

import com.smartbankhub.entity.Account;
import com.smartbankhub.entity.Customer;

import java.util.List;

public interface AccountService {

    Account createAccount(Account account);

    Account getAccountById(Long id);

    Account getAccountByNumber(String accountNumber);

    List<Account> getAccountsByCustomer(Customer customer);

    void updateBalance(Account account, double amount);
}

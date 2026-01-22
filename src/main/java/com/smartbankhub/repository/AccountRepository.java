package com.smartbankhub.repository;

import com.smartbankhub.entity.Account;
import com.smartbankhub.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    // Find account by its unique account number
    Account findByAccountNumber(String accountNumber);

    // Find all accounts of a specific customer
    List<Account> findByCustomer(Customer customer);
}

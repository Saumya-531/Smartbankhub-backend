package com.smartbankhub.repository;

import com.smartbankhub.entity.Overdraft;
import com.smartbankhub.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OverdraftRepository extends JpaRepository<Overdraft, Long> {

    // Overdraft associated with a specific account
    Overdraft findByAccount(Account account);

    // Find all active or inactive overdrafts
    List<Overdraft> findByActive(Boolean active);
}

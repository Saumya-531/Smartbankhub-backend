package com.smartbankhub.service;

import com.smartbankhub.entity.Account;
import com.smartbankhub.entity.Overdraft;

import java.math.BigDecimal;

public interface OverdraftService {

    Overdraft createOverdraft(Account account, BigDecimal limit, Double interestRate);

    Overdraft getOverdraftByAccount(Account account);

    void useOverdraft(Overdraft overdraft, BigDecimal amount);
}

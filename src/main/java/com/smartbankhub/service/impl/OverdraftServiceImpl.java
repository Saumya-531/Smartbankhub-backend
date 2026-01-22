package com.smartbankhub.service.impl;

import com.smartbankhub.entity.Account;
import com.smartbankhub.entity.Overdraft;
import com.smartbankhub.repository.OverdraftRepository;
import com.smartbankhub.service.OverdraftService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OverdraftServiceImpl implements OverdraftService {

    private final OverdraftRepository overdraftRepository;

    public OverdraftServiceImpl(OverdraftRepository overdraftRepository) {
        this.overdraftRepository = overdraftRepository;
    }

    @Override
    public Overdraft createOverdraft(Account account, BigDecimal limit, Double interestRate) {
        Overdraft overdraft = new Overdraft(account, limit, interestRate);
        return overdraftRepository.save(overdraft);
    }

    @Override
    public Overdraft getOverdraftByAccount(Account account) {
        return overdraftRepository.findByAccount(account);
    }

    @Override
    public void useOverdraft(Overdraft overdraft, BigDecimal amount) {
        overdraft.setUsedAmount(overdraft.getUsedAmount().add(amount));
        overdraftRepository.save(overdraft);
    }
}

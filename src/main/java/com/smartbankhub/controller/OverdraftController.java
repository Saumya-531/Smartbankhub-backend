package com.smartbankhub.controller;

import com.smartbankhub.entity.Account;
import com.smartbankhub.entity.Overdraft;
import com.smartbankhub.service.OverdraftService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/overdrafts")
public class OverdraftController {

    private final OverdraftService overdraftService;

    public OverdraftController(OverdraftService overdraftService) {
        this.overdraftService = overdraftService;
    }

    @PostMapping
    public Overdraft createOverdraft(@RequestParam Account account,
                                     @RequestParam BigDecimal limit,
                                     @RequestParam Double interestRate) {
        return overdraftService.createOverdraft(account, limit, interestRate);
    }
}

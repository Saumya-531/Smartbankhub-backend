package com.smartbankhub.scheduler;

import com.smartbankhub.service.CommissionService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CommissionScheduler {

    private final CommissionService commissionService;

    public CommissionScheduler(CommissionService commissionService) {
        this.commissionService = commissionService;
    }

    // Runs every day at 12:00 AM
    @Scheduled(cron = "0 0 0 * * ?")
    public void calculateDailyCommission() {
        commissionService.calculateDailyCommission();
    }
}

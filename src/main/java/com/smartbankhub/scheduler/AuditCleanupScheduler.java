package com.smartbankhub.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AuditCleanupScheduler {

    // Runs on 1st day of every month
    @Scheduled(cron = "0 0 1 1 * ?")
    public void archiveOldLogs() {
        System.out.println("Monthly audit log maintenance running...");
    }
}

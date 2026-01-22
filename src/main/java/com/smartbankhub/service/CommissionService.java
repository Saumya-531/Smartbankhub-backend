package com.smartbankhub.service;

import com.smartbankhub.entity.Commission;

import java.time.LocalDate;
import java.util.List;

public interface CommissionService {

    Commission saveCommission(Commission commission);

    List<Commission> getCommissionsByAgent(Long agentId);

    List<Commission> getCommissionsBetweenDates(LocalDate start, LocalDate end);

    void calculateDailyCommission();

    void calculateWeeklyCommission();

    void calculateMonthlyCommission();
}

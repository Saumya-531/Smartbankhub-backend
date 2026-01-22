package com.smartbankhub.service.impl;

import com.smartbankhub.entity.Commission;
import com.smartbankhub.repository.CommissionRepository;
import com.smartbankhub.service.CommissionService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommissionServiceImpl implements CommissionService {

    private final CommissionRepository commissionRepository;

    public CommissionServiceImpl(CommissionRepository commissionRepository) {
        this.commissionRepository = commissionRepository;
    }

    // ================= BASIC CRUD =================

    @Override
    public Commission saveCommission(Commission commission) {
        commission.setCreatedAt(LocalDateTime.now());
        return commissionRepository.save(commission);
    }

    @Override
    public List<Commission> getCommissionsByAgent(Long agentId) {
        return commissionRepository.findByAgentId(agentId);
    }

    @Override
    public List<Commission> getCommissionsBetweenDates(LocalDate start, LocalDate end) {
        return commissionRepository.findByStartDateGreaterThanEqualAndEndDateLessThanEqual(start, end);
    }

    // ================= SCHEDULED CALCULATIONS =================

    @Override
    public void calculateDailyCommission() {
        System.out.println("Daily commission calculation executed");
        // later: fetch today's transactions → compute → save commission
    }

    @Override
    public void calculateWeeklyCommission() {
        System.out.println("Weekly commission calculation executed");
    }

    @Override
    public void calculateMonthlyCommission() {
        System.out.println("Monthly commission calculation executed");
    }
}

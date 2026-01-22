package com.smartbankhub.controller;

import com.smartbankhub.entity.Commission;
import com.smartbankhub.service.CommissionService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/commissions")
public class CommissionController {

    private final CommissionService commissionService;

    public CommissionController(CommissionService commissionService) {
        this.commissionService = commissionService;
    }

    @PostMapping
    public Commission saveCommission(@RequestBody Commission commission) {
        return commissionService.saveCommission(commission);
    }

    @GetMapping("/agent/{agentId}")
    public List<Commission> getByAgent(@PathVariable Long agentId) {
        return commissionService.getCommissionsByAgent(agentId);
    }

    @GetMapping("/range")
    public List<Commission> getByDateRange(@RequestParam LocalDate start,
                                           @RequestParam LocalDate end) {
        return commissionService.getCommissionsBetweenDates(start, end);
    }
}

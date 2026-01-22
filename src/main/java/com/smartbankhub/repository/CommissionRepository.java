package com.smartbankhub.repository;

import com.smartbankhub.entity.Commission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CommissionRepository extends JpaRepository<Commission, Long> {

    List<Commission> findByAgentId(Long agentId);

    List<Commission> findByStartDateGreaterThanEqualAndEndDateLessThanEqual(
            LocalDate startDate,
            LocalDate endDate
    );
}

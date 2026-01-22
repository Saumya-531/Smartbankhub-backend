package com.smartbankhub.repository;

import com.smartbankhub.entity.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {

    // Audit logs for a specific entity
    List<AuditLog> findByEntityNameAndEntityId(String entityName, Long entityId);

    // Audit logs performed by a specific user or system
    List<AuditLog> findByPerformedBy(String performedBy);

    // Audit logs within a timestamp range
    List<AuditLog> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
}

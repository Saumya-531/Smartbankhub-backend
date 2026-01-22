package com.smartbankhub.service.impl;

import com.smartbankhub.entity.AuditLog;
import com.smartbankhub.repository.AuditLogRepository;
import com.smartbankhub.service.AuditLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImpl implements AuditLogService {

    private final AuditLogRepository auditLogRepository;

    public AuditLogServiceImpl(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }

    @Override
    public AuditLog logAction(AuditLog auditLog) {
        return auditLogRepository.save(auditLog);
    }

    @Override
    public List<AuditLog> getLogsByEntity(String entityName, Long entityId) {
        return auditLogRepository.findByEntityNameAndEntityId(entityName, entityId);
    }

    @Override
    public List<AuditLog> getLogsByUser(String performedBy) {
        return auditLogRepository.findByPerformedBy(performedBy);
    }
}

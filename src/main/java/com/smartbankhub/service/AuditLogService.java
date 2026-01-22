package com.smartbankhub.service;

import com.smartbankhub.entity.AuditLog;

import java.util.List;

public interface AuditLogService {

    AuditLog logAction(AuditLog auditLog);

    List<AuditLog> getLogsByEntity(String entityName, Long entityId);

    List<AuditLog> getLogsByUser(String performedBy);
}

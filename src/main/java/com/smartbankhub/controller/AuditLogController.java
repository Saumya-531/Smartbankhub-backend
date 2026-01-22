package com.smartbankhub.controller;

import com.smartbankhub.entity.AuditLog;
import com.smartbankhub.service.AuditLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/audit-logs")
public class AuditLogController {

    private final AuditLogService auditLogService;

    public AuditLogController(AuditLogService auditLogService) {
        this.auditLogService = auditLogService;
    }

    @GetMapping("/entity")
    public List<AuditLog> getLogsByEntity(@RequestParam String entityName,
                                          @RequestParam Long entityId) {
        return auditLogService.getLogsByEntity(entityName, entityId);
    }

    @GetMapping("/user/{user}")
    public List<AuditLog> getLogsByUser(@PathVariable String user) {
        return auditLogService.getLogsByUser(user);
    }
}

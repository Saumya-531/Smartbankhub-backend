package com.smartbankhub.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "audit_logs")
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auditLogId;

    @Column(nullable = false)
    private String action;
    // e.g. ACCOUNT_CREATED, MONEY_TRANSFERRED, OVERDRAFT_USED

    @Column(nullable = false)
    private String performedBy;
    // username / email / system

    @Column(nullable = false)
    private String entityName;
    // Account, Transaction, Overdraft, etc.

    @Column(nullable = false)
    private Long entityId;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    private String remarks;

    /* ================== Constructors ================== */

    public AuditLog() {
        this.timestamp = LocalDateTime.now();
    }

    public AuditLog(String action, String performedBy, String entityName,
                    Long entityId, String remarks) {
        this.action = action;
        this.performedBy = performedBy;
        this.entityName = entityName;
        this.entityId = entityId;
        this.remarks = remarks;
        this.timestamp = LocalDateTime.now();
    }

    /* ================== Getters & Setters ================== */

    public Long getAuditLogId() {
        return auditLogId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

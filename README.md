🚀 SmartBankHub – Agent Empowered Smart Banking Transactional Hub
📌 Overview

SmartBankHub is a Spring Boot–based backend application designed to simulate a real-world agent-assisted digital banking system.
It supports secure transactions, agent commissions, overdraft facilities, scheduled calculations, and complete audit logging using a clean layered architecture.
🏗️ Architecture

The project follows a layered architecture:
Controller → DTO → Service → Entity → Repository → Database
                           ↓
                       Audit Logs
                           ↓
                      Schedulers
Layers Used:
Controller Layer – REST APIs
Service Layer – Business logic
Repository Layer – Database access (JPA)
Entity Layer – Database models
DTO Layer – Request/Response objects
Scheduler Layer – Automated commission calculation
Exception Layer – Centralized error handling


✨ Key Features:

👤 User & Role Management
Users with roles: ADMIN, AGENT, CUSTOMER

💳 Account Management
Customer bank accounts
Balance tracking
Overdraft facility with interest

🔁 Transactions
Account-to-account transfers
Agent-assisted transactions
Validation for balance & overdraft

💰 Commission System
Agent commission calculation
Daily, weekly & monthly scheduling
Time-based commission aggregation

🧾 Audit Logging
Tracks every critical operation
Stores action, entity, timestamp & remarks
Useful for admin monitoring

⏰ Scheduled Jobs
Automated commission calculations
Spring Scheduler enabled

🛠️ Technologies Used
Java 17+
Spring Boot
Spring Data JPA
MySQL
Hibernate
Spring Scheduler
REST APIs
Maven

🔄 Example Flow: Money Transfer
Client sends transaction request (DTO)
Controller validates input
Service checks balance & overdraft
Transaction is persisted
Commission is calculated
Audit log is recorded
Response DTO returned

🧪 API Testing
APIs tested using Postman
Clean JSON request/response structure
Centralized error responses via @RestControllerAdvice

📌 Future Enhancements
Spring Security + JWT authentication
Role-based access control
Swagger API documentation
Docker & cloud deployment
Redis caching
Async audit logging

👩‍💻 Author
Saumya Gupta
2nd Year Computer Applications Student
Backend Developer | Java | Spring Boot

⭐ Why This Project?
This project demonstrates:
Enterprise-level backend design
Real-world banking use cases
Clean separation of concerns
Scalable & maintainable architecture

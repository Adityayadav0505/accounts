# Accounts Microservice

## Overview

The **Accounts Microservice** is a Spring Boot–based microservice responsible for managing customer accounts. It follows a layered architecture using **Controller → Service → Repository → Entity/DTO** and is designed to be scalable, secure, and cloud-ready.

This service is typically part of a larger **microservices ecosystem** and can be integrated with other services such as Customers, Loans, Cards, or Notifications.

---

## Key Features

* Create and manage customer accounts
* RESTful APIs with proper HTTP status codes
* DTO–Entity separation using mappers
* Centralized exception handling
* Validation of request payloads
* Database persistence using JPA/Hibernate
* Cloud-ready (Docker, AWS friendly)

---

## Tech Stack

* **Language:** Java 17+
* **Framework:** Spring Boot
* **Build Tool:** Maven
* **Database:** MySQL / PostgreSQL (configurable)
* **ORM:** Spring Data JPA (Hibernate)
* **Security:** Spring Security (JWT – optional)
* **Documentation:** OpenAPI / Swagger
* **Containerization:** Docker (optional)

---

## Running the Application

### Run Locally

```bash
mvn spring-boot:run
```

### Run with Docker

```bash
docker build -t accounts-service .
docker run -p 8080:8080 accounts-service
```

---

## API Documentation

Once the application is running, access Swagger UI:

```
http://localhost:8080/swagger-ui.html
```

## License

This project is licensed under the MIT License.











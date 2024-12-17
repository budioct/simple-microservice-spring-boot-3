# Spring Boot Microservices Architecture

This project showcases a microservices architecture built with Java Spring Boot, designed for scalability, reliability, and ease of maintenance. It incorporates:
- Eureka for seamless service discovery,
- Spring Cloud Gateway for API routing, and
- Spring Cloud Config Server for centralized configuration management. 

To ensure robust observability, the application integrates Zipkin for distributed tracing and logging, providing valuable insights into service communication and performance metrics.

---

## Prerequisites

Ensure you have the following installed before running the project:
- **Java**: 21
- **Spring Boot**: 3.4.0
- **Eureka Discovery Server**
- **API Gateway (Spring Cloud Gateway)**
- **Spring Cloud Config Server**
- **OpenFeign**
- **Zipkin (for distributed tracing)**
- **PostgreSQL**
- **Maven**

---

## Features

### Eureka Discovery Management
- Service registration As a microservices container.

### API Gateway
- Routes client requests to specific microservices.
- Provides a unified entry point for clients.

### Spring Cloud
- Centralized configuration management.
- Distributed tracing and logging.

### OpenFeign
- Simplifies communication between microservices using declarative REST clients.

### Zipkin
- Tracks service interactions and logs distributed traces for easier debugging.

---

## Installation
You can set up this project using Docker Compose or by configuring databases manually.

### Using Docker Compose
If you're using PostgreSQL, you can run the following commands to set up the required databases and services: it will create for you needed databases, zipkin and pgadmin
- start services
```bash
  docker compose up -d
```
- stop services
```bash
  docker compose down
```
### Manual Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/budioct/simple-microservice-spring-boot-3.git
   ```
2. Navigate to the project directory:
   ```bash
   cd simple-microservice-spring-boot-3
   cd simple-microservice-spring-boot-3\ 
   cd .\simple-microservice-spring-boot-3\
   ```

3. Create MySQL/Postgres databases for two microservices.
   ```bash
   create database students
   create database schools
   ```

4. Change mysql/postgres username and password as per your installation
   + first `src/main/resources/configurations/students.properties`
   + second `src/main/resources/configurations/schools.properties`
   + change `spring.datasource.username` and `spring.datasource.password` as per your mysql/postgres installation


5. Start the services in order 
   - config-server 
   - discovery-server 
   - api-gateway
   - student 
   - school


6. Access the services:
   - The api-gateway service will run on http://localhost:8222 
   - The students service will run on http://localhost:8090 
   - The schools service will run on http://localhost:8070

---

### API Documentation

API documentation is available via Postman. You can access it here:
- Postman Documentation: https://documenter.getpostman.com/view/7284698/2sAYHzHPX5
- Additionally, a Postman collection file is included in the repository under docs/Documentation Microservices Architecture Spring Boot.postman_collection.json

---

### Thank you for taking the time to explore this project. I hope it serves as a helpful resource in your journey to mastering Java and Spring Boot development. Your feedback and contributions are always welcome.

### Wishing you success in your development endeavors. May this project inspire and support you in building even greater solutions.

### Best regards,
### Budhi Octaviansyah
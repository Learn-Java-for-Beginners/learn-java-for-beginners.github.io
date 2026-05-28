---
layout: default
title: Assignment
parent: Week 8 - Docker & Deployment
nav_order: 3
---

# Week 8 - Assignment

# 📘 Assignment Overview

In this assignment, you will containerize a Spring Boot backend application using Docker and Docker Compose.

The goal of this assignment is to help you understand how backend applications are packaged and executed in modern development and deployment environments.

This assignment simulates a real-world backend engineering workflow.

---

# 🎯 Assignment Objectives

By completing this assignment, you should be able to:

* Create Dockerfiles for Java applications
* Build Docker images
* Run containerized Spring Boot applications
* Configure Docker Compose
* Connect applications with databases
* Understand container networking basics
* Debug deployment-related problems

---

# 🛠 Assignment Scenario

You are working as a backend developer on a Spring Boot-based Student Management System.

Your task is to:

1. Package the application as a Docker container
2. Run the application using Docker
3. Run a database using Docker
4. Connect the application with the database
5. Manage both services using Docker Compose

---

# 📂 Project Requirements

The project should contain:

```text id="9t6k13"
student-management-system/
│
├── Dockerfile
├── docker-compose.yml
├── pom.xml
├── src/
└── README.md
```

---

# 📋 Assignment Tasks

# Task 1 - Build the Spring Boot Application

## Requirements

* Ensure the application builds successfully
* Generate executable JAR file

## Expected Command

```bash id="zthc8j"
mvn clean package
```

---

# Task 2 - Create Dockerfile

## Requirements

Create a Dockerfile that:

* Uses Java 17 base image
* Copies application JAR
* Exposes application port
* Starts application automatically

---

# Sample Structure

```dockerfile id="l98d0s"
FROM openjdk:17

WORKDIR /app

COPY target/student-management-system.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

# Task 3 - Build Docker Image

## Requirements

Build Docker image using Dockerfile.

## Expected Command

```bash id="e2vhnm"
docker build -t student-management-system .
```

---

# Task 4 - Run Docker Container

## Requirements

Run the application container.

## Expected Command

```bash id="z2vqdn"
docker run -p 8080:8080 student-management-system
```

---

# Verification

Verify that:

* Container starts successfully
* Spring Boot logs are visible
* Application accessible on browser/Postman

Example:

```text id="fj2hmr"
http://localhost:8080
```

---

# Task 5 - Run Database Container

## Requirements

Run MySQL or PostgreSQL container using Docker.

## Example MySQL Command

```bash id="s5s3k5"
docker run -d \
--name mysql-db \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD=password \
mysql:8
```

---

# Task 6 - Configure Application Database Connectivity

## Requirements

Update Spring Boot configuration:

* Database URL
* Username
* Password

Example:

```properties id="0b6tza"
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=password
```

---

# Task 7 - Create docker-compose.yml

## Requirements

Create Docker Compose configuration for:

* Spring Boot application
* Database container

---

# Sample docker-compose.yml

```yaml id="53p5sl"
version: '3'

services:

  app:
    build: .
    ports:
      - "8080:8080"
    depends_on:
      - mysql

  mysql:
    image: mysql:8
    environment:
      MYSQL_ROOT_PASSWORD: password
      MYSQL_DATABASE: studentdb
    ports:
      - "3306:3306"
```

---

# Task 8 - Start Application Using Docker Compose

## Expected Command

```bash id="m3d6r7"
docker compose up
```

---

# Task 9 - Verify Endpoints

Verify:

* Application starts correctly
* Database connection successful
* APIs working properly

Test using:

* Browser
* Postman
* Curl

---

# 🔍 Expected API Endpoints

Example endpoints:

| Method | Endpoint       |
| ------ | -------------- |
| GET    | /students      |
| POST   | /students      |
| DELETE | /students/{id} |

---

# 🧪 Testing Requirements

You should verify:

* Application logs
* Database connectivity
* Container startup
* API responses
* Error handling

You should also intentionally test failure scenarios.

Examples:

* Wrong database password
* Incorrect port mapping
* Missing environment variables

---

# 📋 Deliverables

Submit the following:

| Deliverable              | Required |
| ------------------------ | -------- |
| Dockerfile               | Yes      |
| docker-compose.yml       | Yes      |
| Source Code              | Yes      |
| Screenshots of execution | Yes      |
| README with instructions | Yes      |

---

# 📸 Suggested Screenshots

Capture screenshots of:

* Docker images
* Running containers
* Application logs
* Successful API execution
* Docker Compose execution

---

# 🧠 Learning Expectations

By completing this assignment, you should understand:

* How Docker packages applications
* How containers run
* How services communicate
* How deployment environments work
* How backend systems are executed in modern infrastructure

---

# ⚠ Common Mistakes to Avoid

| Mistake                         | Recommendation          |
| ------------------------------- | ----------------------- |
| Wrong JAR path                  | Verify target directory |
| Incorrect port mapping          | Match exposed ports     |
| Database not reachable          | Check configuration     |
| Missing Dockerfile instructions | Validate syntax         |
| Using latest image tags         | Use specific versions   |

---

# ⭐ Bonus Tasks (Optional)

# Bonus 1 - Add Environment Variables

Move database configuration to environment variables.

---

# Bonus 2 - Add Health Endpoint

Add Spring Boot actuator health endpoint.

---

# Bonus 3 - Use PostgreSQL Instead of MySQL

Try another database container.

---

# Bonus 4 - Push Image to Docker Hub

Push your image to Docker Hub repository.

---

# 🏆 Evaluation Criteria

| Category               | Marks |
| ---------------------- | ----- |
| Dockerfile correctness | 20    |
| Docker image build     | 15    |
| Container execution    | 15    |
| Docker Compose setup   | 20    |
| Database connectivity  | 15    |
| Debugging capability   | 10    |
| Documentation quality  | 5     |

Total: 100 Marks

---

# 🚀 Real Industry Connection

This assignment reflects real backend engineering practices used in:

* Cloud-native systems
* Kubernetes environments
* DevOps workflows
* CI/CD pipelines
* Microservices architectures

Docker is considered a foundational skill for modern backend engineers.

---

# 📜 License

This project is licensed under the GNU GPL-3.0 License.

Maintained by Aditya Pratap Bhuyan
LinkedIn: https://linkedin.com/in/adityabhuyan

---

---
layout: default
title: Solutions
parent: Week 8 - Docker & Deployment
nav_order: 7
---

# Week 8 - Solutions

# 📘 Introduction

This document contains reference solutions and explanations for the exercises and assignment provided in Week 8.

The purpose of these solutions is to:

* Reinforce learning
* Demonstrate best practices
* Explain Docker concepts practically
* Help identify mistakes
* Improve debugging ability

Do not simply copy solutions.
Try to understand *why* each configuration and command is used.

---

# 🧪 Exercise 1 - Docker Installation Verification

# Solution

Verify Docker installation:

```bash id="q3m8v2"
docker --version
```

Expected output:

```text id="u7x5p1"
Docker version 27.x.x
```

Run hello-world container:

```bash id="z8v2m5"
docker run hello-world
```

---

# Explanation

This command:

1. Downloads the hello-world image
2. Creates container
3. Executes container
4. Displays success message

This confirms Docker installation is working correctly.

---

# 🧪 Exercise 2 - Docker Commands

# Solution

List running containers:

```bash id="m2s9x7"
docker ps
```

List all containers:

```bash id="a6p4v1"
docker ps -a
```

List images:

```bash id="d5k8r3"
docker images
```

Display system information:

```bash id="n4v7q2"
docker system info
```

---

# Explanation

| Command            | Purpose                          |
| ------------------ | -------------------------------- |
| docker ps          | Shows running containers         |
| docker ps -a       | Shows all containers             |
| docker images      | Lists available images           |
| docker system info | Shows Docker environment details |

---

# 🧪 Exercise 3 - Interactive Ubuntu Container

# Solution

Run Ubuntu container:

```bash id="j9w4m8"
docker run -it ubuntu bash
```

Inside container:

```bash id="t3q7v5"
pwd
```

```bash id="p8m2x1"
ls
```

Exit:

```bash id="r6n4s9"
exit
```

---

# Explanation

| Option | Meaning          |
| ------ | ---------------- |
| -i     | Interactive mode |
| -t     | Terminal mode    |

The container exits because the main bash process stops.

---

# 🧪 Exercise 4 - Nginx Container

# Solution

Run Nginx:

```bash id="x5m8k2"
docker run -p 8080:80 nginx
```

Open browser:

```text id="v7p1q4"
http://localhost:8080
```

---

# Explanation

| Mapping | Meaning           |
| ------- | ----------------- |
| 8080    | Host machine port |
| 80      | Container port    |

Requests reaching localhost:8080 are forwarded to Nginx running inside container.

---

# 🧪 Exercise 5 - Dockerfile

# Solution

```dockerfile id="f1r8v3"
FROM openjdk:17

WORKDIR /app

COPY app.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

# Explanation

| Instruction | Purpose                  |
| ----------- | ------------------------ |
| FROM        | Base image               |
| WORKDIR     | Working directory        |
| COPY        | Copies application JAR   |
| EXPOSE      | Documents container port |
| ENTRYPOINT  | Starts application       |

---

# 🧪 Exercise 6 - Build Docker Image

# Solution

```bash id="k4n7p2"
docker build -t my-java-app .
```

Verify:

```bash id="u5v9m1"
docker images
```

---

# Explanation

| Part        | Meaning           |
| ----------- | ----------------- |
| build       | Build image       |
| -t          | Tag image         |
| my-java-app | Image name        |
| .           | Current directory |

---

# 🧪 Exercise 7 - Run Java Application

# Solution

```bash id="w3m6r9"
docker run -p 8080:8080 my-java-app
```

---

# Explanation

This command:

* Creates container
* Maps ports
* Starts Spring Boot application

---

# 🧪 Exercise 8 - View Logs

# Solution

List containers:

```bash id="b8x4n1"
docker ps
```

View logs:

```bash id="m6r2v8"
docker logs <container-id>
```

---

# Explanation

Logs help identify:

* Startup failures
* Database connection problems
* Configuration errors
* Runtime exceptions

---

# 🧪 Exercise 9 - Execute Inside Container

# Solution

```bash id="q7v1m3"
docker exec -it <container-id> bash
```

---

# Explanation

This allows access inside running container for:

* Debugging
* Inspecting files
* Checking configuration
* Verifying environment variables

---

# 🧪 Exercise 10 - MySQL Container

# Solution

```bash id="d2m8v4"
docker run -d \
--name mysql-db \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD=password \
mysql:8
```

---

# Explanation

| Option | Purpose              |
| ------ | -------------------- |
| -d     | Detached mode        |
| --name | Container name       |
| -p     | Port mapping         |
| -e     | Environment variable |

---

# 🧪 Exercise 11 - Docker Compose

# Solution

```yaml id="r5k9m1"
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

Start services:

```bash id="t8v3q5"
docker compose up
```

Stop services:

```bash id="y2m6r1"
docker compose down
```

---

# Explanation

Docker Compose allows multiple services to be managed together.

This setup starts:

* Spring Boot application
* MySQL database

in a single command.

---

# 🧪 Exercise 12 - Debugging Scenarios

# Scenario 1 - Port Conflict

## Problem

Application fails to start.

## Cause

Port already in use.

## Fix

Use another host port:

```bash id="s4m8x2"
docker run -p 8081:8080 my-java-app
```

---

# Scenario 2 - Database Connection Failure

## Problem

Application cannot connect to database.

## Cause

Incorrect credentials or hostname.

## Fix

Verify:

* Database username
* Password
* Hostname
* Database port

---

# Scenario 3 - Missing JAR File

## Problem

Docker build fails during COPY step.

## Cause

Incorrect file path.

## Fix

Ensure JAR exists:

```bash id="u9r3m7"
target/student-management-system.jar
```

---

# Scenario 4 - Container Exits Immediately

## Cause

Main process terminated.

## Fix

Check logs:

```bash id="n5x2v6"
docker logs <container-id>
```

---

# 🏗 Assignment Reference Solution

# Dockerfile

```dockerfile id="c3m8v1"
FROM openjdk:17

WORKDIR /app

COPY target/student-management-system.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

# docker-compose.yml

```yaml id="k7m2v5"
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

# Spring Boot Configuration

```properties id="p6v9m2"
spring.datasource.url=jdbc:mysql://mysql:3306/studentdb
spring.datasource.username=root
spring.datasource.password=password
```

---

# Important Note

Inside Docker Compose:

```text id="r8v1m4"
mysql
```

is used as hostname because Compose automatically creates internal networking between services.

---

# 🧠 Best Practices

# 1. Use Specific Versions

Good:

```dockerfile id="x2m9v6"
openjdk:17
```

Avoid:

```dockerfile id="q4r8m1"
latest
```

---

# 2. Keep Images Small

Use lightweight base images whenever possible.

---

# 3. Use Environment Variables

Avoid hardcoding secrets inside source code.

---

# 4. Use Logs for Debugging

Logs are critical for troubleshooting.

---

# 5. Keep Containers Stateless

Do not store important data inside containers.

---

# 🚀 Real Industry Understanding

Modern backend engineering commonly uses:

* Docker
* Kubernetes
* CI/CD Pipelines
* Cloud-native architectures
* Container orchestration platforms

Docker is considered a foundational industry skill.

---

# 📚 Recommended Next Learning Topics

After completing Docker basics, recommended next topics are:

* Kubernetes
* OpenShift
* Helm
* CI/CD
* Container Security
* Monitoring and Observability

---

# 📜 License

This project is licensed under the GNU GPL-3.0 License.

Maintained by Aditya Pratap Bhuyan
LinkedIn: https://linkedin.com/in/adityabhuyan

---

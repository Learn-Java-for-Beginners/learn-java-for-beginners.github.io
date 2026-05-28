---
layout: default
title: Week 8 - Docker and Deployment - Study Material
parent: Weekly Curriculum
nav_order: 10
---

# Week 8 - Docker and Deployment

# 📘 Introduction

Modern software development is no longer limited to simply writing code.
Backend developers today are also expected to understand:

* How applications are packaged
* How applications are deployed
* How environments are managed
* How applications run consistently across systems

This is where Docker becomes extremely important.

Docker helps developers package applications together with their dependencies into lightweight, portable containers that can run consistently across environments.

In this week, we will learn the fundamentals of Docker and how backend applications are deployed using containers.

---

# 🐳 What is Docker?

Docker is a containerization platform that allows applications to run inside isolated environments called containers.

A container contains:

* Application code
* Runtime
* Libraries
* Dependencies
* Configuration

This ensures that the application behaves the same way everywhere.

---

# ❓ Why Do We Need Docker?

Before Docker, developers often faced the problem:

> "It works on my machine but not on the server."

Different systems may have:

* Different operating systems
* Different Java versions
* Different libraries
* Different configurations

Docker solves this problem by packaging everything required for the application together.

---

# 🖥 Containers vs Virtual Machines

## Virtual Machines

Virtual machines emulate complete operating systems.

Each VM contains:

* Full OS
* Kernel
* Libraries
* Application

This makes them heavy and resource intensive.

---

## Containers

Containers share the host operating system kernel.

They are:

* Lightweight
* Faster
* Easier to start
* Easier to deploy

---

# 📦 Important Docker Concepts

# 1. Docker Image

A Docker image is a read-only template used to create containers.

An image contains:

* Application code
* Runtime
* Dependencies
* Configuration

Example:

```bash
openjdk:17
```

This is a Java 17 image.

---

# 2. Docker Container

A running instance of a Docker image is called a container.

Image → Blueprint
Container → Running application

---

# 3. Dockerfile

A Dockerfile is a text file that contains instructions for building Docker images.

Example:

```dockerfile
FROM openjdk:17
COPY app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

# 4. Docker Hub

Docker Hub is a public repository where Docker images are stored.

Example images:

* MySQL
* PostgreSQL
* Redis
* Nginx
* OpenJDK

---

# ⚙ Installing Docker

## Windows

Install:

* Docker Desktop

---

## Linux

Install:

```bash
sudo apt install docker.io
```

---

# 🔍 Verifying Docker Installation

Run:

```bash
docker --version
```

Example output:

```bash
Docker version 27.x.x
```

---

# 🚀 Running Your First Docker Container

Run:

```bash
docker run hello-world
```

Docker will:

1. Download the image
2. Create container
3. Execute container
4. Display message

---

# 📋 Common Docker Commands

# List Running Containers

```bash
docker ps
```

---

# List All Containers

```bash
docker ps -a
```

---

# List Images

```bash
docker images
```

---

# Stop Container

```bash
docker stop <container-id>
```

---

# Remove Container

```bash
docker rm <container-id>
```

---

# Remove Image

```bash
docker rmi <image-id>
```

---

# 🏗 Understanding Dockerfiles

Dockerfiles define how images are built.

---

# Example Dockerfile

```dockerfile
FROM openjdk:17

WORKDIR /app

COPY target/student-app.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

# Understanding Each Instruction

# FROM

Defines base image.

```dockerfile
FROM openjdk:17
```

---

# WORKDIR

Sets working directory inside container.

```dockerfile
WORKDIR /app
```

---

# COPY

Copies files from host to container.

```dockerfile
COPY target/student-app.jar app.jar
```

---

# EXPOSE

Documents application port.

```dockerfile
EXPOSE 8080
```

---

# ENTRYPOINT

Defines startup command.

```dockerfile
ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

# 🏗 Building Docker Images

Command:

```bash
docker build -t student-app .
```

Explanation:

| Part         | Meaning           |
| ------------ | ----------------- |
| docker build | Build image       |
| -t           | Tag image         |
| student-app  | Image name        |
| .            | Current directory |

---

# ▶ Running Docker Containers

Command:

```bash
docker run -p 8080:8080 student-app
```

---

# Port Mapping

Format:

```bash
host-port:container-port
```

Example:

```bash
8080:8080
```

---

# 📜 Viewing Logs

```bash
docker logs <container-id>
```

Logs help debug issues.

---

# 🔧 Executing Commands Inside Containers

```bash
docker exec -it <container-id> bash
```

This opens terminal inside container.

---

# 🌱 Spring Boot and Docker

Spring Boot applications are ideal for containerization because:

* Self-contained JARs
* Embedded servers
* Easy startup

Typical workflow:

1. Build JAR
2. Create Dockerfile
3. Build image
4. Run container

---

# 🗄 Running Databases in Docker

Example MySQL container:

```bash
docker run -d \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD=password \
mysql:8
```

---

# Environment Variables

Environment variables allow configuration without modifying code.

Example:

```bash
-e MYSQL_ROOT_PASSWORD=password
```

---

# 🔗 Docker Compose

Docker Compose helps run multi-container applications.

Example:

* Spring Boot application
* MySQL database

Together.

---

# Example docker-compose.yml

```yaml
version: '3'

services:

  app:
    build: .
    ports:
      - "8080:8080"

  mysql:
    image: mysql:8
    environment:
      MYSQL_ROOT_PASSWORD: password
```

---

# Running Docker Compose

```bash
docker compose up
```

---

# Stopping Docker Compose

```bash
docker compose down
```

---

# 🧪 Debugging Containers

Common issues:

| Problem                     | Cause                |
| --------------------------- | -------------------- |
| Application not starting    | Wrong command        |
| Port already used           | Port conflict        |
| Database connection failure | Wrong configuration  |
| Image build failure         | Incorrect Dockerfile |

---

# 🛠 Best Practices

# 1. Keep Images Small

Use lightweight base images.

---

# 2. Avoid Hardcoding Secrets

Use environment variables.

---

# 3. Use Specific Image Versions

Good:

```dockerfile
openjdk:17
```

Avoid:

```dockerfile
latest
```

---

# 4. Keep Containers Stateless

Do not store important data inside containers.

---

# 5. Use Logs Properly

Logs are essential for debugging.

---

# ☁ Docker in Real Industry

Docker is widely used in:

* Cloud-native applications
* Kubernetes
* CI/CD pipelines
* Microservices
* DevOps workflows

Companies use Docker because it provides:

* Faster deployment
* Environment consistency
* Scalability
* Easier maintenance

---

# 🔥 Introduction to Kubernetes

Docker runs containers.

Kubernetes manages containers at scale.

Kubernetes helps with:

* Scaling
* High availability
* Self-healing
* Rolling updates

You will learn Kubernetes in future advanced topics.

---

# 🧠 Summary

In this week, you learned:

* What Docker is
* Why containers are important
* Docker images and containers
* Dockerfiles
* Docker commands
* Spring Boot containerization
* Docker Compose basics
* Deployment fundamentals

These are foundational skills for modern backend engineering and cloud-native development.

---

# 📚 Recommended Practice

Practice repeatedly:

* Build images
* Run containers
* Stop containers
* Inspect logs
* Debug failures
* Modify Dockerfiles

The more hands-on practice you do, the easier deployment concepts will become.

---

# 📜 License

This project is licensed under the GNU GPL-3.0 License.

Maintained by Aditya Pratap Bhuyan
LinkedIn: https://linkedin.com/in/adityabhuyan

---

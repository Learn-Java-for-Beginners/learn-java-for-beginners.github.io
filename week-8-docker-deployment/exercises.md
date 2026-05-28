---
layout: default
title: Exercises
parent: Week 8 - Docker & Deployment
nav_order: 4
---

# Week 8 - Exercises

# 📘 Introduction

These exercises are designed to strengthen your understanding of:

* Docker fundamentals
* Docker commands
* Dockerfiles
* Containerization concepts
* Spring Boot deployment
* Docker Compose
* Debugging containerized applications

Complete the exercises in sequence. The difficulty level increases gradually.

---

# 🧪 Exercise 1 - Verify Docker Installation

# Objective

Verify that Docker is installed correctly.

---

# Tasks

1. Install Docker Desktop or Docker Engine.
2. Verify installation using command:

```bash id="f5p1qg"
docker --version
```

3. Run:

```bash id="0e1u3y"
docker run hello-world
```

---

# Expected Outcome

You should see a successful hello-world message.

---

# 🧪 Exercise 2 - Explore Docker Commands

# Objective

Learn commonly used Docker commands.

---

# Tasks

Execute the following commands:

```bash id="f1s4h6"
docker ps
```

```bash id="r5s7m2"
docker ps -a
```

```bash id="j7l8k2"
docker images
```

```bash id="d8k9v1"
docker system info
```

---

# Questions

1. What is the difference between `docker ps` and `docker ps -a`?
2. What information does `docker images` provide?
3. Why is `docker system info` useful?

---

# 🧪 Exercise 3 - Run an Ubuntu Container

# Objective

Understand interactive containers.

---

# Tasks

Run Ubuntu container interactively:

```bash id="k3s9d2"
docker run -it ubuntu bash
```

Inside container:

```bash id="x9d2f4"
ls
```

```bash id="t2k5n8"
pwd
```

```bash id="w4l7c3"
cat /etc/os-release
```

Exit container:

```bash id="m1q7r9"
exit
```

---

# Questions

1. What does `-it` mean?
2. Why do containers stop after exiting terminal?
3. What operating system was running inside the container?

---

# 🧪 Exercise 4 - Run Nginx Container

# Objective

Understand port mapping.

---

# Tasks

Run Nginx:

```bash id="u6v3x1"
docker run -p 8080:80 nginx
```

Open browser:

```text id="j2r4v7"
http://localhost:8080
```

---

# Questions

1. Why does port mapping matter?
2. What happens if port 8080 is already in use?
3. What is the purpose of the Nginx image?

---

# 🧪 Exercise 5 - Create Your First Dockerfile

# Objective

Create a Docker image using Dockerfile.

---

# Tasks

Create file:

```text id="f7u3d2"
Dockerfile
```

Add:

```dockerfile id="e4m2n7"
FROM openjdk:17

WORKDIR /app

COPY app.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

# Questions

1. What is the purpose of `FROM`?
2. Why do we use `WORKDIR`?
3. What does `COPY` do?
4. What is the purpose of `ENTRYPOINT`?

---

# 🧪 Exercise 6 - Build Docker Image

# Objective

Build image from Dockerfile.

---

# Tasks

Execute:

```bash id="n8f6v1"
docker build -t my-java-app .
```

Verify image:

```bash id="q4k7m1"
docker images
```

---

# Questions

1. What does `-t` represent?
2. Why is `.` used at the end of build command?
3. What happens during image build?

---

# 🧪 Exercise 7 - Run Java Application Container

# Objective

Run Java application inside container.

---

# Tasks

Run image:

```bash id="r9x2z4"
docker run -p 8080:8080 my-java-app
```

Verify application accessibility.

---

# Questions

1. What does `8080:8080` represent?
2. Why should application expose correct port?
3. How can you stop running container?

---

# 🧪 Exercise 8 - View Logs

# Objective

Learn container debugging basics.

---

# Tasks

List running containers:

```bash id="y2k5n7"
docker ps
```

View logs:

```bash id="g6h8j1"
docker logs <container-id>
```

---

# Questions

1. Why are logs important?
2. What types of issues can logs help identify?
3. What happens if application crashes?

---

# 🧪 Exercise 9 - Execute Commands Inside Container

# Objective

Interact with running container.

---

# Tasks

Execute shell inside container:

```bash id="m3v8r2"
docker exec -it <container-id> bash
```

Run commands:

```bash id="v8d4s2"
ls
```

```bash id="h2m7x1"
pwd
```

Exit shell:

```bash id="s5j9n2"
exit
```

---

# Questions

1. Why is container access useful?
2. What debugging tasks can be done inside containers?
3. Why should production containers remain lightweight?

---

# 🧪 Exercise 10 - Run MySQL Container

# Objective

Run database using Docker.

---

# Tasks

Run MySQL container:

```bash id="w6x2c8"
docker run -d \
--name mysql-db \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD=password \
mysql:8
```

Verify container:

```bash id="d8m1s5"
docker ps
```

---

# Questions

1. What does `-d` mean?
2. Why are environment variables important?
3. What is the purpose of `MYSQL_ROOT_PASSWORD`?

---

# 🧪 Exercise 11 - Create docker-compose.yml

# Objective

Learn multi-container setup.

---

# Tasks

Create:

```text id="r4v8m3"
docker-compose.yml
```

Add:

```yaml id="p6q2x9"
version: '3'

services:

  app:
    image: my-java-app
    ports:
      - "8080:8080"

  mysql:
    image: mysql:8
    environment:
      MYSQL_ROOT_PASSWORD: password
```

---

# Run Compose

```bash id="u5j3n7"
docker compose up
```

---

# Questions

1. Why is Docker Compose useful?
2. What problem does Compose solve?
3. Why do microservices commonly use Docker Compose during development?

---

# 🧪 Exercise 12 - Debug Broken Configuration

# Objective

Practice troubleshooting.

---

# Tasks

Intentionally create issues:

* Wrong port mapping
* Incorrect database password
* Missing image
* Invalid Dockerfile instruction

Observe errors and fix them.

---

# Questions

1. What was the issue?
2. How did you identify the issue?
3. Which logs or commands helped?

---

# 🧠 Reflection Questions

1. Why is Docker important in backend engineering?
2. What advantages do containers provide?
3. How does Docker simplify deployment?
4. Why is containerization important in cloud-native systems?
5. What skills need more practice?

---

# ⭐ Optional Advanced Exercises

# Advanced Exercise 1

Use PostgreSQL instead of MySQL.

---

# Advanced Exercise 2

Push image to Docker Hub.

---

# Advanced Exercise 3

Add Spring Boot Actuator health endpoint.

---

# Advanced Exercise 4

Create separate development and production Docker configurations.

---

# 🎯 Learning Outcome

After completing these exercises, you should be able to:

* Work confidently with Docker
* Build containerized applications
* Run backend services in containers
* Understand deployment workflows
* Troubleshoot common container problems

---

# 📜 License

This project is licensed under the GNU GPL-3.0 License.

Maintained by Aditya Pratap Bhuyan
LinkedIn: https://linkedin.com/in/adityabhuyan

---

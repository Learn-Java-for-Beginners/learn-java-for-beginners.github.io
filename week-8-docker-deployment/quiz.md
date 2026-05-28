---
layout: default
title: Quiz
parent: Week 8 - Docker & Deployment
nav_order: 5
---

# Week 8 - Quiz

# 📘 Instructions

* Attempt all questions.
* Do not copy answers from the internet.
* Try to explain concepts in your own words.
* Some questions are conceptual while others are practical.
* Think like a backend engineer while answering.

---

# 🧠 Section 1 - Basic Concepts

# Question 1

What is Docker?

---

# Question 2

What problem does Docker solve in software development?

---

# Question 3

What is the difference between:

* Docker Image
* Docker Container

---

# Question 4

What is a Dockerfile?

---

# Question 5

What is Docker Hub?

---

# Question 6

Explain the difference between:

* Containers
* Virtual Machines

---

# Question 7

Why are containers considered lightweight?

---

# Question 8

What is port mapping in Docker?

---

# Question 9

Why are environment variables important in containerized applications?

---

# Question 10

What is Docker Compose?

---

# ⚙ Section 2 - Docker Commands

# Question 11

What does the following command do?

```bash id="x2v8m4"
docker ps
```

---

# Question 12

What is the difference between:

```bash id="y8q4n2"
docker ps
```

and

```bash id="r7m1k5"
docker ps -a
```

---

# Question 13

What does the following command do?

```bash id="p9w2d6"
docker images
```

---

# Question 14

Explain the purpose of:

```bash id="m4t7q1"
docker logs <container-id>
```

---

# Question 15

How do you stop a running container?

---

# Question 16

How do you remove a container?

---

# Question 17

How do you remove a Docker image?

---

# Question 18

What does the following command do?

```bash id="z5k1v8"
docker exec -it <container-id> bash
```

---

# 🏗 Section 3 - Dockerfile Understanding

# Question 19

Explain the purpose of the following instruction:

```dockerfile id="w7f3m2"
FROM openjdk:17
```

---

# Question 20

What does the following instruction do?

```dockerfile id="h4x8q6"
WORKDIR /app
```

---

# Question 21

What is the purpose of:

```dockerfile id="n8s5d1"
COPY target/app.jar app.jar
```

---

# Question 22

Why do we use:

```dockerfile id="j2m9p4"
EXPOSE 8080
```

---

# Question 23

Explain the purpose of:

```dockerfile id="q6t1v9"
ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

# Question 24

What happens when you execute:

```bash id="g8w3r5"
docker build -t my-app .
```

---

# 🌱 Section 4 - Spring Boot and Docker

# Question 25

Why are Spring Boot applications easy to containerize?

---

# Question 26

What is an executable JAR?

---

# Question 27

How can you access a Spring Boot application running inside Docker?

---

# Question 28

What happens if the application port is not mapped correctly?

---

# Question 29

Why are logs important while running Spring Boot applications in containers?

---

# 🗄 Section 5 - Database Containers

# Question 30

Why do developers run databases inside Docker containers?

---

# Question 31

What does the following command do?

```bash id="d9m6v2"
docker run -d \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD=password \
mysql:8
```

---

# Question 32

What is the purpose of:

```bash id="b2n7s5"
MYSQL_ROOT_PASSWORD
```

---

# Question 33

What problems can occur if the application cannot connect to the database container?

---

# 🔗 Section 6 - Docker Compose

# Question 34

Why is Docker Compose useful?

---

# Question 35

What is the purpose of `docker-compose.yml`?

---

# Question 36

Explain the purpose of:

```yaml id="m5x8k1"
depends_on
```

in Docker Compose.

---

# Question 37

What command is used to start services using Docker Compose?

---

# Question 38

What command is used to stop services started using Docker Compose?

---

# 🛠 Section 7 - Debugging and Troubleshooting

# Question 39

A container exits immediately after startup. What could be the possible reasons?

---

# Question 40

How can you inspect container logs?

---

# Question 41

What happens if two containers try to use the same host port?

---

# Question 42

How would you debug a failed Docker image build?

---

# Question 43

What should you check if APIs are not reachable from browser or Postman?

---

# 🚀 Section 8 - Real World Understanding

# Question 44

Why is Docker important in cloud-native development?

---

# Question 45

How does Docker help DevOps teams?

---

# Question 46

Why do microservices architectures commonly use containers?

---

# Question 47

What is the relationship between Docker and Kubernetes?

---

# Question 48

Why should developers understand deployment concepts?

---

# ⭐ Bonus Questions

# Bonus Question 1

Explain a real-world scenario where Docker simplifies software deployment.

---

# Bonus Question 2

What are some advantages of containerization over traditional deployment methods?

---

# Bonus Question 3

What additional technologies would you like to learn after Docker?

Examples:

* Kubernetes
* OpenShift
* CI/CD
* Helm
* Cloud Platforms

Explain why.

---

# 🧠 Reflection Questions

1. Which Docker concepts were easiest to understand?
2. Which areas need more practice?
3. What deployment-related problems did you face during exercises?
4. How confident are you with Docker now?
5. What would you like to explore next?

---

# 📜 License

This project is licensed under the GNU GPL-3.0 License.

Maintained by Aditya Pratap Bhuyan
LinkedIn: https://linkedin.com/in/adityabhuyan

---

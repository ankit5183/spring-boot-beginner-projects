# spring-boot-beginner-projects
This repository contains simple and practical Spring Boot projects for beginners. Each project is designed to demonstrate core features like REST APIs, CRUD operations, database integration (JPA/Hibernate), and more. Ideal for students, self-learners, and Java enthusiasts.
# 1 Simple Project in OneToMapping
This project demonstrates how to implement a One-to-Many relationship using an ORM (Object-Relational Mapping) framework like JPA/Hibernate, Spring Web, and H2 in Java.
A One-to-Many relationship means that one entity (e.g., a User) is related to many instances of another entity.
🛠 Technologies Used
Java 11+
Spring Boot (if applicable)
Hibernate / JPA
MySQL (or H2 for in-memory testing)
Maven or Gradle
# 2 Simple Website with Spring-boot
This project is a basic web application built using Spring Boot. It demonstrates how to set up a simple website with a homepage, basic routing, and optional static or dynamic content.
📦 Technologies Used
1.Java 17+
2.Spring Boot
3.Spring Web
4.Thymeleaf (for HTML templating)
5.Maven or Gradle
6.HTML/CSS (for frontend)
src/
├── main/
│   ├── java/
│   │   └── com/example/simplewebsite/
│   │       ├── controller/
│   │       │   └── WebCards.Application.java
│   │       └── SimpleWebsiteApplication.java
│   └── resources/
│       ├── static/         # CSS, JS, images
│       ├── templates/      # Thymeleaf HTML files
│       │   └── index.html
│       └── application.properties
└── test/ (optional)

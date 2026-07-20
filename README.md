# 🔐 JWT Authentication API

> A secure JWT Authentication REST API built using Spring Boot and Spring Security for user registration, login, and logout.

![Java](https://img.shields.io/badge/Java-24-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6.x-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-Authentication-blue?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven&logoColor=white)

---

# 📖 Overview

JWT Authentication API is a backend authentication system developed using **Spring Boot** and **Spring Security**.

The project demonstrates how user authentication works using REST APIs with secure password encryption and JWT-based authentication flow.

It provides APIs for user registration, login, and logout while following clean project structure and validation practices.

---

# ✨ Features

- 🔐 User Registration API
- 🔑 User Login API
- 🚪 User Logout API
- 🔒 Password Encryption using BCrypt
- ✅ Request Validation
- ⚡ RESTful API Architecture
- 📦 Layered Architecture
- 🛡️ Spring Security Integration
- 🎯 JWT Authentication
- 📄 JSON Request & Response
- 🚀 Maven Project Structure

---

# 📂 Project Structure

```text
src
│
├── config
├── controller
├── dto
├── entity
├── repository
├── security
├── service
└── resources
```

---

# 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Security
- JWT
- Spring Validation
- Maven
- Lombok

---

# 🔗 API Endpoints

## Register User

```
POST /auth/register
```

Registers a new user.

---

## Login User

```
POST /auth/login
```

Authenticates the user.

---

## Logout User

```
POST /auth/logout
```

Logs out the authenticated user.

---

# 📸 API Screenshots

## 📝 Register API

![](Screenshots/register-api.png)

---

## 🔑 Login API

![](Screenshots/login-api.png)

---

## 🚪 Logout API

![](Screenshots/logout-api.png)

---

# 📱 Validation

The project validates incoming requests using Jakarta Validation.

Examples include:

- Email Required
- Username Required
- Password Required

---

# 🚀 Future Improvements

This project can be extended with:

- Refresh Token Authentication
- Role Based Authorization
- Access Token Expiration
- Email Verification
- Forgot Password
- Reset Password
- Account Verification
- PostgreSQL Integration
- Swagger Documentation
- Docker Support
- Unit Testing
- Global Exception Handling
- Refresh Token Storage
- User Profile APIs

---

# ▶️ Getting Started

Clone Repository

```bash
git clone https://github.com/jeevan-kaware/jwt-authentication-spring-boot.git
```

Open Project

```bash
cd jwt-authentication-spring-boot
```

Run Application

```bash
mvn spring-boot:run
```

---

# 📬 API Testing

You can test the APIs using:

- Postman
- Thunder Client
- Insomnia

---

# 📄 License

This project is created for learning and educational purposes.

---

# 🤝 Connect With Me

**Jeevan Kaware**

💼 LinkedIn

https://www.linkedin.com/in/jeevan-kaware-080643355

---

⭐ If you found this project helpful, consider giving it a Star.

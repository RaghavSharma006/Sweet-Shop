# 🍬 Sweet Shop Management System

**Live Demo:** [https://sweet-shop-production-cb01.up.railway.app](https://sweet-shop-production-cb01.up.railway.app)

A full-stack **Sweet Shop Management System** built with **Spring Boot + JPA + MySQL** and a lightweight **HTML/CSS/JavaScript** frontend. The app is deployed on **Railway** and supports real-time CRUD operations on sweets.

---

## 🚀 Features

* Add new sweets with name, category, price, and quantity
* View all available sweets
* Purchase a sweet (auto-decrements quantity)
* Delete sweets
* Auto table creation using Hibernate
* Production deployment on Railway

---

## 🛠 Tech Stack

### Backend

* Java 21
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL (Railway Managed DB)

### Frontend

* HTML5
* CSS3
* Vanilla JavaScript (Fetch API)

### Deployment

* Railway (Backend + MySQL)

---

## 📂 Project Structure

```
├── controller
│   └── SweetController.java
├── model
│   └── Sweet.java
├── repository
│   └── SweetRepository.java
├── resources
│   └── static
│       └── index.html
│   └── application.properties
└── SweetshopApplication.java
```

---

## 🔗 API Endpoints

### Add Sweet

```
POST /api/sweets
```

```json
{
  "name": "Rasgulla",
  "category": "Milk Sweet",
  "price": 25,
  "quantity": 10
}
```

### Get All Sweets

```
GET /api/sweets
```

### Purchase Sweet

```
POST /api/sweets/{id}/purchase
```

### Delete Sweet

```
DELETE /api/sweets/{id}
```

---

## 🧠 Key Learnings

* Correct usage of `@RequestBody` with JSON binding
* Avoiding browser global variable conflicts (`window.name`)
* Debugging frontend vs backend data flow
* Railway environment variable handling
* JDBC URL construction for cloud databases

---

## ⚠ Common Pitfalls Solved

* ❌ Using `mysql://` instead of `jdbc:mysql://`
* ❌ Railway env-var chaining
* ❌ Cached static files in production
* ❌ JavaScript reserved variable names

---

## 🧪 Run Locally

```bash
mvn spring-boot:run
```

Visit:

```
http://localhost:8080
```

---

## 👨‍💻 Author

**Raghav Sharma**
Final-year B.Tech CSE student passionate about Java, backend systems, and scalable applications.

---

## ⭐ Final Note

This project demonstrates end-to-end backend development, frontend integration, and real-world cloud deployment using Java and Spring Boot.

If you like it, feel free to ⭐ the repo!

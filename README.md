#  Task Manager API

A simple Spring Boot REST API for managing tasks, supporting operations like create, update, retrieve, and delete. Built with Java 17, Spring Boot 3, H2 in-memory database, and follows RESTful design principles.

---

##  Features

-  Create new tasks
-  Get all or individual task by ID
-  Update existing tasks
-  Delete tasks
-  Validation and global exception handling
-  Postman collection for testing

---

##  Tech Stack

- Java 17
- Spring Boot 3.5.x
- Spring Data JPA
- H2 In-Memory Database
- Hibernate ORM
- Maven

---

##  Getting Started

###  Prerequisites

- Java 17+
- Maven

### ▶ Run the Project


mvn spring-boot:run

The app starts on: http://localhost:8080

 API Endpoints
 Create Task
POST /api/tasks

json
Copy
Edit
{
  "title": "Complete Spring Boot Assignment",
  "description": "Build a task management API",
  "status": "PENDING",
  "priority": "HIGH",
  "dueDate": "2025-07-25"
}
Returns: 201 Created

 Create Task (Invalid)
POST /api/tasks

json
Copy
Edit
{
  "title": "Hi",
  "description": "",
  "status": "INVALID_STATUS"
}
Returns: 400 Bad Request with validation messages


 Get All Tasks
GET /api/tasks

Returns: 200 OK with array of tasks

 Get Task by ID
GET /api/tasks/{id}

Returns: 200 OK or 404 Not Found if task doesn't exist

 Update Task
PUT /api/tasks/{id}

json
Copy
Edit
{
  "title": "Updated Task Title",
  "description": "Updated Description",
  "status": "COMPLETED",
  "priority": "MEDIUM",
  "dueDate": "2025-09-01"
}
Returns: 200 OK

 Delete Task
DELETE /api/tasks/{id}

Returns: 204 No Content or 404 Not Found



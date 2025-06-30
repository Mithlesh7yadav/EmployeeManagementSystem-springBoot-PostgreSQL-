# EmployeeManagementSystem-springBoot-PostgreSQL(WEEK2 Task)  

# 🧑‍💼 Employee Management System (Spring Boot + PostgreSQL)

This is a simple **Employee Management System** built using **Spring Boot**, **Spring Data JPA**, **PostgreSQL**, **Lombok**, and **Java Validation**. It supports basic CRUD operations for Employees and Manager-Team relationships.

---

## 🚀 Features

- Add, update, delete, and retrieve employees
- Assign employees to a manager
- View a manager's team
- Input validation using `jakarta.validation`
- Global exception handling with `@ControllerAdvice`
- Clean code with Lombok annotations
- Configurable database using environment variables

---

## 🧰 Tech Stack

- Java 8
- Spring Boot 3+
- Spring Data JPA
- PostgreSQL
- Lombok
- Jakarta Validation
- Postman (for API testing)

---

## 🛠️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/employee-management-system.git
cd employee-management-system

2. Configure the Database
Create a PostgreSQL database (e.g., ems_db) and configure your credentials using environment variables or directly in application.properties.

# src/main/resources/application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ems_db
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

📮 API Endpoints
👥 EmployeeController
Method	  Endpoint	          Description
POST	   /employees	          Add a new employee
GET	     /employees	          List all employees
GET	     /employees/{id}	    Get employee by ID
PUT	     /employees/{id}	      Update employee by ID
DELETE 	/employees/{id}    	Delete employee by ID

🧑‍💼 ManagerController
Method	 Endpoint	               Description
POST	   /managers	             Create new manager
GET	     /managers/{id}/team	   Get manager and their team

-------------------------------------------------------------------------------------------

📦 Sample JSON Payloads
➕ Add Employee
json
{
  "name": "John Doe",
  "age": 30,
  "department": "IT",
  "salary": 55000
}

+Add Manager
json
{
  "name": "Sarah Lee",
  "salary": 75000
}


---------------------------------------------------------------------------------------------
⚠️ Exception Handling
----------------------
Handled using @ControllerAdvice:

ResourceNotFoundException for not found errors

Global Exception handler for server errors

📌 Best Practices
---------------------
Passwords and credentials are never committed to version control

Use @Valid for input validation

RESTful APIs follow naming conventions

-----------------------------------------------------------------------------------------------

📁 Project Structure
pgsql
Copy
Edit
com.EMS
├── controller
├── entity
├── exception
├── repository
├── service
└── EmployeeManagementSystemApplication.java



# DTO Projection API

This repository contains a Spring Boot application that demonstrates the use of DTO (Data Transfer Object) projection by using Quary in `AttendanceRepository` an show only selected fields when searched by retrieving data from a database. The application includes an `AttendanceController` for handling HTTP requests, an `Attendance` entity class representing the database table, an `AttendanceDto` for declaring the fields that wants to be shown, and an `AttendanceRepository` for data access and queary command.

## Features

- Save attendance data to the database
- Retrieve all attendance records
- Retrieve partial attendance record by ID
- Retrieve partial attendance record by name

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- postgreSQL Database (for testing purposes)
- Maven

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/your-repo-name.git
   cd your-repo-name
2. Build the project:
   ```sh
     mvn clean install
3. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: '/test'

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save Attendance
- URL: '/save'
- Method: POST
- Description: Save a new attendance record to the database
- Request Body: json in postman
  ```sh
    {
    "name": "John Doe",
    "std": 10,
    "rollno": 25
    }

3. Get All Attendance Records
- URL: '/all'
- Method: GET
- Description: Retrieve all attendance records from the database
- Response: A list of Attendance objects
  
4. Get Attendance by ID
- URL: '/id/{id}'
- Method: GET
- Description: Retrieve an attendance record by its ID
- Response: An AttendanceDto object
5. Get Attendance by Name
- URL: '/name/{name}'
- Method: GET
- Description: Retrieve an attendance record by name
- Response: An AttendanceDto object



# Spring Boot MVC Layered Architecture

This Spring Boot project demonstrates a basic structure with components such as a Controller, Service, Repository, and performs integration as well as unit testing using MockMvc and TestRestTemplate.

### Key Concepts Covered

**1. Basic Spring Boot Application Structure**

**2. Dependency Injection using @Autowired Annotation**

**3. RESTful API Development and Usage using @RestController and @RequestMapping**

## Project Structure

**1. Controller (GreetingController):**  The GreetingController is responsible for handling the /api/greet endpoint. It communicates with the GreetingService to fetch the appropriate greeting message.

**2. Service (GreetingService):** Contains business logic.

**3. Repository (GreetingRepository):** Fetches data from a database or other source.For this project, it returns a hardcoded message.

**4. Application:** This is the main class that launches the Spring Boot application. It also includes a CommandLineRunner bean that inspects all the beans created by Spring Boot at startup.

**5. Tests:** Integration and unit tests for the Controller and Service layers.

**5.a. Integration Tests:** Using TestRestTemplate to test the API endpoints.

**5.b. Unit Tests:** Using MockMvc to simulate HTTP requests and validate responses.

## Getting Started

### 1. Clone the Repository

```
git clone https://github.com/NidhiYadav726/SpringBoot_JPADemo.git
```

### 2. Build the project

```
mvn clean install
```

## Executing the Project

### 1. Start the SpringBoot Application

```
mvn spring-boot:run
```
### 2. Access the API
Once the application is running, open a browser and navigate to:

```
http://localhost:8080/api/greet
```
The message "Welcome to Spring Boot!" should be displayed.

## Tools and Technologies Used

**1. Spring Boot:** For building the application.

**2. Maven:** For managing dependencies.

**3. MockMvc:** For simulating HTTP requests in unit tests.

**4. TestRestTemplate:** For integration testing.

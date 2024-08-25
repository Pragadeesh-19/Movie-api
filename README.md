# Spring Boot Movies API

This is a RESTful API for Movie review system built with Spring Boot, providing basic operations for managing movie reviews.

## Features

- List all the movies 
- Retrieve a single movie by imdbId
- Create new movies
- write reviews for a movie with imdbId

## API Endpoints

- GET /api/v1/movies - List all movies
- GET /api/v1/movies/create - create a movie with imdbId
- POST /api/v1/movies/{imdbId} - Retrieve a movie with imdbId
- POST /api/v1/movies/{imdbId}/review - create a review for a movie

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

### Prerequisites

- JDK 17 or later
- Maven
- PostgreSQL

## Getting Started

  ### 1. Clone the Repository
    git clone https://github.com/yourusername/expense-tracker-api.git
    cd expense-tracker-api

  ### 2. Configure Database
    spring.datasource.url=jdbc:postgresql://localhost:5432/expensetracker
    spring.datasource.username=your_db_username
    spring.datasource.password=your_db_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
  ### 3. Build the project
    mvn clean install

  ### 4. Run the application
    mvn spring-boot:run

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

- JDK 11 or later
- Maven
- PostgreSQL

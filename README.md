# Spring Boot Movies API

This is a RESTful API for a movie review system built with Spring Boot. It allows for managing movie information and reviews.

## Features

- **List All Movies**: Retrieve a list of all movies in the system.
- **Retrieve Movie by IMDb ID**: Get details of a specific movie using its IMDb ID.
- **Create New Movies**: Add new movies to the system with a unique IMDb ID.
- **Write Reviews for Movies**: Submit reviews for a movie identified by its IMDb ID.

## API Endpoints

- **List All Movies**
  - `GET /api/v1/movies` - Retrieve a list of all movies.
- **Create New Movie**
  - `POST /api/v1/movies/create` - Add a new movie with IMDb ID and other details.
- **Retrieve Movie by IMDb ID**
  - `GET /api/v1/movies/{imdbId}` - Retrieve a movie by its IMDb ID.
- **Write Review for Movie**
  - `POST /api/v1/movies/{imdbId}/review` - Submit a review for a movie using its IMDb ID.

## Technologies Used

- **Java**: Programming language used for backend development.
- **Spring Boot**: Framework for building the RESTful API.
- **Spring Data JPA**: ORM framework for data access and persistence.
- **PostgreSQL**: Database for storing movie and review data.
- **Maven**: Build tool used for project management.

## Prerequisites

- **JDK 22**
- **Maven**
- **PostgreSQL**

### Installation

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/Pragadeesh-19/Movie-api.git
    cd Movie-api
    ```

2. **Configure the Database**

    Create a PostgreSQL database and update the `application.properties` file with your database credentials:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/movieapi
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    ```

3. **Build and Run the Application:**

    Using Maven:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```


### Testing

Use Postman to test the API endpoints. Import the provided Postman collection (if available) for pre-defined tests.

### Contributing

Contributions are welcome! Please open an issue or submit a pull request for any changes or enhancements.

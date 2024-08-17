package org.pragadeesh.movieapi.repository;

import org.pragadeesh.movieapi.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    Optional<Movie> findMovieByImdbId(String imdbId);
}

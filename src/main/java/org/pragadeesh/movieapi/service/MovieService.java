package org.pragadeesh.movieapi.service;

import org.pragadeesh.movieapi.dto.MovieDto;
import org.pragadeesh.movieapi.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {

    public List<Movie> findAllMovies();

    public Optional<Movie> findMovieByImdbId(String imdbId);

    public Movie createMovie(MovieDto movieDto);

}

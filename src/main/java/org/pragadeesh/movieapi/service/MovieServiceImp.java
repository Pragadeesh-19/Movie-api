package org.pragadeesh.movieapi.service;

import org.pragadeesh.movieapi.dto.MovieDto;
import org.pragadeesh.movieapi.model.Movie;
import org.pragadeesh.movieapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovieServiceImp implements MovieService{

    private final MovieRepository movieRepository;
    @Autowired
    public MovieServiceImp(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }

    @Override
    public Movie createMovie(MovieDto movieDto) {
        Movie movie = new Movie(
                movieDto.getImdbId(),
                movieDto.getTitle(),
                movieDto.getReleaseDate(),
                movieDto.getTrailerLink(),
                movieDto.getPoster(),
                movieDto.getBackdrops(),
                movieDto.getGenres()
        );

        return movieRepository.save(movie);
    }


}

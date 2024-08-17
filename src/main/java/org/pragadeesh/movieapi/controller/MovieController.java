package org.pragadeesh.movieapi.controller;

import org.pragadeesh.movieapi.dto.MovieDto;
import org.pragadeesh.movieapi.model.Movie;
import org.pragadeesh.movieapi.service.MovieServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class MovieController {

    private final MovieServiceImp movieServiceImp;
    @Autowired
    public MovieController(MovieServiceImp movieServiceImp) {
        this.movieServiceImp = movieServiceImp;
    }

    @PostMapping("/movies/create")
    public ResponseEntity<Movie> createMovie(@RequestBody MovieDto movieDto) {
        return new ResponseEntity<Movie>(movieServiceImp.createMovie(movieDto), HttpStatus.CREATED);
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getMovies() {
        return new ResponseEntity<List<Movie>>(movieServiceImp.findAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/movies/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>>(movieServiceImp.findMovieByImdbId(imdbId), HttpStatus.OK);
    }
}

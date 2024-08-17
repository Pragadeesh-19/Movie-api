package org.pragadeesh.movieapi.service;

import org.pragadeesh.movieapi.dto.ReviewDto;
import org.pragadeesh.movieapi.model.Movie;
import org.pragadeesh.movieapi.model.Review;
import org.pragadeesh.movieapi.repository.MovieRepository;
import org.pragadeesh.movieapi.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ReviewServiceImp implements ReviewService{

    private final MovieRepository movieRepository;
    private final ReviewRepository reviewRepository;
    @Autowired
    public ReviewServiceImp(MovieRepository movieRepository, ReviewRepository reviewRepository) {
        this.movieRepository = movieRepository;
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review createReview(String imdbId, ReviewDto reviewDto) {

        Optional<Movie> findMovie = movieRepository.findMovieByImdbId(imdbId);

        if(findMovie.isPresent()) {
            Movie movie = findMovie.get();
            Review review = new Review(
                    reviewDto.getBody(),
                    LocalDateTime.now(),
                    LocalDateTime.now(),
                    movie
            );
            return reviewRepository.save(review);
        } else {
            throw new RuntimeException("Movie is not found with imdbId " + imdbId);
        }
    }
}

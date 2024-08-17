package org.pragadeesh.movieapi.service;

import org.pragadeesh.movieapi.dto.ReviewDto;
import org.pragadeesh.movieapi.model.Review;
import org.springframework.stereotype.Service;

@Service
public interface ReviewService {

    public Review createReview(String imdbId, ReviewDto reviewDto);
}

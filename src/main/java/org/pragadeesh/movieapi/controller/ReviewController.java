package org.pragadeesh.movieapi.controller;

import org.pragadeesh.movieapi.dto.ReviewDto;
import org.pragadeesh.movieapi.model.Review;
import org.pragadeesh.movieapi.service.ReviewServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movies")
public class ReviewController {

    private final ReviewServiceImp reviewServiceImp;
    @Autowired
    public ReviewController(ReviewServiceImp reviewServiceImp) {
        this.reviewServiceImp = reviewServiceImp;
    }

    @PostMapping("/{imdbId}/review")
    public ResponseEntity<Review> createReview(@PathVariable String imdbId,
                                               @RequestBody ReviewDto reviewDto) {
        Review createdReview = reviewServiceImp.createReview(imdbId, reviewDto);
        return new ResponseEntity<Review>(createdReview, HttpStatus.CREATED);

    }
}

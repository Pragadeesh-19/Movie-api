package org.pragadeesh.movieapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String body;

    private LocalDateTime createdAt;
    private LocalDateTime updated;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    public Review(String body, LocalDateTime createdAt, LocalDateTime updated, Movie movie) {
        this.body = body;
        this.createdAt = createdAt;
        this.updated = updated;
        this.movie = movie;
    }
}

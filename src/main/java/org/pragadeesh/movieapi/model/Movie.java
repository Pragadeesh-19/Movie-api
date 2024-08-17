package org.pragadeesh.movieapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String imdbId;

    @Column(nullable = false)
    private String title;

    private String releaseDate;
    private String trailerLink;
    private String poster;

    @ElementCollection
    @CollectionTable(name = "movie_backdrop", joinColumns = @JoinColumn(name = "movie_id"))
    @Column(name = "backdrop")
    private List<String> backdrops;

    @ElementCollection
    @CollectionTable(name = "movie_genres", joinColumns = @JoinColumn(name = "movie_id"))
    @Column(name = "genres")
    private List<String> genres;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;


    public Movie(String imdbId,
                 String title,
                 String releaseDate,
                 String trailerLink,
                 String poster,
                 List<String> backdrops,
                 List<String> genres) {

        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.backdrops = backdrops;
        this.genres = genres;

    }
}


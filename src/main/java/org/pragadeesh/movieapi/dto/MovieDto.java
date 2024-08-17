package org.pragadeesh.movieapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class MovieDto {

    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> genres;

}

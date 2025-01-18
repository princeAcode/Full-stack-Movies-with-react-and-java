package com.premichit.fullstackmovieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;

    public List<Movie> getAllMovies() {
        return repository.findAll();
    }
    public Movie getMovieById(String imdbId) {
        return repository.findByImdbId(imdbId);
    }

}

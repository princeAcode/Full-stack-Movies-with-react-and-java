package com.premichit.fullstackmovieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private MovieRepository movieRepository;
    @Autowired
    public MovieService(MovieRepository movieRepository) {
        System.out.println(movieRepository.findAll());
        this.movieRepository = movieRepository;

    }
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}

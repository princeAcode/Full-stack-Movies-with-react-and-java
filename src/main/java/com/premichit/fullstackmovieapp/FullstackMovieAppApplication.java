package com.premichit.fullstackmovieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FullstackMovieAppApplication implements CommandLineRunner {

    @Autowired
    private MovieRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(FullstackMovieAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Movies in database: " + repository.findAll());
    }
}

package com.premichit.fullstackmovieapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    public String getAllMovies(){
        return "All movies";
    }

}

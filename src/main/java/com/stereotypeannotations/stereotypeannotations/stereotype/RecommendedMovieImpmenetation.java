package com.stereotypeannotations.stereotypeannotations.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecommendedMovieImpmenetation {

    @Autowired
    private Filter filter ;

    public RecommendedMovieImpmenetation(){

    }


    public RecommendedMovieImpmenetation(Filter filter){
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {

        this.filter = filter;
    }

    public String [] recommendMovie(String movie){
        System.out.println("Checking the filter names in usage:" + filter + "\n");

        String[] resultMovies = filter.getRecommendations("ET");

        return resultMovies;


    }



}

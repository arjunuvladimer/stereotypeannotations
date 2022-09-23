package com.stereotypeannotations.stereotypeannotations;

import com.stereotypeannotations.stereotypeannotations.stereotype.RecommendedMovieImpmenetation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class StereotypeannotationsApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(StereotypeannotationsApplication.class);


		RecommendedMovieImpmenetation recommender = appContext.getBean(RecommendedMovieImpmenetation.class, args);

		String[] movies = recommender.recommendMovie("ET");

		System.out.println(Arrays.toString(movies));



	}

}

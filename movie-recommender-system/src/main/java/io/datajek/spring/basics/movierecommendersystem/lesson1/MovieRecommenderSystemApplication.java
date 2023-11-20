package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//create object of RecommenderImplementation class
		RecommenderImplementation recommender = new RecommenderImplementation();

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display res
		System.out.println(Arrays.toString(result));
	}

}

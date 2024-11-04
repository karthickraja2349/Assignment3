package com.constructors;

import com.ClassesAndObjects.MovieDTO;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    
    private List<MovieDTO> movies;

    
    public MovieManager() {
        movies = new ArrayList<>();
    }

 
    public void addMovie(String title, String genre, String director, int releaseYear, double rating,
                         int duration, String language, double boxOfficeGross) {
        MovieDTO movie = new MovieDTO(title, genre, director, releaseYear, rating, duration, language, boxOfficeGross);
        movies.add(movie);
        System.out.println("Movie added successfully.");
    }

 
    public void displayMovies() {
        System.out.println("\nMovie List:");
        for (MovieDTO movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("\nTotal movies added: " + MovieDTO.getMovieCount());
    }

    
    public static void main(String[] args) {
        MovieManager manager = new MovieManager();
        manager.addMovie("pirates of the carribean", "Sci-Fi", "Christopher Nolan", 2010, 8.8, 148, "English", 836.8);
        manager.addMovie("Bridge to terribhithia", "Crime", "Francis Ford Coppola", 1972, 9.2, 175, "English", 246.1);
        manager.addMovie("jurassic park", "Thriller", "Bong Joon-ho", 2019, 8.6, 132, "Korean", 257.6);
        manager.displayMovies();
    }
}


package com.ClassesAndObjects;
public class MovieDTO {

    private static int movieCount = 0;

    private String title;
    private String genre;
    private String director;
    private int releaseYear;
    private double rating;
    private int duration; // in minutes
    private String language;
    private double boxOfficeGross;

    public MovieDTO(String title, String genre, String director, int releaseYear, double rating,
                    int duration, String language, double boxOfficeGross) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.duration = duration;
        this.language = language;
        this.boxOfficeGross = boxOfficeGross;
        movieCount++;
    }

    public static int getMovieCount() {
        return movieCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getBoxOfficeGross() {
        return boxOfficeGross;
    }

    public void setBoxOfficeGross(double boxOfficeGross) {
        this.boxOfficeGross = boxOfficeGross;
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------------------------\n")
          .append(String.format("| %-20s : %-25s|\n", "Title", getTitle()))
          .append(String.format("| %-20s : %-25s|\n", "Genre", getGenre()))
          .append(String.format("| %-20s : %-25s|\n", "Director", getDirector()))
          .append(String.format("| %-20s : %-25d|\n", "Release Year", getReleaseYear()))
          .append(String.format("| %-20s : %-25.1f|\n", "Rating", getRating()))
          .append(String.format("| %-20s : %-25d|\n", "Duration (min)", getDuration()))
          .append(String.format("| %-20s : %-25s|\n", "Language", getLanguage()))
          .append(String.format("| %-20s : %-25.2f|\n", "Box Office Gross", getBoxOfficeGross()))
          .append("--------------------------------------------------------");
        return sb.toString();
    }
}

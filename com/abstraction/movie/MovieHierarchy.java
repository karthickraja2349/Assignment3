package movie;
public class MovieHierarchy {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];

        movies[0] = new RomComMovie("Love Today", "Pradeep Ranganathan", 2022, 8);
        movies[1] = new ThrillerMovie("Vikram", "Lokesh Kanagaraj", 2022, 9);
        movies[2] = new RomComMovie("Dharala Prabhu", "Mathi Maran", 2020, 7);

        for (Movie movie : movies) {
            movie.displayInfo();
        }
    }
}


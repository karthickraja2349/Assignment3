package movie;
public class ThrillerMovie extends Movie {
    private int suspenseLevel;

    public ThrillerMovie(String title, String director, int releaseYear, int suspenseLevel) {
        super(title, director, releaseYear);
        this.suspenseLevel = suspenseLevel;
    }

    @Override
    public void displayInfo() {
        System.out.println("Thriller Movie:");
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Release Year: " + getReleaseYear());
        System.out.println("Suspense Level: " + suspenseLevel);
        System.out.println();
    }
}

package movie;
public class RomComMovie extends Movie {
    private int romanticLevel;

    public RomComMovie(String title, String director, int releaseYear, int romanticLevel) {
        super(title, director, releaseYear);
        this.romanticLevel = romanticLevel;
    }

    @Override
    public void displayInfo() {
        System.out.println("Romantic Comedy Movie:");
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Release Year: " + getReleaseYear());
        System.out.println("Romantic Level: " + romanticLevel);
        System.out.println();
    }
}

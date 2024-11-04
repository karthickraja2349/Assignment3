package constructors;
import com.ClassesAndObjects.BookDTO;

public class BookManager {

    private BookDTO[] books;
    private int count;

    public BookManager(int capacity) {
        books = new BookDTO[capacity];
        count = 0;
    }

    
    public void addBook(String title, String isbn, String author, String publisher, double price) {
        if (count < books.length) {
            books[count] = new BookDTO(title, isbn, author, publisher, price);
            count++;
        } 
        else {
            System.out.println("Cannot add more books. Array is full.");
        }
    }

 
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books to display.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager(3);
        manager.addBook("பொன்னியின் செல்வன்", "978-8120602376", "கல்கி கிருஷ்ணமூர்த்தி", "Vanathi Pathipagam", 350.00);
        manager.addBook("திருக்குறள்", "978-0144000096", "திருவள்ளுவர்", "Penguin India", 200.00);
        manager.addBook("சிலப்பதிகாரம்", "978-8170200253", "இளங்கோ அடிகள்", "Sura Books", 150.00);
        manager.displayBooks();
        System.out.println("\nTotal books added: " + BookDTO.getBookCount());
    }
}


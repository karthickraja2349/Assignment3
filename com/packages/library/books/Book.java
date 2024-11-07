package library.books;
public class Book{

    private static int bookCount = 0;

    private String title;
    private String isbn;
    private String author;
    private String publisher;
    private double price;
    

    public Book(String title, String isbn, String author, String publisher, double price) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        bookCount++;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public String toString() {
        StringBuilder book = new StringBuilder();
        book.append("--------------------------------------------------------\n")
          .append(String.format("| %-20s : %-25s|\n", "Title", getTitle()))
          .append(String.format("| %-20s : %-25s|\n", "ISBN", getIsbn()))
          .append(String.format("| %-20s : %-25s|\n", "Author", getAuthor()))
          .append(String.format("| %-20s : %-25s|\n", "Publisher", getPublisher()))
          .append(String.format("| %-20s : %-25.2f|\n", "Price", getPrice()))
          .append("--------------------------------------------------------");
        return book.toString();
    }
}

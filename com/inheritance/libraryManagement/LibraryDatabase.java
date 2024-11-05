package libraryManagement;
import java.util.List;
import java.util.ArrayList;
public class LibraryDatabase {

    private List<Book> listOfBooks;

    
    public LibraryDatabase() {
        listOfBooks = new ArrayList<>();
    }


    public void add(Book book) {
        listOfBooks.add(book);
    }

    public void delete(Book book) {
        listOfBooks.remove(book);
    }

    public void update(Book book) {
      
    }

    public void display() {
       
    }

    public void search(String searchString) {
        
    }
    
    public List<Book> getListOfBooks(){
          return listOfBooks;
    }      
}

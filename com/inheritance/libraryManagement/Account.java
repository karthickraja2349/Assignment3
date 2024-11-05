package libraryManagement;
public class Account {
    
    private int noOfBorrowedBooks;
    private int noOfReservedBooks;
    private int noOfReturnedBooks;
    private int noOfLostBooks;
    private double fineAmount;

  
    public void calculateFine() {
      
    }
    
    public int getNoOfBorrowedBooks(){
         return noOfBorrowedBooks;
    }
    
    public int getNoOfReservedBooks(){
         return noOfReservedBooks;
    }
    
    public int getNoOfReturnedBooks(){
        return noOfReturnedBooks;
    }
    
    public int getNoOfLostBooks(){
        return noOfLostBooks;
    }
    
    public double getFineAmount(){
         return  fineAmount;
    }                      
}

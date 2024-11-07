package library.transactions;

import library.books.Book;
import library.members.Member;
import java.util.Date;

public class Transaction {
    private static int transactionCount = 0; 

    private String transactionID;
    private Member member;
    private Book book;
    private String transactionType; // "notreturn" or "Return"
    private Date transactionDate;

    public Transaction(Member member, Book book, String transactionType) {
        this.member = member;
        this.book = book;
        this.transactionType = transactionType;
        this.transactionDate = new Date(); 
        this.transactionID = generateTransactionID();
        transactionCount++; 
    }

    
    private String generateTransactionID() {
        return "TXN" + String.format("%05d", transactionCount + 1); // TXN00001, TXN00002, etc.
    }

  
    public String getTransactionID() {
        return transactionID;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void displayTransactionInfo() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Member Info: " + member);
        System.out.println("Book Info: " + book);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Transaction Date: " + transactionDate);
    }

   
    public String toString(){
        StringBuilder transaction = new StringBuilder();
        transaction.append("--------------------------------------------------------\n")
          .append(String.format("| %-20s : %-25s|\n", "Transaction ID", getTransactionID()))
          .append(String.format("| %-20s : %-25s|\n", "Member ID", member.getMemberID()))
          .append(String.format("| %-20s : %-25s|\n", "Member Name", member.getMemberName()))
          .append(String.format("| %-20s : %-25s|\n", "Book ID", book.getIsbn()))
          .append(String.format("| %-20s : %-25s|\n", "Book Title", book.getTitle()))
          .append(String.format("| %-20s : %-25s|\n", "Transaction Type", getTransactionType()))
          .append(String.format("| %-20s : %-25s|\n", "Transaction Date", getTransactionDate()))
          .append("--------------------------------------------------------");
        return transaction.toString();
    }

    
    public static int getTransactionCount() {
        return transactionCount;
    }
}


import java.io.Serializable;
import java.time.LocalDateTime;

public class Transaction implements Serializable {
    private static int transactionCounter = 1;
    private int transactionId;
    private User user;
    private Book book;
    private LocalDateTime borrowDate;
    private LocalDateTime returnDate;

    public Transaction(User user, Book book) {
        this.transactionId = transactionCounter++;
        this.user = user;
        this.book = book;
        this.borrowDate = LocalDateTime.now();
        this.returnDate = null;
    }

    public void setReturnDate() {
        this.returnDate = LocalDateTime.now();
    }

    // Getters
    public int getTransactionId() {
        return transactionId;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    @Override
    public String toString() {
        String returnDateStr = returnDate != null ? returnDate.toString() : "Not returned yet";
        return String.format("Transaction ID: %d\nUser: %s\nBook: %s\nBorrow Date: %s\nReturn Date: %s",
                transactionId, user.getName(), book.getTitle(), borrowDate, returnDateStr);
    }
} 
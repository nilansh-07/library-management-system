import java.io.Serializable;

public class Book implements Serializable {
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private int quantity;

    public Book(int bookId, String title, String author, String publisher, int quantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String getDetails() {
        return String.format("Book ID: %d\nTitle: %s\nAuthor: %s\nPublisher: %s\nAvailable Quantity: %d",
                bookId, title, author, publisher, quantity);
    }

    public void updateQuantity(int change) {
        this.quantity += change;
    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return getDetails();
    }
} 
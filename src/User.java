import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private int userId;
    private String name;
    private String role; // "ADMIN" or "STUDENT"
    private List<Book> borrowedBooks;

    public User(int userId, String name, String role) {
        this.userId = userId;
        this.name = name;
        this.role = role.toUpperCase();
        this.borrowedBooks = new ArrayList<>();
    }

    public void viewBooks(Library library) {
        library.listAllBooks();
    }

    public boolean borrowBook(Library library, int bookId) {
        Book book = library.borrowBook(this, bookId);
        if (book != null) {
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    public boolean returnBook(Library library, int bookId) {
        for (Book book : borrowedBooks) {
            if (book.getBookId() == bookId) {
                if (library.returnBook(this, bookId)) {
                    borrowedBooks.remove(book);
                    return true;
                }
            }
        }
        return false;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public boolean isAdmin() {
        return role.equals("ADMIN");
    }

    @Override
    public String toString() {
        return String.format("User ID: %d\nName: %s\nRole: %s", userId, name, role);
    }
} 
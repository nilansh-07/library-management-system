import java.io.*;
import java.util.*;

public class Library {
    private List<Book> books;
    private Map<User, List<Book>> borrowedBooks;
    private List<Transaction> transactions;
    private static final String BOOKS_FILE = "books.dat";
    private static final String TRANSACTIONS_FILE = "transactions.dat";

    public Library() {
        this.books = new ArrayList<>();
        this.borrowedBooks = new HashMap<>();
        this.transactions = new ArrayList<>();
        loadData();
    }

    public void addBook(Book book) {
        books.add(book);
        saveData();
    }

    public boolean removeBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                books.remove(book);
                saveData();
                return true;
            }
        }
        return false;
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("\n=== Library Catalog ===");
        for (Book book : books) {
            System.out.println(book.getDetails() + "\n");
        }
    }

    public Book borrowBook(User user, int bookId) {
        if (!user.isAdmin()) {
            for (Book book : books) {
                if (book.getBookId() == bookId && book.getQuantity() > 0) {
                    book.updateQuantity(-1);
                    borrowedBooks.computeIfAbsent(user, k -> new ArrayList<>()).add(book);
                    Transaction transaction = new Transaction(user, book);
                    transactions.add(transaction);
                    saveData();
                    return book;
                }
            }
        }
        return null;
    }

    public boolean returnBook(User user, int bookId) {
        List<Book> userBorrowedBooks = borrowedBooks.get(user);
        if (userBorrowedBooks != null) {
            for (Book book : userBorrowedBooks) {
                if (book.getBookId() == bookId) {
                    book.updateQuantity(1);
                    userBorrowedBooks.remove(book);
                    if (userBorrowedBooks.isEmpty()) {
                        borrowedBooks.remove(user);
                    }
                    
                    // Update transaction
                    for (Transaction t : transactions) {
                        if (t.getUser().equals(user) && t.getBook().getBookId() == bookId && t.getReturnDate() == null) {
                            t.setReturnDate();
                            break;
                        }
                    }
                    
                    saveData();
                    return true;
                }
            }
        }
        return false;
    }

    public List<Book> getBorrowedBooks(User user) {
        return borrowedBooks.getOrDefault(user, new ArrayList<>());
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BOOKS_FILE))) {
            oos.writeObject(books);
        } catch (IOException e) {
            System.err.println("Error saving books: " + e.getMessage());
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(TRANSACTIONS_FILE))) {
            oos.writeObject(transactions);
        } catch (IOException e) {
            System.err.println("Error saving transactions: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(BOOKS_FILE))) {
            books = (List<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            books = new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TRANSACTIONS_FILE))) {
            transactions = (List<Transaction>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            transactions = new ArrayList<>();
        }
    }
} 
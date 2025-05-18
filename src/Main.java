import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static Library library;
    private static User currentUser;
    private static Scanner scanner;

    public static void main(String[] args) {
        library = new Library();
        scanner = new Scanner(System.in);

        // ===== 20 Core Computer Science Engineering Books =====
        library.addBook(new Book(1, "Introduction to Algorithms", "Thomas H. Cormen", "MIT Press", 4));
        library.addBook(new Book(2, "Artificial Intelligence: A Modern Approach", "Stuart Russell & Peter Norvig",
                "Pearson", 3));
        library.addBook(new Book(3, "Computer Networks", "Andrew S. Tanenbaum", "Pearson", 5));
        library.addBook(new Book(4, "Operating System Concepts", "Abraham Silberschatz", "Wiley", 4));
        library.addBook(new Book(5, "Database System Concepts", "Abraham Silberschatz", "McGraw-Hill", 4));
        library.addBook(new Book(6, "Computer Organization and Design", "David A. Patterson", "Morgan Kaufmann", 3));
        library.addBook(
                new Book(7, "Compilers: Principles, Techniques and Tools", "Aho, Lam, Sethi, Ullman", "Pearson", 3));
        library.addBook(new Book(8, "Clean Code", "Robert C. Martin", "Prentice Hall", 4));
        library.addBook(new Book(9, "Design Patterns", "Erich Gamma et al.", "Addison-Wesley", 3));
        library.addBook(new Book(10, "The Pragmatic Programmer", "Andrew Hunt & David Thomas", "Addison-Wesley", 3));
        library.addBook(new Book(11, "Code Complete", "Steve McConnell", "Microsoft Press", 2));
        library.addBook(new Book(12, "Software Engineering", "Ian Sommerville", "Pearson", 4));
        library.addBook(new Book(13, "The C Programming Language", "Brian W. Kernighan & Dennis M. Ritchie",
                "Prentice Hall", 5));
        library.addBook(new Book(14, "Let Us C", "Yashavant Kanetkar", "BPB Publications", 6));
        library.addBook(new Book(15, "Programming in ANSI C", "E. Balagurusamy", "McGraw-Hill", 5));
        library.addBook(new Book(16, "Digital Logic and Computer Design", "M. Morris Mano", "Pearson", 4));
        library.addBook(new Book(17, "Theory of Computation", "Michael Sipser", "Cengage", 3));
        library.addBook(
                new Book(18, "Discrete Mathematics and Its Applications", "Kenneth H. Rosen", "McGraw-Hill", 3));
        library.addBook(new Book(19, "Computer Graphics", "Hearn & Baker", "Pearson", 2));
        library.addBook(new Book(20, "Machine Learning", "Tom M. Mitchell", "McGraw-Hill", 2));

        // ===== 50 Famous Self-Help Books =====
        library.addBook(new Book(21, "Think and Grow Rich", "Napoleon Hill", "The Ralston Society", 5));
        library.addBook(
                new Book(22, "How to Win Friends and Influence People", "Dale Carnegie", "Simon & Schuster", 4));
        library.addBook(new Book(23, "The 7 Habits of Highly Effective People", "Stephen R. Covey", "Free Press", 6));
        library.addBook(new Book(24, "Atomic Habits", "James Clear", "Penguin Random House", 7));
        library.addBook(new Book(25, "The Power of Now", "Eckhart Tolle", "New World Library", 5));
        library.addBook(new Book(26, "The Subtle Art of Not Giving a F*ck", "Mark Manson", "Harper", 8));
        library.addBook(new Book(27, "Rich Dad Poor Dad", "Robert T. Kiyosaki", "Plata Publishing", 6));
        library.addBook(new Book(28, "You Can Heal Your Life", "Louise L. Hay", "Hay House Inc.", 4));
        library.addBook(new Book(29, "Awaken the Giant Within", "Tony Robbins", "Simon & Schuster", 3));
        library.addBook(new Book(30, "The Four Agreements", "Don Miguel Ruiz", "Amber-Allen Publishing", 5));
        library.addBook(new Book(31, "The Magic of Thinking Big", "David J. Schwartz", "Fireside", 4));
        library.addBook(new Book(32, "Man's Search for Meaning", "Viktor E. Frankl", "Beacon Press", 5));
        library.addBook(new Book(33, "Can’t Hurt Me", "David Goggins", "Lioncrest Publishing", 6));
        library.addBook(new Book(34, "Make Your Bed", "Admiral William H. McRaven", "Grand Central Publishing", 3));
        library.addBook(new Book(35, "Deep Work", "Cal Newport", "Grand Central Publishing", 4));
        library.addBook(new Book(36, "Mindset", "Carol S. Dweck", "Ballantine Books", 5));
        library.addBook(new Book(37, "The Monk Who Sold His Ferrari", "Robin Sharma", "HarperCollins", 6));
        library.addBook(new Book(38, "The Alchemist", "Paulo Coelho", "HarperOne", 7));
        library.addBook(new Book(39, "Start With Why", "Simon Sinek", "Portfolio", 5));
        library.addBook(new Book(40, "Grit", "Angela Duckworth", "Scribner", 4));
        library.addBook(new Book(41, "Tools of Titans", "Tim Ferriss", "Houghton Mifflin Harcourt", 3));
        library.addBook(new Book(42, "Drive", "Daniel H. Pink", "Riverhead Books", 5));
        library.addBook(new Book(43, "The War of Art", "Steven Pressfield", "Black Irish Entertainment", 4));
        library.addBook(new Book(44, "Ego is the Enemy", "Ryan Holiday", "Portfolio", 3));
        library.addBook(new Book(45, "The Obstacle Is the Way", "Ryan Holiday", "Portfolio", 4));
        library.addBook(new Book(46, "Stillness Is the Key", "Ryan Holiday", "Portfolio", 5));
        library.addBook(new Book(47, "The Miracle Morning", "Hal Elrod", "Hal Elrod International", 6));
        library.addBook(new Book(48, "The One Thing", "Gary Keller", "Bard Press", 4));
        library.addBook(new Book(49, "Essentialism", "Greg McKeown", "Crown Business", 3));
        library.addBook(new Book(50, "Who Moved My Cheese?", "Spencer Johnson", "Putnam Adult", 5));
        library.addBook(new Book(51, "The Confidence Code", "Katty Kay & Claire Shipman", "HarperBusiness", 3));
        library.addBook(new Book(52, "The Slight Edge", "Jeff Olson", "Success Books", 4));
        library.addBook(new Book(53, "Unlimited Power", "Tony Robbins", "Free Press", 4));
        library.addBook(new Book(54, "No Excuses!", "Brian Tracy", "Vanguard Press", 3));
        library.addBook(new Book(55, "12 Rules for Life", "Jordan B. Peterson", "Random House Canada", 6));
        library.addBook(new Book(56, "Beyond Order", "Jordan B. Peterson", "Random House Canada", 5));
        library.addBook(new Book(57, "Think Like a Monk", "Jay Shetty", "Simon & Schuster", 7));
        library.addBook(new Book(58, "Your Best Year Ever", "Michael Hyatt", "Baker Books", 3));
        library.addBook(new Book(59, "The Success Principles", "Jack Canfield", "HarperCollins", 4));
        library.addBook(new Book(60, "The 5 AM Club", "Robin Sharma", "HarperCollins", 5));
        library.addBook(new Book(61, "Eat That Frog!", "Brian Tracy", "Berrett-Koehler", 4));
        library.addBook(new Book(62, "The Willpower Instinct", "Kelly McGonigal", "Avery", 3));
        library.addBook(new Book(63, "Quiet", "Susan Cain", "Crown Publishing", 5));
        library.addBook(new Book(64, "Outliers", "Malcolm Gladwell", "Little, Brown and Company", 5));
        library.addBook(new Book(65, "Blink", "Malcolm Gladwell", "Little, Brown and Company", 4));
        library.addBook(new Book(66, "The Tipping Point", "Malcolm Gladwell", "Little, Brown and Company", 3));
        library.addBook(new Book(67, "Mastery", "Robert Greene", "Viking", 3));
        library.addBook(new Book(68, "The Laws of Human Nature", "Robert Greene", "Viking", 4));
        library.addBook(new Book(69, "The Art of Happiness", "Dalai Lama & Howard Cutler", "Riverhead Books", 4));
        library.addBook(new Book(70, "The Happiness Project", "Gretchen Rubin", "Harper Paperbacks", 3));

        while (true) {
            try {
                if (currentUser == null) {
                    loginMenu();
                } else if (currentUser.isAdmin()) {
                    adminMenu();
                } else {
                    studentMenu();
                }
            } catch (Exception e) {
                System.out.println("\nError: " + e.getMessage());
                System.out.println("Please try again.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
    }

    private static void loginMenu() {
        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as Student");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            String input = scanner.nextLine().trim();

            if (input.equals("3")) {
                System.out.println("Thank you for using the Library Management System!");
                System.exit(0);
            }

            try {
                int choice = Integer.parseInt(input);
                switch (choice) {
                    case 1:
                        System.out.print("Enter admin username: ");
                        String adminUsername = scanner.nextLine().trim();
                        System.out.print("Enter admin password: ");
                        String adminPassword = scanner.nextLine().trim();

                        if (adminUsername.equals("admin") && adminPassword.equals("admin123")) {
                            currentUser = new User(1, "Admin", "ADMIN");
                            System.out.println("Welcome, Admin!");
                            return;
                        } else {
                            System.out.println("Invalid admin credentials!");
                        }
                        break;
                    case 2:
                        System.out.print("Enter student name: ");
                        String studentName = scanner.nextLine().trim();
                        if (!studentName.isEmpty()) {
                            currentUser = new User(2, studentName, "STUDENT");
                            System.out.println("Welcome, " + studentName + "!");
                            return;
                        } else {
                            System.out.println("Name cannot be empty!");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }

    private static void adminMenu() {
        while (true) {
            System.out.println("\n=== Admin Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View All Books");
            System.out.println("4. View Transactions");
            System.out.println("5. Logout");
            System.out.print("Enter your choice (1-5): ");

            String input = scanner.nextLine().trim();

            try {
                int choice = Integer.parseInt(input);
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        removeBook();
                        break;
                    case 3:
                        library.listAllBooks();
                        break;
                    case 4:
                        viewTransactions();
                        break;
                    case 5:
                        currentUser = null;
                        return;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }

    private static void studentMenu() {
        while (true) {
            System.out.println("\n=== Student Menu ===");
            System.out.println("1. View All Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Borrowed Books");
            System.out.println("5. Logout");
            System.out.print("Enter your choice (1-5): ");

            String input = scanner.nextLine().trim();

            try {
                int choice = Integer.parseInt(input);
                switch (choice) {
                    case 1:
                        library.listAllBooks();
                        break;
                    case 2:
                        borrowBook();
                        break;
                    case 3:
                        returnBook();
                        break;
                    case 4:
                        viewBorrowedBooks();
                        break;
                    case 5:
                        currentUser = null;
                        return;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }

    private static void addBook() {
        System.out.println("\n=== Add New Book ===");

        int bookId = getValidIntInput("Enter Book ID: ");
        if (bookId <= 0) {
            System.out.println("Book ID must be positive!");
            return;
        }

        System.out.print("Enter Title: ");
        String title = scanner.nextLine().trim();
        if (title.isEmpty()) {
            System.out.println("Title cannot be empty!");
            return;
        }

        System.out.print("Enter Author: ");
        String author = scanner.nextLine().trim();
        if (author.isEmpty()) {
            System.out.println("Author cannot be empty!");
            return;
        }

        System.out.print("Enter Publisher: ");
        String publisher = scanner.nextLine().trim();
        if (publisher.isEmpty()) {
            System.out.println("Publisher cannot be empty!");
            return;
        }

        int quantity = getValidIntInput("Enter Quantity: ");
        if (quantity <= 0) {
            System.out.println("Quantity must be positive!");
            return;
        }

        Book book = new Book(bookId, title, author, publisher, quantity);
        library.addBook(book);
        System.out.println("Book added successfully!");
    }

    private static void removeBook() {
        System.out.println("\n=== Remove Book ===");
        library.listAllBooks();

        int bookId = getValidIntInput("Enter Book ID to remove: ");
        if (bookId <= 0) {
            System.out.println("Book ID must be positive!");
            return;
        }

        if (library.removeBook(bookId)) {
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    private static void borrowBook() {
        System.out.println("\n=== Borrow Book ===");
        library.listAllBooks();

        int bookId = getValidIntInput("Enter Book ID to borrow: ");
        if (bookId <= 0) {
            System.out.println("Book ID must be positive!");
            return;
        }

        if (currentUser.borrowBook(library, bookId)) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Failed to borrow book. It might be unavailable or you might be an admin.");
        }
    }

    private static void returnBook() {
        System.out.println("\n=== Return Book ===");
        viewBorrowedBooks();

        int bookId = getValidIntInput("Enter Book ID to return: ");
        if (bookId <= 0) {
            System.out.println("Book ID must be positive!");
            return;
        }

        if (currentUser.returnBook(library, bookId)) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Failed to return book. You might not have borrowed it.");
        }
    }

    private static void viewBorrowedBooks() {
        System.out.println("\n=== Your Borrowed Books ===");
        List<Book> borrowedBooks = library.getBorrowedBooks(currentUser);
        if (borrowedBooks.isEmpty()) {
            System.out.println("You haven't borrowed any books.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println(book.getDetails() + "\n");
            }
        }
    }

    private static void viewTransactions() {
        System.out.println("\n=== Transaction History ===");
        List<Transaction> transactions = library.getTransactions();
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction t : transactions) {
                System.out.println(t.toString() + "\n");
            }
        }
    }

    private static int getValidIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine().trim();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }
}
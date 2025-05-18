# Library Management System

A comprehensive Java console-based Library Management System that allows administrators to manage books and students to borrow/return books. The system includes a diverse collection of books ranging from Computer Science to Self-Help genres.

## 📚 Features

### Admin Features
- Add new books to the library
- Remove books from the library
- View all books in the library
- View transaction history
- Manage book inventory

### Student Features
- View all available books
- Borrow books
- Return books
- View borrowed books
- Search through book catalog

## 🛠️ Prerequisites

Before you begin, ensure you have the following installed:
- Java Development Kit (JDK) 8 or higher
- Git (for version control)
- Any Java IDE (recommended: IntelliJ IDEA, Eclipse, or VS Code with Java extensions)

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/library-management-system.git
cd library-management-system
```

### 2. Project Structure
```
Library Management System/
├── src/
│   ├── Book.java           # Book entity class
│   ├── User.java           # User (Admin/Student) class
│   ├── Transaction.java    # Transaction tracking class
│   ├── Library.java        # Core library management class
│   └── Main.java          # Driver class with menu interface
├── books.dat              # Book data storage
├── transactions.dat       # Transaction history storage
└── README.md             # Project documentation
```

### 3. Compile the Project
```bash
# Navigate to the project directory
cd library-management-system

# Compile all Java files
javac src/*.java
```

### 4. Run the Application
```bash
# Run the Main class
java -cp src Main
```

## 🔑 Default Credentials

### Admin Login
- Username: `admin`
- Password: `admin123`

### Student Login
- No password required
- Enter your name to login

## 📖 Book Collection

The system comes pre-loaded with two main categories of books:

### Computer Science Books (20 Books)
- Introduction to Algorithms
- Artificial Intelligence: A Modern Approach
- Computer Networks
- Operating System Concepts
- And many more...

### Self-Help Books (50 Books)
- Think and Grow Rich
- How to Win Friends and Influence People
- The 7 Habits of Highly Effective People
- Atomic Habits
- And many more...

## 💻 Usage Guide

### Admin Operations
1. Login as Admin
   - Choose option 1 from main menu
   - Enter username: admin
   - Enter password: admin123

2. Add a Book
   - Choose option 1 from admin menu
   - Enter book details (ID, title, author, publisher, quantity)

3. Remove a Book
   - Choose option 2 from admin menu
   - Enter the book ID to remove

4. View Transactions
   - Choose option 4 from admin menu
   - View all borrowing history

### Student Operations
1. Login as Student
   - Choose option 2 from main menu
   - Enter your name

2. Borrow a Book
   - Choose option 2 from student menu
   - Enter the book ID to borrow

3. Return a Book
   - Choose option 3 from student menu
   - Enter the book ID to return

4. View Borrowed Books
   - Choose option 4 from student menu
   - See your current borrowings

## 🤝 Contributing

We welcome contributions to improve the Library Management System! Here's how you can contribute:

### 1. Fork the Repository
- Click the "Fork" button on the repository page
- Clone your forked repository to your local machine

### 2. Create a New Branch
```bash
git checkout -b feature/your-feature-name
```

### 3. Make Your Changes
- Add new features
- Fix bugs
- Improve documentation
- Add more books to the collection

### 4. Commit Your Changes
```bash
git add .
git commit -m "Description of your changes"
```

### 5. Push to Your Fork
```bash
git push origin feature/your-feature-name
```

### 6. Create a Pull Request
- Go to the original repository
- Click "New Pull Request"
- Select your branch
- Describe your changes
- Submit the pull request

### Contribution Guidelines
- Follow Java coding conventions
- Add comments for complex logic
- Update documentation for new features
- Test your changes thoroughly
- Keep commits atomic and focused

## 📝 Notes
- Book IDs must be unique
- Students cannot borrow books if they are not available
- Admin users cannot borrow books
- All data is automatically saved to files
- The system maintains a transaction history

## 🔒 Data Storage
The system automatically saves:
- Book information in `books.dat`
- Transaction history in `transactions.dat`

## 🐛 Known Issues
- None at the moment

## 📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

## 👥 Authors
- Your Name - Initial work

## 🙏 Acknowledgments
- Thanks to all contributors
- Inspired by real-world library management systems 
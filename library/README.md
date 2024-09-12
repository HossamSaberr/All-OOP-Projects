# Library Management System

This is a simple Library Management System built in Java using Object-Oriented Programming (OOP) principles.

## Features
- Add multiple libraries.
- Manage books in each library.
- Register and manage subscribers.
- Borrow books and track their status.
- Generate overdue reports.

## Example Usage
In the current version of the system:
- Libraries like "Main Campus Library" and "CS Library" are created.
- Books such as "Introduction to Java" are added to the system.
- Subscribers named Mohamed and Ahmed are registered.
- The system simulates borrowing books and prints overdue reports.

## Classes and Methods

### Main.java
This is the main entry point of the program where the system is initialized and executed.

### libraryManager.java
- `addLibrary(library)`: Adds a library to the system.
- `addBook(book)`: Adds a book to a library.
- `addSubscriber(subscriber)`: Registers a new subscriber.
- `borrowBook(bookId, subscriberId)`: Allows a subscriber to borrow a book.
- `printOverdueReports()`: Prints overdue reports for borrowed books.

### library.java
Represents a library, containing an ID and name.

### book.java
Represents a book with details like:
- ID, title, author, publisher, year of publication
- Status (available or borrowed)

### subscriber.java
Represents a library subscriber with details such as:
- ID, name, address, phone number, and email
- Membership type (e.g., regular, golden)

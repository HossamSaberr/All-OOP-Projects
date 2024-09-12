# Basic Banking Application (Java, OOP)

This project is a simple banking application designed using Java and Object-Oriented Programming (OOP) principles. It allows customers to manage their accounts through a command-line interface, providing functionalities such as opening savings accounts, depositing and withdrawing money, and viewing account balances.

## Features

- **Account Management:**

  - The application includes a superclass `Account` that contains the account number, account holder's name, and balance.
  - Methods for depositing and withdrawing money are provided within this class.

- **Savings Account:**

  - A subclass `SavingsAccount` extends the `Account` class, adding an interest rate field.
  - A method is included to calculate interest based on the balance.

- **Bank Operations:**

  - The `Bank` class handles an array of `Account` objects.
  - It includes methods for adding new accounts, performing transactions such as deposits and withdrawals, and displaying the balance of specific accounts.

- **Command-Line Interface:**
  - The `Main` class contains the `main` method and serves as the entry point to the application.
  - It provides a command-line interface for interacting with the bank system, allowing users to execute the various banking operations.

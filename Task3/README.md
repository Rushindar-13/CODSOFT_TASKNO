\# ATM Interface



\## Project Overview



The ATM Interface is a Java console-based application that simulates basic ATM operations. It allows users to check their account balance, withdraw money, deposit money, and exit the application.



\## Objectives



\* Create an ATM machine using Java.

\* Connect the ATM with a bank account.

\* Implement withdrawal, deposit, and balance checking operations.

\* Validate user inputs and transactions.

\* Display appropriate messages for successful and unsuccessful transactions.



\## Features



\* Check account balance

\* Withdraw money

\* Deposit money

\* Validate withdrawal amount

\* Prevent withdrawal when the balance is insufficient

\* Prevent invalid or negative transactions

\* Simple menu-driven interface



\## Technologies Used



\* Java

\* Java Scanner

\* Object-Oriented Programming (OOP)



\## Classes Used



\### BankAccount



Stores and manages the user's account balance.



Main operations:



\* `getBalance()`

\* `withdraw(amount)`

\* `deposit(amount)`



\### ATMInterface



Provides the ATM menu and connects the ATM operations with the bank account.



Main operations:



\* `checkBalance()`

\* `withdraw()`

\* `deposit()`

\* `start()`



\## Initial Balance



The application starts with an initial account balance of:



\*\*₹10,000.00\*\*



\## How to Run



1\. Open the Task3 folder in the terminal.

2\. Compile the Java program:



```bash

javac ATMInterface.java

```



3\. Run the program:



```bash

java ATMInterface

```



4\. Select an option from the ATM menu.



\## Sample Operations



```text

\----------- ATM MENU -----------

1\. Check Balance

2\. Withdraw

3\. Deposit

4\. Exit

\--------------------------------

Enter your choice: 1



Current Balance: ₹10000.00

```



\### Withdrawal



```text

Enter your choice: 2

Enter amount to withdraw: ₹2000



Withdrawal successful! ₹2000.00 withdrawn.

Remaining Balance: ₹8000.00

```



\### Deposit



```text

Enter your choice: 3

Enter amount to deposit: ₹1500



Deposit successful! ₹1500.00 deposited.

Updated Balance: ₹9500.00

```



\### Insufficient Balance



```text

Enter your choice: 2

Enter amount to withdraw: ₹20000



Insufficient balance.

```



\## Project Structure



```text

Task3/

├── ATMInterface.java

└── README.md

```



\## Internship



This project was developed as part of the \*\*CODSOFT Java Development Internship – Task 3\*\*.




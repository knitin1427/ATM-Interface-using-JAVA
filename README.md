# ATM-Interface-using-JAVA
# ATM Interface
This project is a simple ATM interface implemented in Java. It includes features for transactions such as 
deposit, withdraw, transfer, viewing transaction history, and checking the current balance. The user 
interacts with the system through a text-based menu.
## Features
1. **Show Balance**: Displays the current balance of the account.
2. **Deposit**: Allows the user to deposit money into the account.
3. **Withdraw**: Allows the user to withdraw money from the account.
4. **Transfer**: Allows the user to transfer money to another account.
5. **Transaction History**: Displays a list of all transactions made.
6. **Quit**: Exits the ATM interface.
## Code Explanation
### ATM Class
The `ATM` class represents an ATM account with a balance and a transaction history.
- **Attributes**:
 - `balance`: A double representing the account balance.
 - `transactionHistory`: An `ArrayList<String>` that stores a history of transactions.
- **Methods**:
 - `deposit(double amount)`: Adds the specified amount to the account balance and records the 
transaction.
 - `withdraw(double amount)`: Deducts the specified amount from the account balance if sufficient 
funds are available and records the transaction.
 - `transfer(double amount, ATM targetAccount)`: Transfers the specified amount to another `ATM` 
account if sufficient funds are available and records the transaction.
 - `showBalance()`: Prints the current balance of the account.
 - `showTransactionHistory()`: Prints the transaction history.
### Main Method
The `main` method provides a simple text-based menu for user interaction. It creates two `ATM` objects 
for demonstration purposes (one for the user's account and another as a target for transfers).
- **Menu Options**:
 1. Show Balance: Calls the `showBalance()` method on the user's account.
 2. Deposit: Prompts the user to enter an amount and calls the `deposit()` method on the user's account.
 3. Withdraw: Prompts the user to enter an amount and calls the `withdraw()` method on the user's 
account.
 4. Transfer: Prompts the user to enter an amount and calls the `transfer()` method to transfer funds to 
the target account.
 5. Transaction History: Calls the `showTransactionHistory()` method on the user's account.
 6. Quit: Exits the application.
## Usage
To run the ATM interface, compile and run the `ATM` class. The user will be presented with a menu to 
interact with the ATM system. The menu will repeatedly prompt for input until the user chooses to quit.
```bash
javac ATM.java
java ATM
```
## Example
```
ATM Menu:
1. Show Balance
2. Deposit
3. Withdraw
4. Transfer
5. Transaction History
6. Quit
Choose an option: 2
Enter amount to deposit: 100
Deposited: $100.0
ATM Menu:
1. Show Balance
2. Deposit
3. Withdraw
4. Transfer
5. Transaction History
6. Quit
Choose an option: 1
Current Balance: $100.0
```
## Contributing
Contributions are welcome! Please open an issue or submit a pull request if you have any suggestions or 
improvements

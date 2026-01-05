/**
 * Transaction.java
 *
 * This class represents a bank transaction.
 * It also includes TransactionType to define
 * the type of transaction (DEPOSIT or WITHDRAW).
 */

// Enum for transaction type
enum TransactionType {
    DEPOSIT,
    WITHDRAW
}

// Transaction class
public class Transaction {

    private int accountNumber;
    private double amount;
    private TransactionType type;

    // Constructor
    public Transaction(int accountNumber, double amount, TransactionType type) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    // Display transaction details
    public void displayTransactionDetails() {
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Transaction Type : " + type);
        System.out.println("Amount           : " + amount);
    }
}

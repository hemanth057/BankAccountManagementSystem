import java.util.ArrayList;

/**
 * BankDao.java
 * 
 * This class acts as a Data Access Object (DAO)
 * It manages all bank account operations.
 */

public class BankDao {

    private ArrayList<Account> accountList = new ArrayList<>();

    // Create new account
    public void addAccount(Account account) {
        accountList.add(account);
        System.out.println("Account created successfully.");
    }

    // Find account by account number
    public Account getAccount(int accountNumber) {
        for (Account acc : accountList) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }

    // Deposit amount
    public void deposit(int accountNumber, double amount) {
        Account acc = getAccount(accountNumber);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw amount
    public void withdraw(int accountNumber, double amount) {
        Account acc = getAccount(accountNumber);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Check balance
    public void checkBalance(int accountNumber) {
        Account acc = getAccount(accountNumber);
        if (acc != null) {
            System.out.println("Current Balance: " + acc.getBalance());
        } else {

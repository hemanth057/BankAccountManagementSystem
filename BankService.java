/**
 * BankService.java
 * 
 * This class contains business logic for banking operations.
 * It acts as a middle layer between Main and BankDao.
 */

public class BankService {

    private BankDao bankDao = new BankDao();

    // Create new account
    public void createAccount(int accountNumber, String name, double balance) {
        bankDao.createAccount(accountNumber, name, balance);
    }

    // Deposit amount
    public void deposit(int accountNumber, double amount) {
        if (amount > 0) {
            bankDao.deposit(accountNumber, amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw amount
    public void withdraw(int accountNumber, double amount) {
        if

package Lab01.BankAccount;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String holderName;
    private double currentBalance;
    private double interestRate;
    private int currentWithdrawals;
    private static final int MAX_WITHDRAWALS_ALLOWED = 3;
    private ArrayList<String> history;

    public Account(String holderName, double startingBalance, double interestRate) {
        this.holderName = holderName;
        this.currentBalance = startingBalance;
        this.interestRate = interestRate;
        this.currentWithdrawals = 0; // Starting from 0 withdrawals
        this.history = new ArrayList<>();
        recordTransaction("Initial balance", startingBalance);
    }

    public String getHolderName() {
        return holderName;
    }

    public void depositFunds(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Deposited: " + amount + " VND");
            recordTransaction("Deposit", amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdrawFunds(double amount) {
        if (currentWithdrawals >= MAX_WITHDRAWALS_ALLOWED) {
            System.out.println("Withdrawal limit reached for this month");
            return;
        }
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            currentWithdrawals++;
            System.out.println("Withdrawn: " + amount + " VND");
            recordTransaction("Withdrawal", amount);
        } else {
            System.out.println(amount < 0 ? "Invalid withdrawal amount" : "Insufficient funds");
        }
    }

    public void applyMonthlyInterest() {
        double interest = currentBalance * (interestRate / 100);
        currentBalance += interest;
        recordTransaction("Interest applied", interest);
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History:");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". " + history.get(i));
        }
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    private void recordTransaction(String type, double amount) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        history.add(type + ": " + amount + " VND - " + timestamp);
    }
}

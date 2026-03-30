/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raksh
 */
public class Finance {
     private double balance;
    private String database;

    public Finance(double balance, String database) {
        this.balance = balance;
        this.database = database;
    }

    public void poolingOfFunds(double amount) {
        balance += amount;
        System.out.println("Funds pooled. New balance: ₹" + balance);
    }

    public void economicDevelopment() {
        System.out.println("Funds allocated for economic development from DB: " + database);
    }

    public void betterDecisionMaking() {
        System.out.println("Decision made based on balance: ₹" + balance);
    }

    public double getBalance() { return balance; }
    public String getDatabase() { return database; }
}

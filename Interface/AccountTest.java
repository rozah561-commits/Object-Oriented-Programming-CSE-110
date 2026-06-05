/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacee;
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
}
interface SavingAccount extends Account {
    void calculateInterest();
}
interface CurrentAccount extends Account {
    void checkOverdraft();
}
class PremiumAccount implements SavingAccount, CurrentAccount {
    public String accNumber;
    public double balance;
    public double interestRate;
    public double overdraftLimit;
    public int rewardPoints;
    public PremiumAccount(String accNumber, double balance, double interestRate, double overdraftLimit, int rewardPoints) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        this.overdraftLimit = overdraftLimit;
        this.rewardPoints = rewardPoints;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

    @Override
    public void checkOverdraft() {
        if (balance < -overdraftLimit) {
            System.out.println("Overdraft limit exceeded!");
        } else {
            System.out.println("Within overdraft limit.");
        }
    }

    public void redeemRewards() {
        System.out.println("Redeeming " + rewardPoints + " reward points.");
        rewardPoints = 0;
    }

    @Override
    public String toString() {
        return "Account No: " + accNumber + ", Balance: " + balance + ", Reward Points: " + rewardPoints;
    }
}
public class AccountTest {
    public static void main(String[] args) {
        PremiumAccount premium = new PremiumAccount("AC123", 1000.0, 0.05, 500.0, 200);
        
        premium.deposit(500);
        System.out.println("Balance after deposit: " + premium.balance);
        
        premium.withdraw(200);
        System.out.println("Balance after withdrawal: " + premium.balance);
        
        premium.calculateInterest();
        System.out.println("Balance after interest: " + premium.balance);
        
        premium.checkOverdraft();
        premium.redeemRewards();
        
        System.out.println(premium.toString());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;
abstract class BankAccount {
    private String accNumber;
    private String accHolderName;
    private double balance;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Balance: " + balance);
    }
    public String getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
    public String getAccHolderName() {
        return accHolderName;
    }
    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited: " + amount);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void calculateYearlyInterest() {
        double interest = getBalance() * interestRate;
        System.out.println("Yearly Interest: " + interest);
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

class FixedDepositAccount extends SavingsAccount {
    private int termInYears;

    public void calculateMaturityAmount() {
        double maturityAmount = getBalance() * Math.pow((1 + getInterestRate()), termInYears);
        System.out.println("Maturity Amount after " + termInYears + " years: " + maturityAmount);
    }
    public int getTermInYears() {
        return termInYears;
    }
    public void setTermInYears(int termInYears) {
        this.termInYears = termInYears;
    }
}
public class TestBankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.setAccNumber("101");
        sa.setAccHolderName("A");
        sa.setBalance(1000.0);
        sa.setInterestRate(0.05);

        System.out.println("=== Savings Account ===");
        sa.deposit(500);
        sa.withdraw(200);
        sa.calculateYearlyInterest();
        sa.displayAccountInfo();

        System.out.println();
        FixedDepositAccount fda = new FixedDepositAccount();
        fda.setAccNumber("202");
        fda.setAccHolderName("B");
        fda.setBalance(5000.0);
        fda.setInterestRate(0.07);
        fda.setTermInYears(3);

        System.out.println("=== Fixed Deposit Account ===");
        fda.deposit(1000);
        fda.calculateMaturityAmount();
        fda.displayAccountInfo();
    }
}


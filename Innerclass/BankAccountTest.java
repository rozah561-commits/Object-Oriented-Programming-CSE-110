/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.innerclass;

class BankAccount {
    private double balance;
    private double interestRate;

    public BankAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double applyInterest() {
        InterestCalculator calculator = new InterestCalculator();
        return calculator.calculateInterest();
    }

    private class InterestCalculator {

        public double calculateInterest() {
            return balance * interestRate / 100.0;
        }
    }
}

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000.0, 5.0);

        double interest = account.applyInterest();
        System.out.println("Computed Interest: $" + interest);
    }
}


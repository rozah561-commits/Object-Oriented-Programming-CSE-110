/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

abstract class Account {
    protected String accNumber;
    protected double balance;
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class SavingsAccountt extends Account {
    double interestRate;
    public double calculateInterest() {
        return balance * interestRate / 100;
    }
}
class CurrentAccount extends Account {
    double overdraftLimit;
    public boolean checkOverdraft() {
        return balance < -overdraftLimit;
    }
}

class PremiumAccount extends SavingsAccountt {
    double overdraftLimit;
    int rewardPoints;

    public boolean checkOverdraft() {
        return balance < -overdraftLimit;
    }

    public void redeemRewards() {
        if (rewardPoints >= 100) {
            System.out.println("Rewards Redeemed: " + rewardPoints);
            rewardPoints = 0;
        } else {
            System.out.println("Not enough reward points to redeem.");
        }
    }
}

public class BankingSystemTest {
    public static void main(String[] args) {
        SavingsAccountt sa = new SavingsAccountt();
        sa.accNumber = "A";
        sa.balance = 1000;
        sa.interestRate = 5;
        sa.deposit(500);
        sa.withdraw(200);
        System.out.println("Interest Earned: " + sa.calculateInterest());
        System.out.println();

        CurrentAccount ca = new CurrentAccount();
        ca.accNumber = "CA001";
        ca.balance = -300;
        ca.overdraftLimit = 500;
        ca.deposit(100);
        ca.withdraw(200);
        System.out.println("Overdraft Exceeded: " + ca.checkOverdraft());
        System.out.println();

        PremiumAccount pa = new PremiumAccount();
        pa.accNumber = "PA001";
        pa.balance = 2000;
        pa.interestRate = 4.5;
        pa.overdraftLimit = 1000;
        pa.rewardPoints = 150;
        pa.deposit(300);
        pa.withdraw(5000);
        System.out.println("Interest Earned: " + pa.calculateInterest());
        System.out.println("Overdraft Exceeded: " + pa.checkOverdraft());
        pa.redeemRewards();
    }
}
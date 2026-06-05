/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(double amount) {
        String threadName = Thread.currentThread().getName();

        if (balance >= amount) {
            System.out.println(threadName + " is trying to withdraw: " + amount);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
            balance -= amount;
            System.out.println(threadName + " successfully withdrew: " + amount);
        } else {
            System.out.println(threadName + " failed to withdraw " + amount + " (Insufficient balance)");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class WithdrawTask implements Runnable {
    private BankAccount account;
    private double amount;

    public WithdrawTask(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new Thread(new WithdrawTask(account, 500), "Thread-1");
        Thread t2 = new Thread(new WithdrawTask(account, 400), "Thread-2");
        Thread t3 = new Thread(new WithdrawTask(account, 300), "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}

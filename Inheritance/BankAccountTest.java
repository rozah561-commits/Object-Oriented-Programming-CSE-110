/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
class BankAccount {
    public String owner;
    public double balance;
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
         
        }
    }
    public void withdrawal(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
          
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
class CheckingAccount extends BankAccount {
    public double insufficientFundsFee;
    public CheckingAccount(String owner, double balance, double insufficientFundsFee) {
        super(owner, balance);
        this.insufficientFundsFee = insufficientFundsFee;
    }
    public void processCheck(double checkToProcess) {
        withdrawal(checkToProcess);
    }
    public void withdrawal(double amount) {
        if (balance < amount) {
            balance -= insufficientFundsFee;
           
        } else {
            super.withdrawal(amount);
        }
    }
}
class SavingsAccount extends BankAccount {
    public double annualInterestRate;
    public SavingsAccount(String owner, double balance, double annualInterestRate) {
        super(owner, balance);
        this.annualInterestRate = annualInterestRate;
    }
    public void depositMonthlyInterest() {
        double interest = (balance * (annualInterestRate / 100)) / 12;
        balance += interest;
       
    }
}
public class BankAccountTest {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount("John Doe", 500, 25);
        SavingsAccount savings = new SavingsAccount("Jane Doe", 1000, 5);

checking.deposit(200);
    checking.withdrawal(800);
    savings.deposit(500);
    savings.depositMonthlyInterest();

    System.out.println("Checking Balance: $" + checking.balance);
    System.out.println("Savings Balance: $" + savings.balance);
}

}
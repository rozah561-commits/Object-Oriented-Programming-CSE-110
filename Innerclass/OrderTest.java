/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.innerclass;
 class Order {
    private String orderId;
    private double amount;
    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }
    public void generateInvoice() {
        InvoiceGenerator generator = new InvoiceGenerator();
        generator.printInvoice();
    }
    private class InvoiceGenerator {
        public void printInvoice() {
            System.out.println("Invoice:");
            System.out.println("Order ID: " + orderId);
            System.out.println("Amount: $" + amount);
        }
    }
}
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order("ORD001", 150.75);
        Order order2 = new Order("ORD002", 299.99);
        Order order3 = new Order("ORD003", 89.50);

        order1.generateInvoice();
        order2.generateInvoice();
        order3.generateInvoice();
    }
}
  


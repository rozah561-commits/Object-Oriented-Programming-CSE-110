/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.association;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Order {
    private Date date;
    private String status;
    private int quantity;
    private int unitPrice;

    public Order(Date date, String status, int quantity, int unitPrice) {
        this.date = date;
        this.status = status;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int calcTotal(int unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    public int getTotal() {
        return calcTotal(unitPrice, quantity);
    }

    public String getOrderDetails() {
        return "Date: " + date.toString() + ", Status: " + status +
               ", Quantity: " + quantity + ", Unit Price: " + unitPrice +
               ", Total: " + getTotal();
    }
}

class Customer {
    private String name;
    private String address;
    private List<Order> orders;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    public void orders(Order... orders) {
        for (Order order : orders) {
            this.orders.add(order);
        }
    }

    public void displayOrders() {
        System.out.println("Customer Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Orders:");
        for (Order order : orders) {
            System.out.println(order.getOrderDetails());
        }
    }
}

public class CustomerTest {
    public static void main(String[] args) {
        Order order1 = new Order(new Date(), "Shipped", 3, 150);
        Order order2 = new Order(new Date(), "Pending", 2, 250);

        Customer customer = new Customer("Rahim Uddin", "Dhaka, Bangladesh");
        customer.orders(order1, order2); 

        customer.displayOrders();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.association;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void orders(List<Order> orderList) {
        System.out.println("Customer Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Orders:");
        for (Order order : orderList) {
            order.displayOrder();
        }
    }
}

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

    public int calcTotal() {
        return unitPrice * quantity;
    }

    public void displayOrder() {
        System.out.println("Order Date: " + date);
        System.out.println("Status: " + status);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total: " + calcTotal());
    }
}

public class CustomerOrder {
    public static void main(String[] args) {
        Order order1 = new Order(new Date(), "Confirmed", 1, 440);
        Order order2 = new Order(new Date(), "Delivered", 2, 290);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);

        Customer customer = new Customer("Roza", "Dhaka");
        customer.orders(orderList);
    }
}

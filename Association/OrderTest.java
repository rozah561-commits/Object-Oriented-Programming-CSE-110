/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.association;

import java.util.Date;

class OrderDetails {
    String quality;
    boolean taxStatus;
    OrderDetails(String quality, boolean taxStatus) {
        this.quality = quality;
        this.taxStatus = taxStatus;
    }

    void showDetails() {
        System.out.println("Quality: " + quality);
        System.out.println("Tax Paid: " + (taxStatus ? "Yes" : "No"));
    }
}
class Orders {
    int id;
    Date date;
    String status;
    int quantity;
    int unitPrice;
    OrderDetails details;

    Orders(int id, Date date, String status, int quantity, int unitPrice, OrderDetails details) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.details = details;
    }
    int calcTotal() {
        return unitPrice * quantity;
    }
    void showOrder() {
        System.out.println("Order Status: " + status);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Price: " + calcTotal());
        details.showDetails();
    }
}
public class OrderTest {
    public static void main(String[] args) {
        OrderDetails d1 = new OrderDetails("Premium", true);
        Orders o1 = new Orders(101, new Date(), "Confirmed", 3, 500, d1);

        o1.showOrder();
    }
}
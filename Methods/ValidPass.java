/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;
import java.util.Scanner;

public class ValidPass {
    public static boolean isValidPassword(String password) {
        return password.length() >= 8 &&
               password.matches("[a-zA-Z0-9]+") &&
               password.replaceAll("[^0-9]", "").length() >= 2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);       
        System.out.print("Enter a password: ");
        String password = in.nextLine();
        
        if (isValidPassword(password)) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }
    }
}
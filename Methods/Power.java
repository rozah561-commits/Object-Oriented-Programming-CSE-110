/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;
import java.util.Scanner;

public class Power {
    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = in.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = in.nextInt();
        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}

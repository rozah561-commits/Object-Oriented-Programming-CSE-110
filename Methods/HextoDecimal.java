/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;
import java.util.Scanner;

public class HextoDecimal {
    public static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = in.nextLine();
        System.out.println("Decimal equivalent: " + hexToDecimal(hex));
    }
}
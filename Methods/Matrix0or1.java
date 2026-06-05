/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;
import java.util.Scanner;
 
public class Matrix0or1 {
    public static void displayMatrix(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println("Generated Matrix:");
        displayMatrix(m, n);
    }
} 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

import java.util.Scanner;


public class ArrayOutOfBounds {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = (int)(Math.random()*1000);
        }
        try {
             System.out.print("Enter index (0-99): ");
        int n = in.nextInt();
            System.out.println("Value at index " + n + ": " + a[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}
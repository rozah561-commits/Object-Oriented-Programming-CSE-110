/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;
import java.util.Scanner;

class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers I want:");
        int n = in.nextInt();
        System.out.println("Enter numbers:");
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sum = sum + a[i];
        }
        double average = (double) sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > average) {
                count++;
            }
        }
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average of numbers: " + average);
        System.out.println("Number of elements above the average: " + count);
    }
}

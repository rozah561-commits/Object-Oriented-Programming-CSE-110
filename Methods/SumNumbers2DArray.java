/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;
import java.util.Scanner;

public class SumNumbers2DArray {
    public static int sumOfArray(int m, int n, int[][] a) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n;
        System.out.print("Enter the number of rows and columns of the 2D array: ");
        m = in.nextInt();
        n = in.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("The sum of numbers in the 2D array = " + sumOfArray(m, n, a));
    }
}

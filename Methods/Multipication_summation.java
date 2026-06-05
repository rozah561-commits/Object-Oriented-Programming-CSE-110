/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;
import java.util.Scanner;

public class Multipication_summation {
     public static int[][] multiplyMatrices(int m, int n, int p, int[][] a, int[][] b) {
        int[][] product = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                product[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }
    public static int[][] sumOfMatrices(int m, int n, int[][] a, int[][] b) {
        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1, n1, m2, n2;
        System.out.print("Enter rows and columns for first matrix: ");
        m1 = in.nextInt();
        n1 = in.nextInt();
        System.out.print("Enter rows and columns for second matrix: ");
        m2 = in.nextInt();
        n2 = in.nextInt();
        int[][] a = new int[m1][n1];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int[][] b = new int[m2][n2];
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                b[i][j] = in.nextInt();
            }
        }
        if (n1 == m2) {
            int[][] product = multiplyMatrices(m1, n1, n2, a, b);
            System.out.println("Product of matrices:");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible.");
        }

        if (m1 == m2 && n1 == n2) {
            int[][] sum = sumOfMatrices(m1, n1, a, b);
            System.out.println("Sum of matrices:");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix addition is not possible.");
        }
    }
}
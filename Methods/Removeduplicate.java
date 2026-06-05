/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;
import java.util.Scanner;

public class Removeduplicate {
    public static void newArray(int n, int[] a) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        int j = 0;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                b[j++] = a[i];
            }
        }
        System.out.println("The new array after eliminating duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        newArray(n, a);
    }
}
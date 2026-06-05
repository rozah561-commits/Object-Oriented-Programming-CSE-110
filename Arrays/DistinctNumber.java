/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;
import java.util.Scanner;

class DistinctNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] numbers = new int[10];
        int distinctCount = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = in.nextInt();
        }
        System.out.println("Distinct numbers:");
        for (int i = 0; i < 10; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                System.out.print(numbers[i] + " ");
                distinctCount++;
            }
        }
        System.out.println("\nNumber of distinct numbers: " + distinctCount);
    }
}
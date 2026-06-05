/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;
import java.util.Scanner;

public class NewClass {

    public static void newArray(int n, int[] numbers) {
        int[] temp = new int[n];
        int Count = 0;

        for (int i = 0; i < n; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                temp[Count++] = numbers[i];
            }
        }

        System.out.println("The new array after eliminating duplicates:");
        for (int i = 0; i < Count; i++) {
            System.out.print(temp[i] + " ");
        }

        System.out.println("\numbers: " + Count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
       System.out.println("Enter numbers:");
        int[] numbers = new int[n];
        newArray(n, numbers);
    }
}

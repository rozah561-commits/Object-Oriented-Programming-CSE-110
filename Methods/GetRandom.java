/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;
import java.util.Scanner;

public class GetRandom {
    public static int getRandom(int n, int[] a) {
        int random;
        while (true) {
            random = 1 + (int) (Math.random() * 54);
            boolean duplicate = false;
            for (int i = 0; i < n; i++) {
                if (random == a[i]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                return random;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("The random value: " + getRandom(n, a));
    }
}

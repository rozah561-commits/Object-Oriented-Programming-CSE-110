/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;
import java.util.Scanner;
public class MaxElement {
    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0]; 
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] intArray = {3, 7, 2, 9, 1};
        String[] strArray = {"cat", "apple", "zebra", "banana"};

        System.out.println("Max in intArray: " + max(intArray));     
        System.out.println("Max in strArray: " + max(strArray));    
    }
}
    
//    public static void main(String[] args) {
//          System.out.print("How Many Numbers You Want? ");
//          Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        Integer[] numbers = new Integer[n];
//
//        System.out.println("Enter Numbers:");
//        for (int i = 0; i < n; i++) {
//            numbers[i] = in.nextInt();
//        }
//        System.out.println("Max number: " + max(numbers));
//        in.nextLine();
//        System.out.print("\nHow Many Words You Want? ");
//        int m = in.nextInt();
//        in.nextLine(); 
//
//        String[] words = new String[m];
//        System.out.println("Enter Word:");
//        for (int i = 0; i < m; i++) {
//            words[i] = in.nextLine();
//        }
//
//        System.out.println("Max word: " + max(words));
//    }
//}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;
import java.util.Scanner;

public class LinearSearchGeneric {
    public static <E> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = {"Alice", "Bob", "Charlie", "David"};
        System.out.print("Enter Name: ");
        String searchName = input.nextLine();

        int index = linearSearch(name, searchName);

        if (index != -1) {
            System.out.println(searchName + " At Index Number: " + index);
        } else {
            System.out.println(searchName + " Not found in list");
        }
    }
}

//public class LinearSearchGeneric {
//    public static <E> int linearSearch(E[] list, E key) {
//        for (int i = 0; i < list.length; i++) {
//            if (list[i].equals(key)) {
//                return i; 
//            }
//        }
//        return -1; 
//    }
//
//    public static void main(String[] args) {
//        Integer[] numbers = {10, 20, 30, 40, 50};
//        int index1 = linearSearch(numbers, 30);
//        System.out.println("Index of 30: " + index1); 
//
//        int index2 = linearSearch(numbers, 60);
//        System.out.println("Index of 60: " + index2); 
//        
//        String[] names = {"Alice", "Bob", "Charlie"};
//        int index3 = linearSearch(names, "Bob");
//        System.out.println("Index of Bob: " + index3); 
//    }
//}
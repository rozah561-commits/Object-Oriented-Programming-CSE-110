/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static <T> ArrayList <T> removeDuplicates(ArrayList<T>list){
        ArrayList <T> result = new ArrayList<>();
        for(T i : list){
            if(!result.contains(i))
               result.add(i);
        }
    return result;
    }
     public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("grape");

        System.out.println("Original list: " + list);

        ArrayList<String> noDuplicates = removeDuplicates(list);

        System.out.println("Without duplicates: " + noDuplicates);
    }
}   
    
//        public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();               
//       System.out.print("How many elements do you want to enter? ");
//        int n = in.nextInt();
//        in.nextLine(); 
//
//        System.out.println("Please enter " + n + " elements:");
//        for (int i = 0; i < n; i++) {
//            String item = in.nextLine();
//            list.add(item);
//        }
//        System.out.println("Original list: " + list);
//        ArrayList<String> noDuplicates = removeDuplicates(list);
//        System.out.println("Without duplicates: " + noDuplicates);
//    }
//}

 
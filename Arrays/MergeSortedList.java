/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;
import java.util.Scanner;

class MergeSortedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");     //int[] list1 = {1,2,3}
        int n1 = input.nextInt();              //int[] list2 ={1,2,3}
        int[] list1 = new int[n1];            //int[] mergedList = merge(list1, list2);
        for (int i = 0; i < n1; i++) {
            list1[i] = input.nextInt();  
        }
        System.out.print("Enter list2: ");
        int n2 = input.nextInt(); 
        int[] list2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            list2[i] = input.nextInt();  
        }
        int[] mergedList = merge(list1, list2);
        System.out.print("The merged list is: ");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }
    public static int[] merge(int[] list1, int[] list2) {
        int[] merged = new int[list1.length + list2.length];
        int i = 0, j = 0, k = 0;

        // Compare elements of list1 and list2, and add the smaller element to merged
        while (i < list1.length && j < list2.length) {
            if (list1[i] <= list2[j]) {
                merged[k++] = list1[i++];
            } else {
                merged[k++] = list2[j++];
            }
        }
        while (i < list1.length) {
            merged[k++] = list1[i++];
        }
        while (j < list2.length) {
            merged[k++] = list2[j++];
        }

        return merged;
    }
}

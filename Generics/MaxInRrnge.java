/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;
import java.util.List;

public class MaxInRrnge {
    public static <T extends Comparable<T>> T maxInRange(List<T> list, int begin, int end) {
        if (list == null || begin < 0 || end > list.size() || begin >= end) {
            System.out.println("Invalid range.");
            return null;
        }
        T max = list.get(begin); 
        for (int i = begin + 1; i < end; i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 22, 17, 3, 88, 14);
        System.out.println("Max in range [2, 6): " + maxInRange(numbers, 2, 6)); 
    }
}
//        public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("How many numbers? ");
//        int n = in.nextInt();
//
//        List<Integer> nums = new ArrayList<>();
//        System.out.println("Enter " + n + " integers:");
//        for (int i = 0; i < n; i++) {
//            nums.add(in.nextInt());
//        }
//        System.out.print("Enter begin index: ");
//        int begin = in.nextInt();
//        System.out.print("Enter end index (exclusive): ");
//        int end = in.nextInt();
//        try {
//            Integer max = findMax(nums, begin, end);
//            System.out.println("Max element in range [" + begin + ", " + end + ") is: " + max);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}
//    public static void main(String[] args) {
//        List<Integer> nums = List.of(4, 15, 2, 30, 8);
//
//        // We want to find max in range [1, 4) → index 1 to 3 → 15, 2, 30
//        int begin = 1;
//        int end = 4;
//
//        Integer max = findMax(nums, begin, end);
//        System.out.println("Max element in range [" + begin + ", " + end + ") is: " + max);
//    }
//}
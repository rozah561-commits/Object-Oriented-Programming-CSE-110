/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;

import java.util.Collection;
import java.util.function.Predicate;

public class GenericCounter {
    public static <T> int countMatching(Collection<T> collection, Predicate<T> condition) {
        int count = 0;
        for (T item : collection) {
            if (condition.test(item)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Collection<Integer> numbers = java.util.List.of(1, 2, 3, 4, 5, 6, 7);
        int oddCount = countMatching(numbers, n -> n % 2 != 0);
        System.out.println("Odd numbers count: " + oddCount);

        int primeCount = countMatching(numbers, GenericCounter::isPrime);
        System.out.println("Prime numbers count: " + primeCount);

        Collection<String> words = java.util.List.of("madam", "hello", "racecar", "apple", "level");
        int palindromeCount = countMatching(words, GenericCounter::isPalindrome);
        System.out.println("Palindrome count: " + palindromeCount);
    }
}

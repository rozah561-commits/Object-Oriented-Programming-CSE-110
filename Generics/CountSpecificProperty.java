/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;

import java.util.*;

public class CountSpecificProperty {

    public static <E extends Integer> int oddNumCount(E[] list) {
        int count = 0;
        for (E element : list) {
            if (element.intValue() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static <E extends Integer> int primeNumCount(E[] list) {
        int count = 0;
        for (E element : list) {
            if (isPrime(element.intValue())) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int palindromeCount(String[] list) {
        int count = 0;
        for (String element : list) {
            if (isPalindrome(element)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 4, 3, 5, 6, 7, 8, 8, 9};

        int odds = oddNumCount(numbers);
        System.out.println("Number of odd numbers: " + odds);

        int primes = primeNumCount(numbers);
        System.out.println("Number of prime numbers: " + primes);

        String[] words = {"madam", "hello", "racecar", "level", "world"};
        int pals = palindromeCount(words);
        System.out.println("Number of palindromes: " + pals);
    }
}

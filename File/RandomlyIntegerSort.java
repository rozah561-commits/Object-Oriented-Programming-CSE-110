/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class RandomlyIntegerSort {

    public static void main(String[] args) {
        File file = new File("Exercise12_15.txt");
        ArrayList<Integer> numbers = new ArrayList<>();

        if (!file.exists()) {
            try {
                Formatter formatter = new Formatter(file);
                for (int i = 0; i < 100; i++) {
                    int randomNum = (int) (Math.random() * 1000);
                    formatter.format("%d ", randomNum);
                }
                formatter.close();
                System.out.println("File created .");
            } catch (FileNotFoundException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }
        try {
            Scanner in = new Scanner(file);
            while (in.hasNextInt()) {
                numbers.add(in.nextInt());
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        Collections.sort(numbers);
        System.out.println("Sorted integers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

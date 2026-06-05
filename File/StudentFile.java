/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;

import java.io.*;
import java.util.*;

public class StudentFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File dir = new File("D:\\CSE110");
        dir.mkdirs();
        String path = dir.getAbsolutePath();
        File file = new File(path + "\\student.txt");

        try {
            Formatter formatter = new Formatter(file);

            System.out.print("Enter number of students: ");
            int n = input.nextInt();
            input.nextLine(); 

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for student " + (i + 1) + ":");

                System.out.print("Name: ");
                String name = input.nextLine();

                System.out.print("ID: ");
                int id = input.nextInt();

                System.out.print("CGPA: ");
                double cgpa = input.nextDouble();
                input.nextLine(); 

                formatter.format("%s,%d,%.2f%n", name, id, cgpa);
            }

            formatter.close();
            System.out.println("Student records written successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error creating/writing to file: " + e.getMessage());
        }

        System.out.println("\nSearching for student with ID = 3...");
        boolean found = false;
       try {
            Scanner in = new Scanner(file);
            in.useDelimiter(",|\\n"); 

            while (in.hasNext()) {
                String name = in.next().trim();
                int id = in.nextInt();
                double cgpa = in.nextDouble();

                if (id == 3) {
                    System.out.println("Student Found:");
                    System.out.println("Name: " + name);
                    System.out.println("ID: " + id);
                    System.out.println("CGPA: " + cgpa);
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class UniversityDataGenerator {
    public static void main(String[] args) {
        File dir = new File("F:\\Downloads 02-08-2023\\university");
        dir.mkdir();
            String path = dir.getAbsolutePath();
        File file = new File(path + "\\Student.txt");
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();

        try {
            Formatter formatter = new Formatter(file);
            for (int i = 1; i <= n; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                int year = 2012 + (int)(Math.random() * 13);
                int last4 = (int)(Math.random() * 10000);
                String id = year + String.format("%04d", last4);
                formatter.format("%s %s %d %s\r\n", firstName, lastName, year, id);
            }
            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

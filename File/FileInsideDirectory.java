/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;

public class FileInsideDirectory {
    public static void main(String[] args) {
        File dir = new File("F:\\Downloads 02-08-2023\\university");
        dir.mkdir();
        
        String path = dir.getAbsolutePath();
        File file1 = new File(path + "\\student.txt");

        System.out.println("Directory and File Created");

        try {
            Formatter formatter = new Formatter(file1);
            Scanner in = new Scanner(System.in);
            
            System.out.println("How many Students:");
            int n = in.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter Student Id, Name, and Dept:");

                String id = in.next();
                String name = in.next();
                String dept = in.next();

                formatter.format("%s %s %s\r\n", id, name, dept);
            }

            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        try {
            File file = new File("F:\\Downloads 02-08-2023\\university\\student.txt");
            Scanner in = new Scanner(file);
            System.out.println("Reading data from file:");
            while (in.hasNext()) {
                String id = in.next();
                String name = in.next();
                String dept = in.next();

                System.out.println("Id : " + id + " Name : " + name + " Dept : " + dept);
            }

            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

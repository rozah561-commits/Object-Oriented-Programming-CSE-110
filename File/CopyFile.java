/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;
public class CopyFile {
    public static void main(String[] args) {
        File file1 = new File("F:\\Downloads 02-08-2023\\university\\student.txt");
        File file2 = new File("F:\\Downloads 02-08-2023\\university\\student_copy.txt");

        try {
            Scanner in = new Scanner(file1);
            Formatter formatter = new Formatter(file2);

            while (in.hasNext()) {
                String line = in.nextLine();
                formatter.format("%s\r\n", line);
            }
           formatter.close();
            System.out.println("File copied successfully.");
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}


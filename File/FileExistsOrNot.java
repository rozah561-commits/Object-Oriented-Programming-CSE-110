/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;
 import java.io.File;
import java.util.Scanner;

public class FileExistsOrNot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the path of the file or directory: ");
        String path = in.nextLine();

        File file = new File(path);

        if (file.exists()) {
            System.out.println(" The path exists.");
            if (file.isFile()) {
                System.out.println(" It is a file.");
            } else if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }
        } else {
            System.out.println(" The path does not exist.");
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;

import java.io.File;
public class ListOfFiles {

    public static void main(String[] args) {
        File dir = new File("C:\\Users\\DE\\OneDrive\\Documents\\NetBeansProjects\\file"); 
        String[] files = dir.list();
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Directory not found or empty.");
        }
    }
}

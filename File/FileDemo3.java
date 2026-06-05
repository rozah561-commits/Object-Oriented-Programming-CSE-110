/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;
import java.io.File;
import java.util.Scanner;
public class FileDemo3 {
    public static void main(String[] args) {
        try{
        File file = new File("C:\\Users\\DE\\OneDrive\\Documents\\NetBeansProjects\\file\\person\\student.txt");
        Scanner in = new Scanner(file);
        
        while(in.hasNext()){
            String id =in.next();
           String name=in.next(); 
            System.out.println("Id:"+id+"Name:+name");
        }
        in.close();
    }catch(Exception e){
            System.out.println(e);
    }
    }
}

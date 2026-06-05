/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;
public class FileDemo2 {
    public static void main(String[] args) {
        String id;
        String name;
        try{
             Formatter formatter= new Formatter("C:\\Users\\DE\\OneDrive\\Documents\\NetBeansProjects\\file\\person\\student.txt");
           Scanner in=new Scanner(System.in) ;
            System.out.println("How many Students:");
       int n = in.nextInt();
       for(int i=1;i<=n;i++){
           System.out.println("Enter Student Id and Name:");
           id=in.next();
           name=in.next();
             formatter.format("%s %s\r\n",id,name);
       }
//        formatter.format("%s %s\r\n","101","Roza");
//        formatter.format("%s %s\r\n","101","Roza");
//        formatter.format("%s %s\r\n","101","Roza");
//        
        formatter.close();
    }catch(FileNotFoundException e){
            System.out.println(e);
    }
    }
}

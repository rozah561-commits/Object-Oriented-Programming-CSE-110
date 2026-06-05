/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.file;
import java.io.File;
public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("F:\\Downloads 02-08-2023\\person");//folder person
        dir.mkdir();
//       String location= dir.getAbsolutePath();
//        System.out.println(location);
//        System.out.println(dir.getName());
//        dir.delete();
//        
      String path= dir.getAbsolutePath();
      File file1 = new File(path+"\\student.txt");
      File file2 = new File("C:\\Users\\DE\\OneDrive\\Documents\\NetBeansProjects\\file\\person\\teacher.txt");
        System.out.println("File Created");
      try{
          file1.createNewFile();
          file2.createNewFile();
      }catch(Exception e){
          System.out.println(e);
      }
      //file2.delete();
      if(file1.exists()){
          System.out.println("File exists");
      }else{
          System.out.println("Not Exists");
      }
    
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;

import java.util.*;
class InvalidCGPAException extends Exception {
    public InvalidCGPAException(String message) {
        super(message);
    }
}
class Student {
    public int id;
    public double cgpa;
    public String name;

    public Student(int id, double cgpa, String name) throws InvalidCGPAException {
        if (cgpa < 0.00 || cgpa > 4.00) {
            throw new InvalidCGPAException("CGPA must be between 0.00 and 4.00");
        }
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }

    public void viewInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", CGPA: " + cgpa);
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

            System.out.print("Enter number of students: ");
            int n = in.nextInt();
            in.nextLine(); 
            for (int i = 0; i < n; i++) {
                try {
                    System.out.println("\nStudent " + (i + 1) + " details:");
                    System.out.print("Enter ID: ");
                    int id = in.nextInt();

                    System.out.print("Enter CGPA: ");
                    double cgpa =in.nextDouble();
                   in.nextLine(); 

                    System.out.print("Enter Name: ");
                    String name = in.nextLine();

                    Student s = new Student(id, cgpa, name);
                    students.add(s);
                    
                } catch (InvalidCGPAException e) {
                    System.out.println("Invalid CGPA: " + e.getMessage());
                    i--; 
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Try again.");
                    in.nextLine(); 
                    i--;
                }
            }
            Collections.sort(students, new Comparator<Student>() {
    @Override
    public int compare(Student s1, Student s2) {
        char c1 = s1.name.length() > 1 ? s1.name.charAt(1) : 0;
        char c2 = s2.name.length() > 1 ? s2.name.charAt(1) : 0;
        return Character.compare(c2, c1); // descending
    }
});

            System.out.println("\nSorted Student Records:");
            for (Student s : students) {
                s.viewInfo();
            }

    }
}
//@Override
//public int compare(Student s1, Student s2) {
//    char c1 = s1.name.charAt(0);  // s1 er first character nitechi
//    char c2 = s2.name.charAt(0);  // s2 er first character nitechi
//    return Character.compare(c2, c1);  // descending order e compare kora
//}

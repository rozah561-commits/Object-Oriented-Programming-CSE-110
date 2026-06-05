/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


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
public class Exception2 {
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

            System.out.println("\nSorted Student Records:");
            for (Student s : students) {
                s.viewInfo();
            }

    }
}
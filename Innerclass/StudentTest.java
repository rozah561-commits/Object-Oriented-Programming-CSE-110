/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.innerclass;
class Student {
    private String name;
    private int rollNo;
    private String classGrade;

    public Student(String name, int rollNo, String classGrade) {
        this.name = name;
        this.rollNo = rollNo;
        this.classGrade = classGrade;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Class/Grade  : " + classGrade);
    }

    public void displayWithGuardian(Guardian guardian) {
        displayStudentInfo();
        guardian.displayGuardianInfo();
    }
    public static class Guardian {
        private String guardianName;
        private String relation;
        private String contactNumber;

        public Guardian(String guardianName, String relation, String contactNumber) {
            this.guardianName = guardianName;
            this.relation = relation;
            this.contactNumber = contactNumber;
        }

        public void displayGuardianInfo() {
            System.out.println("Guardian Name : " + guardianName);
            System.out.println("Relation      : " + relation);
            System.out.println("Contact No.   : " + contactNumber);
        }
    }
}

public class StudentTest {

    public static void main(String[] args) {
 
        Student student1 = new Student("Roza", 101, "Grade 6");

        Student.Guardian guardian1 = new Student.Guardian("Mr. Rahman", "Father", "017xxxxxxxx");

        student1.displayWithGuardian(guardian1);

        Student student2 = new Student("Tareq ", 102, "Grade 6");
        student2.displayStudentInfo();  
    }
}


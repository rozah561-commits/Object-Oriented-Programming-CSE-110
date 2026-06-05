/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.association2;

import java.util.ArrayList;
import java.util.List;

class Guardian {
    String name;
    String relation;
    public Guardian(String name, String relation) {
        this.name = name;
        this.relation = relation;
    }
    public void display() {
        System.out.println("Guardian Name: " + name + " Relation: " + relation);
    }
}
class Faculty {
    String name;
    int id;
    String dept;

    public Faculty(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public void teaches(List<Student> studentList) {
        System.out.println("Faculty " + name + " teaches Student:");
        for (Student aStudent : studentList) {
            System.out.println(aStudent.name);
        }
    }
    public void display() {
        System.out.println("Faculty Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + dept);
    }
}
class Student {
    String name;
    int id;
    String dept;
    Guardian guardian; 

    public Student(String name, int id, String dept, Guardian guardian) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.guardian = guardian;
    }

    public void supervision(List<Faculty> faculties) {
        System.out.println("Student " + name + " is supervised by Faculty:");
        for (Faculty aFaculty : faculties) {
            System.out.println(aFaculty.name);
        }
    }
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + dept);
        guardian.display(); 
    }
}
public class Association2{
    public static void main(String[] args) {
        Guardian guardian = new Guardian("Shamim", "Father");
        Student student = new Student("Roza", 246, "CSE", guardian);
        
        Faculty faculty = new Faculty("SDIS", 2024, "CSE");

        List<Student> studentGroup = new ArrayList<>();
        studentGroup.add(student);

        List<Faculty> facultyGroup = new ArrayList<>();
        facultyGroup.add(faculty);

        student.supervision(facultyGroup);
        faculty.teaches(studentGroup);
        guardian.display();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacee;

interface Student{
    int age = 0;
    void display();
 }
interface Employee{
    String designation = "";
    void display();
 }
class TeachingAssistant implements Student,Employee{
    int id;
    String name;
    int salary;
    int age;
   String designation;
    public TeachingAssistant(int id,String name,int salary,int age,String designation){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.designation = designation;
    }
    public void display(){
        System.out.println("ID:"+ id);
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
    }
}
public class TeachingAssistantTest {
    public static void main(String[] args) {
        TeachingAssistant t1 = new TeachingAssistant(246,"Roza",60000,21,"TA");
        t1.display();
    }
}

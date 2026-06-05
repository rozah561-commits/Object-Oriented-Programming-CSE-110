/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
class Person { 
    public String name, address, phoneNumber, email;
public Person(String name, String address, String phoneNumber, String email) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }
public String toString() {
    return "Class: Person, Name: " + name;
 }
}
class Student extends Person { 
    public static final String FRESHMAN = "Freshman"; 
    public static final String SOPHOMORE = "Sophomore"; 
    public static final String JUNIOR = "Junior"; 
    public static final String SENIOR = "Senior";
    public String status;
public Student(String name, String address, String phoneNumber, String email, String status) {
    super(name, address, phoneNumber, email);
    this.status = status;
  }
public String toString() {
    return "Class: Student, Name: " + name;
 }
}
class Employee extends Person {
    public String office;
    public double salary;
    public String dateHired;
public Employee(String name, String address, String phoneNumber, String email, String office, double salary, String dateHired) {
    super(name, address, phoneNumber, email);
    this.office = office;
    this.salary = salary;
    this.dateHired = dateHired;
  }
public String toString() {
    return "Class: Employee, Name: " + name;
 }
}
class Faculty extends Employee {
    public int officeHours; 
    public String rank;
public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, String dateHired, int officeHours, String rank) {
    super(name, address, phoneNumber, email, office, salary, dateHired);
    this.officeHours = officeHours;
    this.rank = rank;
  }
public String toString() {
    return "Class: Faculty, Name: " + name;
 }
}
class Staff extends Employee { 
    public String title;
public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String dateHired, String title) {
    super(name, address, phoneNumber, email, office, salary, dateHired);
    this.title = title;
  }
public String toString() {
    return "Class: Staff, Name: " + name;
 }
}
public class PersonTest2 { 
    public static void main(String[] args) { 
        Person person = new Person("Nobita", "123 Street", "555-1234", "john@example.com");
        Student student = new Student("Sizuka", "456 Road", "555-5678", "alice@example.com", Student.SENIOR);
        Employee employee = new Employee("Gian", "789 Avenue", "555-9876", "bob@example.com", "Room 101", 50000, "2020-01-01"); 
        Faculty faculty = new Faculty("Sunio", "321 Blvd", "555-1111", "smith@example.com", "Room 202", 75000, "2015-06-15", 10, "Professor");
        Staff staff = new Staff("Mr. Brown", "654 Lane", "555-2222", "brown@example.com", "Room 303", 45000, "2018-09-10", "Administrator");
System.out.println(person);
    System.out.println(student);
    System.out.println(employee);
    System.out.println(faculty);
    System.out.println(staff);
 }
}

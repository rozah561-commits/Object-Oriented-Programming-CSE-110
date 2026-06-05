/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
 class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void birthday() {
        age++;
    }
}
class Student extends Person {
    public String studentId;
    public int credits;
    public float gpa;
    public Student(String name, int age, String studentId, int credits, float gpa) {
        super(name, age);  
        this.studentId = studentId;
        this.credits = credits;
        this.gpa = gpa;
    }
    public void grade(int credits, int gradePoints) {
        this.credits += credits;
        this.gpa = (float) gradePoints / credits;
    }
}
class Teacher extends Person {
    public String focus;
    public int salary;
    public Teacher(String name, int age, String focus, int salary) {
        super(name, age);
        this.focus = focus;
        this.salary = salary;
    }
    public void promotion(int increment) {
        salary += increment;
    }
}
public class PersonTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics", 50000);
        teacher.promotion(5000);
        System.out.println(teacher.name + " new salary: " + teacher.salary);
        Student student = new Student("Alice", 20, "S12345", 0, 0);
        student.grade(3, 12); // 3 credits, 12 grade points (GPA = 12/3 = 4.0)
        System.out.println(student.name + " GPA: " + student.gpa + ", Credits: " + student.credits);
    }
}
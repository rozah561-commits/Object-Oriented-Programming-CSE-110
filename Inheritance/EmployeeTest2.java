/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
import java.util.Date;
class Employee { 
    public String name; 
    public Date started;
    public Employee(String name, Date started) {
        this.name = name;
        this.started = started;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStarted(Date started) {
        this.started = started;
    }
}
class FullTimeEmployee extends Employee { 
    public int pensionTier;
    public FullTimeEmployee(String name, Date started, int pensionTier) {
        super(name, started); 
        this.pensionTier = pensionTier;
    }
    public void setPensionTier(int pensionTier) {
        this.pensionTier = pensionTier;
    }
}
class PartTimeEmployee extends Employee {
    public int hoursWorked;

    public PartTimeEmployee(String name, Date started, int hoursWorked) {
        super(name, started);
        this.hoursWorked = hoursWorked;
    }
    public void setHoursWorked(int hours) {
        this.hoursWorked = hours;
    }
}
public class EmployeeTest2 { 
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("A", new Date(), 3); 
        System.out.println(fte.name + " started on " + fte.started + ", Pension Tier: " + fte.pensionTier);
        
        PartTimeEmployee pte = new PartTimeEmployee("B", new Date(), 20); 
        System.out.println(pte.name + " started on " + pte.started + ", Hours worked: " + pte.hoursWorked);
    }
}

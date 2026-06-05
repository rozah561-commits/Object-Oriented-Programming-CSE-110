/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

    class Employee {
    private String SSN;
    private String FirstName;
    private String LastName;
    public Employee(String SSN, String FirstName, String LastName) {
        this.SSN = SSN;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    public String getSSN() {
        return SSN;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public void print() {
        System.out.println(FirstName + " " + LastName);
    }
}
class HourlyEmployee extends Employee {
  private double salary;
  public HourlyEmployee(String SSN, String firstName, String lastName, double salary) {  
    super(SSN, firstName, lastName);  
    this.salary = salary;  
    }  
  public double getSalary(){
    return salary; 
    }  
  public void setSalary(double salary){
    this.salary = salary; 
    }  
  public double computeGrossPay(){
    return salary * 40; //Assuming 40 hour per week
    }  
  public double computeNetPay() {
    return computeGrossPay() * 0.8; 
    }
  public void print(){ 
    super.print(); 
  }
  
}
class SalariedEmployee extends Employee { 
    private double salary;

  public SalariedEmployee(String SSN, String firstName, String lastName, double salary) {
    super(SSN, firstName, lastName);
    this.salary = salary;
  }
  public double getSalary() { 
      return salary;
  }
  public void setSalary(double salary) {
      this.salary = salary;
  }
  public double computeGrossPay() { 
      return salary; 
  }
  public double computeNetPay() {
    return computeGrossPay() * 0.8; // Assuming 20% tax deduction
  }
  public void print() {
      super.print(); 
  }
}
public class EmployeeTest { 
    public static void main(String[] args) { 
        HourlyEmployee emp1 = new HourlyEmployee("123-45-6789", "John", "Doe", 15.0); 
        SalariedEmployee emp2 = new SalariedEmployee("987-65-4321", "Jane", "Smith", 3000.0);

System.out.println("Employee 1: ");
    emp1.print();
    System.out.println("Gross Pay: " + emp1.computeGrossPay());
    System.out.println("Net Pay: " + emp1.computeNetPay());

    System.out.println("\nEmployee 2: ");
    emp2.print();
    System.out.println("Gross Pay: " + emp2.computeGrossPay());
    System.out.println("Net Pay: " + emp2.computeNetPay());
}
}
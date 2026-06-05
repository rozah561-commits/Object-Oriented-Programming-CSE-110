/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
 class Vehicle {
  private String name;
  protected float speed;
  protected Vehicle(String name) {
    this.name = name;
    this.speed = 0;
}
  public float move(float distance) {
    return distance / speed;
}
  public String getName() {
    return name;
}
  public String describe() {
    return "Vehicle: " + name;
}
}
class MotorVehicle extends Vehicle {
   protected int number_of_wheels;
   protected float engine_volume;
   protected MotorVehicle(String name) {
    super(name);
}
public String honk_horn() {
    return "Beep Beep!";
}
}
class Truck extends MotorVehicle {
private float horsepower;
public Truck(String name, float horsepower) {
    super(name);
    this.horsepower = horsepower;
}
public String describe() {
    return "Truck: " + getName() + ", Horsepower: " + horsepower;
}
}
class Car extends MotorVehicle {
    private int num_doors;
    public Car(String name, int num_doors) {
    super(name);
    this.num_doors = num_doors;
}
    public String describe() {
    return "Car: " + getName() + ", Doors: " + num_doors;
}
}
class Airplane extends Vehicle {
     private float wingspan;
     private int capacity;
    public Airplane(String name, float wingspan, int capacity) {
    super(name);
    this.wingspan = wingspan;
    this.capacity = capacity;
}
public void landing_gear(boolean set) {
    System.out.println("Landing gear " + (set ? "deployed" : "retracted"));
}
public float move(float distance){
    return distance / (speed + 100);
}
public String describe() {
    return "Airplane: " + getName() + ", Wingspan: " + wingspan + ", Capacity: " + capacity;
}
}
 public class vehicleTest {
     public static void main(String[] args) {
     Car car = new Car("Sedan", 4);
     Truck truck = new Truck("Freightliner", 400);
     Airplane airplane = new Airplane("Boeing 747", 60, 500);

System.out.println(car.describe());
    System.out.println(truck.describe());
    System.out.println(airplane.describe());

    System.out.println(car.honk_horn());
    System.out.println(truck.honk_horn());
    airplane.landing_gear(true);
}
}
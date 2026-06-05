/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
import java.util.Date;
class GeometricObject {
    private String color = "white"; 
    private boolean filled = false; 
    private Date dateCreated;
public GeometricObject() {
    dateCreated = new Date();
}
public GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
    dateCreated = new Date();
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}
public boolean isFilled() {
    return filled;
}
public void setFilled(boolean filled) {
    this.filled = filled;
}
public Date getDateCreated() {
    return dateCreated;
}
public String toString() {
    return "GeometricObject created on " + dateCreated + " Color: " + color + " Filled: " + filled;
}
}
 class Circle extends GeometricObject {
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("Circle created on: " + getDateCreated() + ", Radius: " + radius);
    }
}
class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
public class GeometricObjectTest { 
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "blue", true);
        System.out.println("Circle Details:");
        circle.printCircle();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(4.0, 7.0, "red", false);
        System.out.println("Rectangle Details:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());
    }
}
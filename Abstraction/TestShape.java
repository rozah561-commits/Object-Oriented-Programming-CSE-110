/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;
    abstract class Shape{
     private String color;
     public abstract double getArea();
    @Override
    public String toString() {
        return "Shape{" + "color=" + color + '}';
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
    this.color = color;
 }
}
    class Rectangle extends Shape{
        private int length;
        private int width;
       public double getArea(){
            return length*width;
        }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }       
    }
    class Triangle extends Shape{
        private int base;
        private int height;
      public double getArea(){
            return 0.5*base*height;
        }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + '}';
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }       
    }
public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(); 
        Rectangle r = (Rectangle) s1; 

        r.setLength(10);
        r.setWidth(5);
        r.setColor("Blue");

        System.out.println("Rectangle:");
        System.out.println("Area: " + r.getArea());
        System.out.println("Color: " + r.getColor());
        System.out.println(r.toString());
        
        Shape s2 = new Triangle(); 
        Triangle t = (Triangle) s2;  

        t.setBase(6);
        t.setHeight(4);
        t.setColor("Red");

        System.out.println("\nTriangle:");
        System.out.println("Area: " + t.getArea());
        System.out.println("Color: " + t.getColor());
        System.out.println(t.toString());
    }
}

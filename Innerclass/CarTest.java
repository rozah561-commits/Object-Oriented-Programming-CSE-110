/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.innerclass;

 class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void displayModel() {
        System.out.println("Car Model: " + model);
    }

    public static class Wheel {
        private String type;

        public Wheel(String type) {
            this.type = type;
        }

        public void rotate() {
            System.out.println("The " + type + " wheel is rotating.");
        }
    }
}

public class CarTest {

    public static void main(String[] args) {

        Car car = new Car("Toyota Corolla");
        car.displayModel();

        Car.Wheel wheel = new Car.Wheel("Alloy");
        wheel.rotate();
    }
}


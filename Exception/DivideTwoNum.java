/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

import java.util.Scanner;

public class DivideTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator:");
            int numerator = in.nextInt();

            System.out.print("Enter the denominator:");
            int denominator = in.nextInt();
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

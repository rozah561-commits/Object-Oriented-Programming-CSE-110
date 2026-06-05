/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;
import java.util.*;

public class MismatchException {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the first integer: ");
                n1 = in.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                in.next(); 
            }
        }

        validInput = false; 
        while (!validInput) {
            try {
                System.out.print("Enter the second integer: ");
                n2 = in.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                in.next(); 
            }
        }

        int sum = n1 + n2;
        System.out.println("The sum is: " + sum);
    }
}

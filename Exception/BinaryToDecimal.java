/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 
package exception;
import java.util.Scanner;

public class BinaryToDecimal {

    public static int bin2Dec(String binaryString) throws NumberFormatException {
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            if (c != '0' && c != '1') {
                throw new NumberFormatException("Invalid binary string");
            }
        }
        return Integer.parseInt(binaryString, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binary = input.nextLine();

        try {
            int decimal = bin2Dec(binary);
            System.out.println("Decimal value: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
//import java.util.Scanner;
//
//public class BinaryConverterNoMethod {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a binary string: ");
//        String binaryString = input.nextLine();
//
//        try {
//            for (int i = 0; i < binaryString.length(); i++) {
//                char c = binaryString.charAt(i);
//                if (c != '0' && c != '1') {
//                    throw new NumberFormatException("Invalid binary string: " + binaryString);
//                }
//            }
//
//            int decimal = Integer.parseInt(binaryString, 2);
//            System.out.println("Decimal value: " + decimal);
//        } catch (NumberFormatException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        input.close();
//    }
//}
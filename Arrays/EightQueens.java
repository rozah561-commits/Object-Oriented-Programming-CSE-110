/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;
public class EightQueens {
    static final int SIZE = 8;

    public static void main(String[] args) {
        int[] queens = new int[SIZE]; // queens[row] = column
        placeQueen(queens, 0);
    }

    public static boolean placeQueen(int[] queens, int row) {
        if (row == SIZE) {
            printBoard(queens);
            return true;
        }

        for (int col = 0; col < SIZE; col++) {
            if (isSafe(queens, row, col)) {
                queens[row] = col;
                if (placeQueen(queens, row + 1)) return true;
            }
        }
        return false;
    }

    public static boolean isSafe(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == row - i)
                return false;
        }
        return true;
    }

    public static void printBoard(int[] queens) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print((queens[row] == col ? "|Q" : "| ") );
            }
            System.out.println("|");
        }
    }
}
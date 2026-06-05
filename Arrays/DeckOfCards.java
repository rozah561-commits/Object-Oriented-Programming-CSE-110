/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

public class DeckOfCards {
 public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        System.out.println("Randomly selected four cards:");
        
        for (int i = 0; i < 4; i++) {
            int suitIndex = (int) (Math.random() * suits.length);
            int rankIndex = (int) (Math.random() * ranks.length);
          
            System.out.println(ranks[rankIndex] + " of " + suits[suitIndex]);
        }
    }
}
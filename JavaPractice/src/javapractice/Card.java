/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

/**
 *
 * @author Harshit Jain
 */
public class Card {
    private final String face; // face of card ("Ace", "Deuce", ... )
    private final String suit; // suit of card ("Hearts", "Diamonds", ...)
    
    // two-argument constructor initializes card's face and suit
    public Card (String cardFace, String cardSuit ) {
        this.face = cardFace; // initializes face of card
        this.suit = cardSuit; // initializes suit of card
    }
    
    // return String representation of Card
    public String toString() { // method toString() creates a string
        return face + " of " + suit;
    }
}

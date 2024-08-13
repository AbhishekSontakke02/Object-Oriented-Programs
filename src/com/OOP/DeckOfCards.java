package com.OOP;

import java.util.Random;

public class DeckOfCards {
	String []  suits = {"Clubs","Dimonds","Hearts","Spades"};
	String [] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	String [] deck = new String[52];
	String [] [] player = new String [4] [9];
	
	void initalizeDeck() {
		int index = 0;
		for(String suit : suits) {
			for(String rank : ranks) {
				deck[index] = rank + " of " + suit;
				index++;
			}
		}
	}
	void shuffleDeck() {
		Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
	}
	void distributeCards() {
		int index =0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j<9;j++) {
				player[i][j] = deck[index];
				index++;
			}
		}
	}
	void printPlayerCards() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < 9; j++) {
                System.out.println(player[i][j]);
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		DeckOfCards obj = new DeckOfCards();
		obj.initalizeDeck();
		obj.shuffleDeck();
		obj.distributeCards();
		obj.printPlayerCards();
	}
}

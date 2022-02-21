package com.org.gen.day4;

 enum Suit {
    
    SPADES, HEARTS, DIAMONDS, CLUBS;
    
    public String toString() {
       switch (this) {
       case SPADES:   return "Spades";
       case HEARTS:   return "Hearts";
       case DIAMONDS: return "Diamonds";
       default:       return "Clubs";    
       } 
    }
 
 }
 enum CardValue {
    
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
    NINE, TEN, JACK, QUEEN, KING;
    
    
    public int blackJackValue() {
       if (this == JACK || this == QUEEN || this == KING)
          return 10;
       else
          return 1 + ordinal();
    }
    
    
    public String toString() {
       switch (this) {       
       case ACE:             
          return "Ace";
       case JACK:            
          return "Jack";
       case QUEEN:            
          return "Queen";
       case KING:            
          return "King";
       default:            
          int numericValue = 1 + ordinal();
       return "" + numericValue;     
       }
    }
    
 } 

class Card {
    
   
    private final Suit suit; 
    
  
    private final CardValue value;
       
   
    public Card(CardValue theValue, Suit theSuit) {
       if (theValue == null || theSuit == null)
          throw new NullPointerException("Card suit and value cannot be null.");
       value = theValue;
       suit = theSuit;
    }
 
   
    public Suit getSuit() {
       return suit;
    }
    
   
    public CardValue getValue() {
       return value;
    }
    
    
  
    public String toString() {
       return value + " of " + suit;
    }
    
 
 }

public class TestCardEnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The 52 cards are:\n");
        for ( Suit suit : Suit.values() )
           for ( CardValue value : CardValue.values() ) {
              Card c = new Card(value, suit);
              System.out.println("   " + c);
           }

	}

}

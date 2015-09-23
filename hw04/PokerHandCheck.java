//Clarisa Kelly
// Homework #4
//Program generates 5 random cards and checks if the hand has a
//pair, a two pair, three of a kind, or a high card hand

import java.util.Random;

public class PokerHandCheck{
public static void main (String[] args){
    int cardnumber1 = (int)(Math.random()*53);
    int cardnumber2 = (int)(Math.random()*53);
    int cardnumber3 = (int)(Math.random()*53);
    int cardnumber4 = (int)(Math.random()*53);
    int cardnumber5 = (int)(Math.random()*53);
    String cardtype1, cardtype2, cardtype3, cardtype4, cardtype5,
    suitname1, suitname2, suitname3, suitname4, suitname5;
    
//assign card 1 a suit and identity    
if(cardnumber1>0 && cardnumber1<=13){
    suitname1 = "Diamonds";
    switch (cardnumber1) {
            case 1:  cardtype1= "Ace";
                     break;
            case 2:  cardtype1= "2";
                     break;
            case 3:  cardtype1= "3";
                     break;
            case 4:  cardtype1= "4";
                     break;
            case 5:  cardtype1= "5";
                     break;
            case 6:  cardtype1= "6";
                     break;
            case 7:  cardtype1= "7";
                     break;
            case 8:  cardtype1= "8";
                     break;
            case 9:  cardtype1= "9";
                     break;
            case 10: cardtype1= "10";
                     break;
            case 11: cardtype1= "Jack";
                     break;
            case 12: cardtype1= "Queen";
                     break;
            default: cardtype1= "King";
                     break;
        }
}else if (cardnumber1>13 && cardnumber1<=26){
    suitname1 = "Clubs";
    switch (cardnumber1) {
            case 14:  cardtype1= "Ace";
                     break;
            case 15:  cardtype1= "2";
                     break;
            case 16:  cardtype1= "3";
                     break;
            case 17:  cardtype1= "4";
                     break;
            case 18:  cardtype1= "5";
                     break;
            case 19:  cardtype1= "6";
                     break;
            case 20:  cardtype1= "7";
                     break;
            case 21:  cardtype1= "8";
                     break;
            case 22:  cardtype1= "9";
                     break;
            case 23: cardtype1= "10";
                     break;
            case 24: cardtype1= "Jack";
                     break;
            case 25: cardtype1= "Queen";
                     break;
            default: cardtype1= "King";
                     break;
        }
}else if (cardnumber1>26 && cardnumber1<=39){
    suitname1 = "Hearts";
    switch (cardnumber1) {
            case 27:  cardtype1= "Ace";
                     break;
            case 28:  cardtype1= "2";
                     break;
            case 29:  cardtype1= "3";
                     break;
            case 30:  cardtype1= "4";
                     break;
            case 31:  cardtype1= "5";
                     break;
            case 32:  cardtype1= "6";
                     break;
            case 33:  cardtype1= "7";
                     break;
            case 34:  cardtype1= "8";
                     break;
            case 35:  cardtype1= "9";
                     break;
            case 36: cardtype1= "10";
                     break;
            case 37: cardtype1= "Jack";
                     break;
            case 38: cardtype1= "Queen";
                     break;
            default: cardtype1= "King";
                     break;
        }
}else{
    suitname1 = "Spades";
    switch (cardnumber1) {
            case 40:  cardtype1= "Ace";
                     break;
            case 41:  cardtype1= "2";
                     break;
            case 42:  cardtype1= "3";
                     break;
            case 43:  cardtype1= "4";
                     break;
            case 44:  cardtype1= "5";
                     break;
            case 45:  cardtype1= "6";
                     break;
            case 46:  cardtype1= "7";
                     break;
            case 47:  cardtype1= "8";
                     break;
            case 48:  cardtype1= "9";
                     break;
            case 49: cardtype1= "10";
                     break;
            case 50: cardtype1= "Jack";
                     break;
            case 51: cardtype1= "Queen";
                     break;
            default: cardtype1= "King";
                     break;
        }
}

    //assign a suit and identity to card 2
    if(cardnumber2>0 && cardnumber2<=13){
    suitname2 = "Diamonds";
    switch (cardnumber2) {
            case 1:  cardtype2= "Ace";
                     break;
            case 2:  cardtype2= "2";
                     break;
            case 3:  cardtype2= "3";
                     break;
            case 4:  cardtype2= "4";
                     break;
            case 5:  cardtype2= "5";
                     break;
            case 6:  cardtype2= "6";
                     break;
            case 7:  cardtype2= "7";
                     break;
            case 8:  cardtype2= "8";
                     break;
            case 9:  cardtype2= "9";
                     break;
            case 10: cardtype2= "10";
                     break;
            case 11: cardtype2= "Jack";
                     break;
            case 12: cardtype2= "Queen";
                     break;
            default: cardtype2= "King";
                     break;
        }
}else if (cardnumber2>13 && cardnumber2<=26){
    suitname2 = "Clubs";
    switch (cardnumber2) {
            case 14:  cardtype2= "Ace";
                     break;
            case 15:  cardtype2= "2";
                     break;
            case 16:  cardtype2= "3";
                     break;
            case 17:  cardtype2= "4";
                     break;
            case 18:  cardtype2= "5";
                     break;
            case 19:  cardtype2= "6";
                     break;
            case 20:  cardtype2= "7";
                     break;
            case 21:  cardtype2= "8";
                     break;
            case 22:  cardtype2= "9";
                     break;
            case 23: cardtype2= "10";
                     break;
            case 24: cardtype2= "Jack";
                     break;
            case 25: cardtype2= "Queen";
                     break;
            default: cardtype2= "King";
                     break;
        }
}else if (cardnumber2>26 && cardnumber2<=39){
    suitname2 = "Hearts";
    switch (cardnumber2) {
            case 27:  cardtype2= "Ace";
                     break;
            case 28:  cardtype2= "2";
                     break;
            case 29:  cardtype2= "3";
                     break;
            case 30:  cardtype2= "4";
                     break;
            case 31:  cardtype2= "5";
                     break;
            case 32:  cardtype2= "6";
                     break;
            case 33:  cardtype2= "7";
                     break;
            case 34:  cardtype2= "8";
                     break;
            case 35:  cardtype2= "9";
                     break;
            case 36: cardtype2= "10";
                     break;
            case 37: cardtype2= "Jack";
                     break;
            case 38: cardtype2= "Queen";
                     break;
            default: cardtype2= "King";
                     break;
        }
}else{
    suitname2 = "Spades";
    switch (cardnumber2) {
            case 40:  cardtype2= "Ace";
                     break;
            case 41:  cardtype2= "2";
                     break;
            case 42:  cardtype2= "3";
                     break;
            case 43:  cardtype2= "4";
                     break;
            case 44:  cardtype2= "5";
                     break;
            case 45:  cardtype2= "6";
                     break;
            case 46:  cardtype2= "7";
                     break;
            case 47:  cardtype2= "8";
                     break;
            case 48:  cardtype2= "9";
                     break;
            case 49: cardtype2= "10";
                     break;
            case 50: cardtype2= "Jack";
                     break;
            case 51: cardtype2= "Queen";
                     break;
            default: cardtype2= "King";
                     break;
        }
}
        //assign suit and identity to card 3
        if(cardnumber3>0 && cardnumber3<=13){
        suitname3 = "Diamonds";
        switch (cardnumber3) {
            case 1:  cardtype3= "Ace";
                     break;
            case 2:  cardtype3= "2";
                     break;
            case 3:  cardtype3= "3";
                     break;
            case 4:  cardtype3= "4";
                     break;
            case 5:  cardtype3= "5";
                     break;
            case 6:  cardtype3= "6";
                     break;
            case 7:  cardtype3= "7";
                     break;
            case 8:  cardtype3= "8";
                     break;
            case 9:  cardtype3= "9";
                     break;
            case 10: cardtype3= "10";
                     break;
            case 11: cardtype3= "Jack";
                     break;
            case 12: cardtype3= "Queen";
                     break;
            default: cardtype3= "King";
                     break;
        }
}else if (cardnumber3>13 && cardnumber3<=26){
    suitname3 = "Clubs";
    switch (cardnumber3) {
            case 14:  cardtype3= "Ace";
                     break;
            case 15:  cardtype3= "2";
                     break;
            case 16:  cardtype3= "3";
                     break;
            case 17:  cardtype3= "4";
                     break;
            case 18:  cardtype3= "5";
                     break;
            case 19:  cardtype3= "6";
                     break;
            case 20:  cardtype3= "7";
                     break;
            case 21:  cardtype3= "8";
                     break;
            case 22:  cardtype3= "9";
                     break;
            case 23: cardtype3= "10";
                     break;
            case 24: cardtype3= "Jack";
                     break;
            case 25: cardtype3= "Queen";
                     break;
            default: cardtype3= "King";
                     break;
        }
}else if (cardnumber3>26 && cardnumber3<=39){
    suitname3 = "Hearts";
    switch (cardnumber3) {
            case 27:  cardtype3= "Ace";
                     break;
            case 28:  cardtype3= "2";
                     break;
            case 29:  cardtype3= "3";
                     break;
            case 30:  cardtype3= "4";
                     break;
            case 31:  cardtype3= "5";
                     break;
            case 32:  cardtype3= "6";
                     break;
            case 33:  cardtype3= "7";
                     break;
            case 34:  cardtype3= "8";
                     break;
            case 35:  cardtype3= "9";
                     break;
            case 36: cardtype3= "10";
                     break;
            case 37: cardtype3= "Jack";
                     break;
            case 38: cardtype3= "Queen";
                     break;
            default: cardtype3= "King";
                     break;
        }
}else{
    suitname3 = "Spades";
    switch (cardnumber3) {
            case 40:  cardtype3= "Ace";
                     break;
            case 41:  cardtype3= "2";
                     break;
            case 42:  cardtype3= "3";
                     break;
            case 43:  cardtype3= "4";
                     break;
            case 44:  cardtype3= "5";
                     break;
            case 45:  cardtype3= "6";
                     break;
            case 46:  cardtype3= "7";
                     break;
            case 47:  cardtype3= "8";
                     break;
            case 48:  cardtype3= "9";
                     break;
            case 49: cardtype3= "10";
                     break;
            case 50: cardtype3= "Jack";
                     break;
            case 51: cardtype3= "Queen";
                     break;
            default: cardtype3= "King";
                     break;
        }
}
        //assign a suit and identity to card 4
        if(cardnumber4>0 && cardnumber4<=13){
        suitname4 = "Diamonds";
        switch (cardnumber4) {
            case 1:  cardtype4= "Ace";
                     break;
            case 2:  cardtype4= "2";
                     break;
            case 3:  cardtype4= "3";
                     break;
            case 4:  cardtype4= "4";
                     break;
            case 5:  cardtype4= "5";
                     break;
            case 6:  cardtype4= "6";
                     break;
            case 7:  cardtype4= "7";
                     break;
            case 8:  cardtype4= "8";
                     break;
            case 9:  cardtype4= "9";
                     break;
            case 10: cardtype4= "10";
                     break;
            case 11: cardtype4= "Jack";
                     break;
            case 12: cardtype4= "Queen";
                     break;
            default: cardtype4= "King";
                     break;
        }
}else if (cardnumber4>13 && cardnumber4<=26){
    suitname4 = "Clubs";
    switch (cardnumber4) {
            case 14:  cardtype4= "Ace";
                     break;
            case 15:  cardtype4= "2";
                     break;
            case 16:  cardtype4= "3";
                     break;
            case 17:  cardtype4= "4";
                     break;
            case 18:  cardtype4= "5";
                     break;
            case 19:  cardtype4= "6";
                     break;
            case 20:  cardtype4= "7";
                     break;
            case 21:  cardtype4= "8";
                     break;
            case 22:  cardtype4= "9";
                     break;
            case 23: cardtype4= "10";
                     break;
            case 24: cardtype4= "Jack";
                     break;
            case 25: cardtype4= "Queen";
                     break;
            default: cardtype4= "King";
                     break;
        }
    }else if (cardnumber4>26 && cardnumber4<=39){
        suitname4 = "Hearts";
        switch (cardnumber4) {
            case 27:  cardtype4= "Ace";
                     break;
            case 28:  cardtype4= "2";
                     break;
            case 29:  cardtype4= "3";
                     break;
            case 30:  cardtype4= "4";
                     break;
            case 31:  cardtype4= "5";
                     break;
            case 32:  cardtype4= "6";
                     break;
            case 33:  cardtype4= "7";
                     break;
            case 34:  cardtype4= "8";
                     break;
            case 35:  cardtype4= "9";
                     break;
            case 36: cardtype4= "10";
                     break;
            case 37: cardtype4= "Jack";
                     break;
            case 38: cardtype4= "Queen";
                     break;
            default: cardtype4= "King";
                     break;
        }
    }else{
        suitname4 = "Spades";
        switch (cardnumber4) {
            case 40:  cardtype4= "Ace";
                     break;
            case 41:  cardtype4= "2";
                     break;
            case 42:  cardtype4= "3";
                     break;
            case 43:  cardtype4= "4";
                     break;
            case 44:  cardtype4= "5";
                     break;
            case 45:  cardtype4= "6";
                     break;
            case 46:  cardtype4= "7";
                     break;
            case 47:  cardtype4= "8";
                     break;
            case 48:  cardtype4= "9";
                     break;
            case 49: cardtype4= "10";
                     break;
            case 50: cardtype4= "Jack";
                     break;
            case 51: cardtype4= "Queen";
                     break;
            default: cardtype4= "King";
                     break;
        }
}
        //assign card 5 a suit and identity
        if(cardnumber5>0 && cardnumber5<=13){
    suitname5 = "Diamonds";
    switch (cardnumber5) {
            case 1:  cardtype5= "Ace";
                     break;
            case 2:  cardtype5= "2";
                     break;
            case 3:  cardtype5= "3";
                     break;
            case 4:  cardtype5= "4";
                     break;
            case 5:  cardtype5= "5";
                     break;
            case 6:  cardtype5= "6";
                     break;
            case 7:  cardtype5= "7";
                     break;
            case 8:  cardtype5= "8";
                     break;
            case 9:  cardtype5= "9";
                     break;
            case 10: cardtype5= "10";
                     break;
            case 11: cardtype5= "Jack";
                     break;
            case 12: cardtype5= "Queen";
                     break;
            default: cardtype5= "King";
                     break;
        }
}else if (cardnumber5>13 && cardnumber5<=26){
    suitname5 = "Clubs";
    switch (cardnumber5) {
            case 14:  cardtype5= "Ace";
                     break;
            case 15:  cardtype5= "2";
                     break;
            case 16:  cardtype5= "3";
                     break;
            case 17:  cardtype5= "4";
                     break;
            case 18:  cardtype5= "5";
                     break;
            case 19:  cardtype5= "6";
                     break;
            case 20:  cardtype5= "7";
                     break;
            case 21:  cardtype5= "8";
                     break;
            case 22:  cardtype5= "9";
                     break;
            case 23: cardtype5= "10";
                     break;
            case 24: cardtype5= "Jack";
                     break;
            case 25: cardtype5= "Queen";
                     break;
            default: cardtype5= "King";
                     break;
        }
}else if (cardnumber5>26 && cardnumber5<=39){
    suitname5 = "Hearts";
    switch (cardnumber5) {
            case 27:  cardtype5= "Ace";
                     break;
            case 28:  cardtype5= "2";
                     break;
            case 29:  cardtype5= "3";
                     break;
            case 30:  cardtype5= "4";
                     break;
            case 31:  cardtype5= "5";
                     break;
            case 32:  cardtype5= "6";
                     break;
            case 33:  cardtype5= "7";
                     break;
            case 34:  cardtype5= "8";
                     break;
            case 35:  cardtype5= "9";
                     break;
            case 36: cardtype5= "10";
                     break;
            case 37: cardtype5= "Jack";
                     break;
            case 38: cardtype5= "Queen";
                     break;
            default: cardtype5= "King";
                     break;
        }
}else{
    suitname5 = "Spades";
    switch (cardnumber5) {
            case 40:  cardtype5= "Ace";
                     break;
            case 41:  cardtype5= "2";
                     break;
            case 42:  cardtype5= "3";
                     break;
            case 43:  cardtype5= "4";
                     break;
            case 44:  cardtype5= "5";
                     break;
            case 45:  cardtype5= "6";
                     break;
            case 46:  cardtype5= "7";
                     break;
            case 47:  cardtype5= "8";
                     break;
            case 48:  cardtype5= "9";
                     break;
            case 49: cardtype5= "10";
                     break;
            case 50: cardtype5= "Jack";
                     break;
            case 51: cardtype5= "Queen";
                     break;
            default: cardtype5= "King";
                     break;
        }
}
    //Print out the random hand
    System.out.println("The "+cardtype1+" of "+suitname1);
    System.out.println("The "+cardtype2+" of "+suitname2);
    System.out.println("The "+cardtype3+" of "+suitname3);
    System.out.println("The "+cardtype4+" of "+suitname4);
    System.out.println("The "+cardtype5+" of "+suitname5);
    
    //first check for three of a kind, aka see if any three card types match
    if((cardtype1==cardtype2 && cardtype2==cardtype3) || (cardtype1==cardtype3 && cardtype3==cardtype4) || (cardtype1==cardtype4 && cardtype4==cardtype5) || (cardtype1==cardtype2 && cardtype2==cardtype4) || (cardtype1==cardtype2 && cardtype2==cardtype5) || (cardtype1==cardtype3 && cardtype3==cardtype5) || (cardtype2==cardtype4 && cardtype4==cardtype5) || (cardtype2==cardtype3 && cardtype3==cardtype4) || (cardtype3==cardtype4 && cardtype4==cardtype5) || (cardtype2==cardtype3 && cardtype3==cardtype5)){
        System.out.println(" ");
        System.out.println("You have three of a kind!");
    //check for one pair, aka see if any two card types match
    }else if(cardtype1==cardtype2 || cardtype1==cardtype3 || cardtype1==cardtype4 || cardtype1==cardtype5 || cardtype2==cardtype3 || cardtype2==cardtype4 || cardtype2==cardtype5 || cardtype3==cardtype4 || cardtype3==cardtype5 || cardtype4==cardtype5){
        //check for another pair, to see if it is a two pair hand
        //if(two cards have same type different from previous match){
            //System.out.println(" ");
            //System.out.println("You have two pairs!");
        //else{
            System.out.println(" ");
            System.out.println("You have a pair!");
       // }
    }else{
    System.out.println(" ");
    System.out.println("You have a high card hand!");
}
}
}
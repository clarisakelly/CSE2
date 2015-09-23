//Clarisa Kelly
// Lab 04
// Program randomly generates and prints a card from a normal deck of 52

//import Random number generator
import java.util.Random;

//define class
public class CardGenerator{
public static void main (String[] args){
    int cardnumber = (int)(Math.random()*53);
    String suitname, cardtype;

if(cardnumber>0 && cardnumber<=13){
    suitname = "Diamonds";
    switch (cardnumber) {
            case 1:  cardtype = "Ace";
                     break;
            case 2:  cardtype = "2";
                     break;
            case 3:  cardtype = "3";
                     break;
            case 4:  cardtype = "4";
                     break;
            case 5:  cardtype = "5";
                     break;
            case 6:  cardtype = "6";
                     break;
            case 7:  cardtype = "7";
                     break;
            case 8:  cardtype = "8";
                     break;
            case 9:  cardtype = "9";
                     break;
            case 10: cardtype = "10";
                     break;
            case 11: cardtype = "Jack";
                     break;
            case 12: cardtype = "Queen";
                     break;
            default: cardtype = "King";
                     break;
        }
}else if (cardnumber>13 && cardnumber<=26){
    suitname = "Clubs";
    switch (cardnumber) {
            case 14:  cardtype = "Ace";
                     break;
            case 15:  cardtype = "2";
                     break;
            case 16:  cardtype = "3";
                     break;
            case 17:  cardtype = "4";
                     break;
            case 18:  cardtype = "5";
                     break;
            case 19:  cardtype = "6";
                     break;
            case 20:  cardtype = "7";
                     break;
            case 21:  cardtype = "8";
                     break;
            case 22:  cardtype = "9";
                     break;
            case 23: cardtype = "10";
                     break;
            case 24: cardtype = "Jack";
                     break;
            case 25: cardtype = "Queen";
                     break;
            default: cardtype = "King";
                     break;
        }
}else if (cardnumber>26 && cardnumber<=39){
    suitname = "Hearts";
    switch (cardnumber) {
            case 27:  cardtype = "Ace";
                     break;
            case 28:  cardtype = "2";
                     break;
            case 29:  cardtype = "3";
                     break;
            case 30:  cardtype = "4";
                     break;
            case 31:  cardtype = "5";
                     break;
            case 32:  cardtype = "6";
                     break;
            case 33:  cardtype = "7";
                     break;
            case 34:  cardtype = "8";
                     break;
            case 35:  cardtype = "9";
                     break;
            case 36: cardtype = "10";
                     break;
            case 37: cardtype = "Jack";
                     break;
            case 38: cardtype = "Queen";
                     break;
            default: cardtype = "King";
                     break;
        }
}else{
    suitname = "Spades";
    switch (cardnumber) {
            case 40:  cardtype = "Ace";
                     break;
            case 41:  cardtype = "2";
                     break;
            case 42:  cardtype = "3";
                     break;
            case 43:  cardtype = "4";
                     break;
            case 44:  cardtype = "5";
                     break;
            case 45:  cardtype = "6";
                     break;
            case 46:  cardtype = "7";
                     break;
            case 47:  cardtype = "8";
                     break;
            case 48:  cardtype = "9";
                     break;
            case 49: cardtype = "10";
                     break;
            case 50: cardtype = "Jack";
                     break;
            case 51: cardtype = "Queen";
                     break;
            default: cardtype = "King";
                     break;
        }
}
}
}
        
// Clarisa Kelly
// Hw #10
//Program prints out all cards in the deck, shuffles them, then picks a random hand of 5

import java.util.Random;

public class Shuffling{
  public static void main(String[] args) {
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
String[] cards = new String[52];
String[] hand = new String[5];
for (int i=0; i<52; i++){
  cards[i]=rankNames[i%13]+suitNames[i/13];
  System.out.print(cards[i]+" ");
}System.out.println();
shuffle(cards);
printArray(cards);
hand = randomizeHand(cards);
printArray(hand);
  }
  public static void printArray(String list[]){
      for(int j=0; j<list.length; j++){
          System.out.print(list[j]+" ");
      }System.out.println(" ");
  }
  
  public static void shuffle(String list1[]){
    int a=0;
    for (int k = 0; k <53; k++){
      int index = ((int)(Math.random() * 52));
      a = list1[index];
      list1[index] = list1[0];
      list1[0] = a;
    }
  }
  public static String[] randomizeHand(String list2[]){
      String[] anArray = new String[5];
      anArray[0]= list2[3];
      anArray[1]= list2[36];
      anArray[2]= list2[18];
      anArray[3]= list2[50];
      anArray[4]= list2[27];
      return anArray;
      
  }
  
}

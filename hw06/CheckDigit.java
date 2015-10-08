//Clarisa Kelly
// HW 6, Program 2
// Checks to see if 10 digit ISBNs entered by user are valid

import java.util.Scanner;

public class CheckDigit{
public static void main (String[] args){
    Scanner myScanner = new Scanner(System.in);
    
   int ISBNnumber=0;
   String ISBNstring;
   int length=0;
    
    do {
            try {
                System.out.print("Please enter a 10 digit ISBN number: ");
                ISBNnumber = myScanner.nextInt();
                ISBNstring = Integer.toString(ISBNnumber);
                length = ISBNstring.length();
            } catch (Exception e) {
                ISBNstring = "j";
                myScanner.nextLine();
            }
        } while (length != 10);
        
        int digit1 = Character.getNumericValue(ISBNstring.charAt(0));
        int digit2 = Character.getNumericValue(ISBNstring.charAt(1));
        int digit3 = Character.getNumericValue(ISBNstring.charAt(2));
        int digit4 = Character.getNumericValue(ISBNstring.charAt(3));
        int digit5 = Character.getNumericValue(ISBNstring.charAt(4));
        int digit6 = Character.getNumericValue(ISBNstring.charAt(5));
        int digit7 = Character.getNumericValue(ISBNstring.charAt(6));
        int digit8 = Character.getNumericValue(ISBNstring.charAt(7));
        int digit9 = Character.getNumericValue(ISBNstring.charAt(8));
        int digit10 = Character.getNumericValue(ISBNstring.charAt(9));
        
        int digitSum = digit1*10 + digit2*9 + digit3*8 + digit4*7 + digit5*6 + digit6*5 + digit7*4 + digit8*3 + digit9*2;
        int matchNumber = digitSum % 11;
        
        if(matchNumber==digit10){
            System.out.println("This is a valid ISBN.");
        }else{
            System.out.println("This is NOT a valid ISBN. Check digit should be "+matchNumber+".");
        }
}
}
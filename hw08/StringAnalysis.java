//Clarisa Kelly
//Homework #8
// Program analyzes a user-entered String to check if each character is a letter or not

import java.util.Scanner;

public class StringAnalysis{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        String enteredString = myScanner.next();
        
        System.out.print("Enter the number of characters you want to check: ");
        boolean acceptable = false;
        int checker = 0;
        
        while( !acceptable ){
            //check if the input is an int
            if (myScanner.hasNextInt()){
                checker = myScanner.nextInt();
                if(checker >0){
                acceptable = true;
                break;
                }else{
                    acceptable = false;
                }
            }
            else{
            System.out.println("ERROR: Input must be an integer greater than zero.");
            System.out.print("Enter the number of characters you want to check: ");
            myScanner.next();
            }
            }
            
            if(checker > enteredString.length()){
                checker = enteredString.length();
            }
            
            ifNumber(enteredString,checker);
            
        
        
    }public static boolean ifNumber(String userinput, int counter){
       
       for(int i=0; i<counter; i++){
           if(userinput.charAt(int i) >= 'a' && userinput.charAt(int i)<= 'z' ){
               return true;
           }else{
               return false;
           }
       }
       
    }
}

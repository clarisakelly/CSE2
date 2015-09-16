//Clarisa Kelly
// HW #3
// User inputs current time and time they are going to eat dinner
// Program returns time left until dinner, all in military time

import java.util.Scanner;

public class Timer{
    public static void main (String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
       // Ask user for current time    
       System.out.print("Enter the current time: ");
       int currenttime = myScanner.nextInt();
       
       // Ask user for dinner time
       System.out.print("Enter the time that you will be eating dinner: ");
       int dinnertime = myScanner.nextInt();
        
        //calculate remaining time
        int timeleft = dinnertime - currenttime;
        
        int minutes=timeleft%100;
        double decimalhours = timeleft/100;
        int hours = (int)decimalhours;
        
        System.out.println("You have "+hours+" hours and "+minutes+ " minutes until dinner.");
        
}
}
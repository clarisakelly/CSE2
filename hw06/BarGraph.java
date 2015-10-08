// Clarisa Kelly
// Hw #6
// User inputs expenses for every day in the week
// Program produces bar graph based on info and then produces average weekly
// expenses, and estimates the expenses for one year

import java.util.Scanner;
import java.util.Random;

public class BarGraph {

    public static void main(String[] args) {

        Scanner myScanner;
        myScanner = new Scanner(System.in);

        float mon, tues, wed, thurs, fri, sat, sun;
        
        //input Monday Expenses
        do {
            try {
                System.out.print("Expenses for Monday: ");
                mon = myScanner.nextFloat();
            } catch (Exception e) {
                mon = -1;
                myScanner.nextLine();
            }
        } while (mon < 0);
        
        //input Tuesday Expenses
         do {
            try {
                System.out.print("Expenses for Tuesday: ");
                tues = myScanner.nextFloat();
            } catch (Exception e) {
                tues = -1;
                myScanner.nextLine();
            }
        } while (tues < 0);
        
        //input Wednesday expenses
          do {
            try {
                System.out.print("Expenses for Wednesday: ");
                wed = myScanner.nextFloat();
            } catch (Exception e) {
                wed = -1;
                myScanner.nextLine();
            }
        } while (wed < 0);
        
        //input Thursday expenses
          do {
            try {
                System.out.print("Expenses for Thursday: ");
                thurs = myScanner.nextFloat();
            } catch (Exception e) {
                thurs= -1;
                myScanner.nextLine();
            }
        } while (thurs < 0);
        
        //input Friday expenses
          do {
            try {
                System.out.print("Expenses for Friday: ");
                fri = myScanner.nextFloat();
            } catch (Exception e) {
                fri = -1;
                myScanner.nextLine();
            }
        } while (fri < 0);
        
        //input Saturday expenses
          do {
            try {
                System.out.print("Expenses for Saturday: ");
                sat = myScanner.nextFloat();
            } catch (Exception e) {
                sat = -1;
                myScanner.nextLine();
            }
        } while (sat < 0);
        
        //input Sunday expenses
          do {
            try {
                System.out.print("Expenses for Sunday: ");
                sun = myScanner.nextFloat();
            } catch (Exception e) {
                sun = -1;
                myScanner.nextLine();
            }
        } while (sun < 0);
        
        //Round all daily expense values to nearest int
        int roundMon = (int) (mon + 0.5);
        int roundTues= (int) (tues + 0.5);
        int roundWed = (int) (wed + 0.5);
        int roundThurs = (int) (thurs + 0.5);
        int roundFri = (int) (fri + 0.5);
        int roundSat = (int) (sat + 0.5);
        int roundSun = (int) (sun + 0.5);
        
        System.out.println(" ");
        //Print out bar graph for each day based on rounded int
        //Monday bar graph
        System.out.print("Mon:    ");
        for(int i=0; i<roundMon; i++){
            System.out.print("*");
        }System.out.println(" ");
        //Tuesday bar graph
        System.out.print("Tues:   ");
        for(int j=0; j<roundTues; j++){
            System.out.print("*");
        }System.out.println(" ");
        //Wednesday bar graph
        System.out.print("Wed:    ");
        for(int k=0; k<roundWed; k++){
            System.out.print("*");
        }System.out.println(" ");
        //Thursday bar graph
        System.out.print("Thurs:  ");
        for(int l=0; l<roundThurs; l++){
            System.out.print("*");
        }System.out.println(" ");
        //Friday bar graph
        System.out.print("Fri:    ");
        for(int m=0; m<roundFri; m++){
            System.out.print("*");
        }System.out.println(" ");
        //Saturday bar graph
        System.out.print("Sat:    ");
        for(int n=0; n<roundSat; n++){
            System.out.print("*");
        }System.out.println(" ");
        //Sunday bar graph
        System.out.print("Sun:    ");
        for(int o=0; o<roundSun; o++){
            System.out.print("*");
        }System.out.println(" ");
        
        
        //compute average daily expense and weekly expense
        System.out.println(" ");
        float averageDaily = (mon+tues+wed+thurs+fri+sat+sun)/7;
        System.out.print("Your average daily expenses are: $");
        System.out.println(String.format("%.2f", averageDaily));
        float weeklyExpense = mon+tues+wed+thurs+fri+sat+sun;
        System.out.print("Your weekly expense is: $");
        System.out.println(String.format("%.2f", weeklyExpense));
        
        //compute estimated expenditure for 4 years 
        int randomNumber;
        float fourYearSum = 0;
        float randomPercent;
        
        for(int p=0; p<208; p++){
            Random random = new Random();
            randomNumber = (random.nextInt(41)-20);
            //to get %
            randomPercent = (float) randomNumber/100;
            fourYearSum = fourYearSum + (weeklyExpense*(1+randomPercent));
        }
        
        System.out.print("Estimated expenditure for 4 years: $");
        System.out.println(String.format("%.2f", fourYearSum));
        
    }
}
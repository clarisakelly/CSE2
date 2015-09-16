//Clarisa Kelly
// HW #3 Program #1
//Program asks user for length, width and height of a box and returns
// the volume and surface area of the block

import java.util.Scanner;

public class Block{
    public static void main (String[] args){
       Scanner myScanner;
       myScanner = new Scanner( System.in );
        
       System.out.print("Enter the length of the block: ");
       double length = myScanner.nextDouble();
       
       System.out.print("Enter the width of the block: ");
       double width = myScanner.nextDouble();
       
       System.out.print("Enter the height of the block: ");
       double height = myScanner.nextDouble();
       
       double volume = length*width*height;
       double surfacearea = 2*length*width + 2*length*height + 2*width*height;
       
       System.out.println("The volume of the blockw with the dimensions "+length+" x "+width+" x "+height+" is: "+volume);
       System.out.println("The surface area of the block is: "+surfacearea);
       
    }
}
       
       
       
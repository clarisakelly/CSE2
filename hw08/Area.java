//Clarisa Kelly
// Hw #8
// User decides between 3 shapes to calculate the area for and 
// program prompts user for the proper measurements and returns area

import java.util.Scanner;

public class Area{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        String shape = "";
        boolean notAcceptable = true;
        
        do {
            System.out.print("What kind of shape? ");
            shape = myScanner.next();
            if(shape.equals("circle") || shape.equals("triangle") || shape.equals("rectangle")){
                notAcceptable= false;
            }else{
                System.out.println("ERROR: Please input 'circle','rectangle' or 'triangle'.");
            }
        }while(notAcceptable);
        
        double radius = 0.0;
        double base = 0.0;
        double height = 0.0;
        boolean acceptable = false;
        boolean acceptable1 = false;
        boolean acceptable2 = false;
        
        if(shape.equals("circle")){
            System.out.print("Enter the radius of the circle: ");
            
            while( !acceptable ){
            //check if the input is a double.
            if (myScanner.hasNextDouble()){
            radius = myScanner.nextDouble();
            acceptable = true;
            break;
            }
            else{
            System.out.println("ERROR: Input must be a double");
            System.out.print("Enter the radius of the circle ");
            myScanner.next();
            }
            } 

        }else{
            System.out.print("Enter the height: ");
            while( !acceptable1 ){
            //check if the input is a double.
            if (myScanner.hasNextDouble()){
            height = myScanner.nextDouble();
            acceptable = true;
            break;
            }
            else{
            System.out.println("ERROR: Input must be a double");
            System.out.print("Enter the height: ");
            myScanner.next();
            }
            }
            
            System.out.print("Enter the length of the base: ");
            while( !acceptable2 ){
            //check if the input is a double.
            if (myScanner.hasNextDouble()){
            base = myScanner.nextDouble();
            acceptable = true;
            break;
            }
            else{
            System.out.println("ERROR: Input must be a double");
            System.out.print("Enter the length of the base: ");
            myScanner.next();
            }
            }
        }
        
        if(shape.equals("circle")){
            circleArea(radius);
        }else if (shape.equals("triangle")){
            triangleArea(base,height);
        }else{
            rectangleArea(base,height);
        }
        
        
    }//bracket that closes main method
        
        public static void circleArea(double r){
            double areaC= 3.14*r*r;
            System.out.println("The area of your circle is "+areaC);
        }
        
        public static void rectangleArea(double b1, double h1 ){
            double areaR= b1*h1;
            System.out.println("The area of your rectangle is "+areaR);
        }
        
        public static void triangleArea(double b2, double h2){
            double areaT = 0.5*b2*h2;
            System.out.println("The area of your triangle is "+areaT);
        }


}//bracket that closes class

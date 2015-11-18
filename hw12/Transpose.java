//Clarisa Kelly
// Program asks user for width and height dimensions of a matrix
// Passes through method to create a random matrix w ints between -10-10
// Prints said matrix, transposes it, and then re-prints

import java.util.Scanner;
import java.util.Random;

public class Transpose{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        boolean acceptable = false;
        boolean acceptable2 = false;
        int height = 0;
        int width = 0;
        
        //loop until acceptable input is given for the height
        System.out.print("Enter the height of the matrix: ");
        while(!acceptable){
            if(myScanner.hasNextInt()){
                height = myScanner.nextInt();
                if(height>0){
                    acceptable = true;
                }else{
                    System.out.println("ERROR: Please enter only positive integers.");
                    System.out.print("Enter the height of the matrix: ");
                }
            }else{
                System.out.println("ERROR: Please enter only integers.");
                System.out.print("Enter the height of the matrix: ");
                myScanner.next();
            }
            }
            
            //repeat for the width
            System.out.print("Enter the width of the matrix: ");
        while(!acceptable2){
            if(myScanner.hasNextInt()){
                width = myScanner.nextInt();
                if(width>0){
                    acceptable2 = true;
                }else{
                    System.out.println("ERROR: Please enter only positive integers.");
                    System.out.print("Enter the width of the matrix: ");
                }
            }else{
                System.out.println("ERROR: Please enter only integers.");
                System.out.print("Enter the width of the matrix: ");
                myScanner.next();
            }
            }
            //calculate random matrix of height x width
            int [] [] theMatrix = randomMatrix(height,width);
            System.out.println("Random Matrix: ");
            printMatrix(theMatrix,height,width);
            int [] [] theMatrixTransposed = transposeMatrix(theMatrix,height,width);
            System.out.println("Random Matrix, Transposed: ");
            printMatrix(theMatrixTransposed,width,height);
            
            
            
        }//closes main method
        
        //create an array of specified demensions w random ints -10 to 10
        public static int [] [] randomMatrix(int h, int w){ //creates random matrix
        Random random = new Random();

        int [][] array = new int[h][w];

        for( int i = 0 ; i < array.length ; i++ ) { 
           for ( int j = 0 ; j < array[i].length ; j++ ) { 
              array[i][j] = -10 + random.nextInt(21);
             }
         }

        return array;
        }
        
        //method to print 2d matrix
        public static void printMatrix(int [] [] matrix, int h2, int w2){
            for(int g = 0; g < h2; g++){
            for(int h = 0; h < w2; h++){
              System.out.printf("%5d ", matrix[g][h]);
             }
                System.out.println();
             } 
        }
        
        //Transpose the random matrix
        public static int [] [] transposeMatrix(int [] [] matrix,int h3,int w3){
            int transpose[][] = new int[w3][h3];
 
              for ( int c = 0 ; c < h3 ; c++ )
              {
                 for ( int d = 0 ; d < w3 ; d++ )               
                    transpose[d][c] = matrix[c][d];
              }
              return transpose;
        }
        
        
    }//closes class

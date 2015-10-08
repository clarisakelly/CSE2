/* Clarisa Kelly
Lab #6
First step prints out numbers 1-7 and then multiple 7s
Next, it generates all the prime numbers from 10-100, do this in all 3 loop styles
Lastly, generate a random number of smiley faces using loops & Math random */

import java.util.Random;

public class GettingLoopy{
public static void main (String[] args){
    
    boolean prime = false;
    
    for(int i=1; i<7; i++){
        System.out.print(i);
    }for(int j=1; j<8; j++){
        System.out.print(7);
    }System.out.println(" ");
  for(int n=10; n<101; n++){
    for (int k = 2; k <= n/2; k++){
        if (n % k == 0) {
            prime = false;
            break;
        }else{
            prime = true;
        }
    }if( prime == true){
        System.out.print(n+" ");
    }
}System.out.println(" ");


}
}
    
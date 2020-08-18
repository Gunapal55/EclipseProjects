package ELIVATE_CJ_QSN;

import java.util.Scanner;

public class New_primelogic {

    public static void main(String[] args) {
      
        int temp, num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();
        for (int i = 2; i<= num/2; i++) {
            
            if (num%i==0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) 
            System.out.println(num + "  is prime");
            else
                System.out.println(num + "  is not a prime");
             
         
    }
 
}


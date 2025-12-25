import java.awt.*;
import java.util.*;

public class againbyte {

    public static void checkPrimeNumber(int n){
     if (n % 2 == 1) {
         System.out.println(n + " Is a Prime Number");
     }
          if (n >=2 ){
              System.out.println(n + " Is a prime number");
          }
     else {
             System.out.println(n + " is not a Prime Number");
             return;
         }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       checkPrimeNumber(n);

        }

    }

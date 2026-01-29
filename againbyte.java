import java.awt.*;
import java.util.*;


public class againbyte {


    public static int calculateFactorial(int n){

        if(n == 1 || n == 0){
            return 1;
        }
        int factorialn_1 = calculateFactorial(n-1);
       n *= factorialn_1;
        return n;
    }


    public static void main(String args[]) {
        int n =5;
        int factorial = calculateFactorial(n);

        System.out.println(factorial);





    }
}




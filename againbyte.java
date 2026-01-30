import java.awt.*;
import java.util.*;


public class againbyte {

 public static int findPower(int x , int n){
     if (n == 0) {
         return 1;
     }
         if (x == 0){
             return 0;
         }
    if (n % 2 == 0){
        return findPower(x,n/2) * findPower(x, n/2);
    } else {
        return findPower(x,n/2) * findPower(x,n/2) * x;
    }
 }

    public static void main(String args[]) {

     int x =2 , n =5;

   int ans = findPower(x,n);
        System.out.println(ans);




    }
}




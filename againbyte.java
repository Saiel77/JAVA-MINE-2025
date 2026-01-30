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
     int powerofxm1 = findPower(x,n-1);
     int powerofx = x * powerofxm1;
    return powerofx;
 }

    public static void main(String args[]) {

     int x =2 , n =5;

   int ans = findPower(x,n);
        System.out.println(ans);




    }
}




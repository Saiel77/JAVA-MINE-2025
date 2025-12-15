import java.awt.*;
import java.util.*;

public class againbyte {

    public static void main(String args[]) {

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
     int n = 8;

     for (int i =0; i<=n; i++){

         for (int j=0; j<=n-i-1; j++){
             System.out.print(" ");
         }

         int nums3 = 1;
         for (int j=0; j<=i; j++){
             System.out.print(nums3);

         }
         System.out.println();
     }

        }

    }

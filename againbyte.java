import java.awt.*;
import java.util.*;


public class againbyte {

    public static void gcd(int a, int b){

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;



        }
        System.out.println(a);
        return;
    }




    public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();

       gcd(a,b);



 
    }

    }
//
import java.awt.*;
import java.util.*;


public class againbyte {

    public static void findPower(int x, int n){

        int result = 1;

        for (int i=1; i<=n; i++){

            result = result * x;
        }
        System.out.println(result);
        return;
        }


    public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int n = sc.nextInt();

       findPower(x,n);


    }

    }

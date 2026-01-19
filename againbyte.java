import java.awt.*;
import java.util.*;


public class againbyte {

    public static boolean isPowerOfTwo(int n){
        if (n <= 0){
            return false;
        }return (n & (n-1))== 0;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {

            count += (n & 1);
            n >>= 1;

        }
        System.out.println("Numbers of 1's In Binary Is "+ count);



    }
}




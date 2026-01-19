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
        int pos = 3;

        int mask = 1 << pos;

        int result = n ^ mask;

        System.out.println("Original Number " + n +"Binary Conversion "+Integer.toBinaryString(n));
        System.out.println("After Toggling Bit At Position "+ pos + result + "Its Binary Conversion Is "+ Integer.toBinaryString(result));




    }
}




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
        int num = sc.nextInt();

        if (isPowerOfTwo(num)){
            System.out.println(num + " Is Power Of Two");
        }else{
            System.out.println(num + " Is Not Power Of Two");

        }


    }
}




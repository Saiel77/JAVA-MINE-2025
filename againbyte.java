import java.awt.*;
import java.util.*;


public class againbyte {

    public static void decimaltoBinary(int n){

        System.out.println(Integer.toBinaryString(n));

    }
    public static void binaryToDecimal(String i){
         int decimal = Integer.parseInt(i,2);
        System.out.println(decimal);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String i = sc.next();

        decimaltoBinary(n);

        binaryToDecimal(i);





    }
}




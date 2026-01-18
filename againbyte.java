import java.awt.*;
import java.util.*;


public class againbyte {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
    int n =5;

    if (oper == 1){
        int pos = 1;
        int bitmask = 1<<pos;
        int newNumber = bitmask | n;
        System.out.println(newNumber);
    }else {
        int pos = 2;
        int bitmask = 1<<pos;
        int notBitmask = ~(bitmask);
        int newNumber = notBitmask & n;
        System.out.println(newNumber);
    }



    }
}




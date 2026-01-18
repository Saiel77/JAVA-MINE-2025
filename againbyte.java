import java.awt.*;
import java.util.*;


public class againbyte {

    public static void main(String args[]) {

   int n =5;
    int pos = 2;
    int bitmask = 1<<pos;

    if ( (bitmask & n) == 0){
        System.out.println("Bit Was Zero");
    }else {
        System.out.println("Bit Was One");
    }


    }
}




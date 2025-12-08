import java.awt.*;
import java.util.*;

public class againbyte {

    public static int calculateProduct(int a,int b){

        return a*b;
    }


    public static void main(String args[]) {

        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();


        System.out.println("The Product Of Two Numbers Is :" + calculateProduct(a,b));


    }
}
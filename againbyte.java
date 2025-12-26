import java.awt.*;
import java.util.*;

public class againbyte {

    public static void checkEvenNumber(int n){

        if ( n % 2 == 0){
            System.out.println(n + " Is a Even Number");

        }else {
            System.out.println(n + " is not A Even Number ");
            return;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkEvenNumber(n);


        }

    }

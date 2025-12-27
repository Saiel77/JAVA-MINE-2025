import java.awt.*;
import java.util.*;

public class againbyte {

    public static void findGreaterNumber(int a , int b){

        if (a>b){
            System.out.println(a + " Is Greater Number");
        }else{
            System.out.println(b + " Is Greater Number");
        }


    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


      findGreaterNumber(a,b);

        }

    }

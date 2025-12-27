import java.awt.*;
import java.util.*;

public class againbyte {

    public static double calculateCircumferenceOfCircle(int n){


        return (2*3.14)*n;



    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       double Circum= calculateCircumferenceOfCircle(n);

        System.out.println(Circum);

        }

    }

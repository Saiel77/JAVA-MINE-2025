import java.awt.*;
import java.util.*;

public class againbyte {

    public static double findAvgNumber(int a , int b , int c){

        return(a+b+c)/3.0;


    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        System.out.println("Enter the third Number");
        int c = sc.nextInt();

        double avg = findAvgNumber(a,b,c);

        System.out.println("The Average Of Three Numbers Is "+ avg);

        }

    }

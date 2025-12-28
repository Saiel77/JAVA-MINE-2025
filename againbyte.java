import java.awt.*;
import java.util.*;


public class againbyte {

    public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();

     int numbers[]= new int[size];

     for (int i=0; i<size; i++){

         numbers[i]= sc.nextInt();
     }

     int max = Integer.MIN_VALUE;
     int min = Integer.MAX_VALUE;

     for (int i=0; i< numbers.length; i++){

         if (max<numbers[i]){
             max = numbers[i];

         }if (min>numbers[i]){
             min = numbers[i];


         }




     }
        System.out.println("The Maximum Number Is "+ max);
        System.out.println("The Minimum Number Is "+ min);






    }
    }



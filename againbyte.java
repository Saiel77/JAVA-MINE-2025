import java.awt.*;
import java.util.*;


public class againbyte {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;

        do {
            System.out.println("Enter the Numbers");
            int n = sc.nextInt();

            if (n>0){
                positiveCount++;
            }else if(n<0){
                negativeCount++;
            }else{
                zeroCount++;
            }

            System.out.println("Do you want to Enter Another Number (y/n):");
                choice = sc.next().charAt(0);

        }while (choice == 'y' || choice == 'Y');

        System.out.println("\nSummary:");
        System.out.println("Positive Numbers :"+ positiveCount);
        System.out.println("Negative Numbers :"+ negativeCount);
        System.out.println("Zero Count :"+ zeroCount);


        }

    }

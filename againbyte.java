import java.awt.*;
import java.util.*;

public class againbyte {

    public static void eligibilatyToVote(int Age){

        if (Age > 18){
            System.out.println("The Person Is Eligible To Vote");

        }else {
            System.out.println("The Person Is Not Eligible To Vote");
            return;
        }

    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Person's Age");
        int Age = sc.nextInt();

        eligibilatyToVote(Age);


        }

    }

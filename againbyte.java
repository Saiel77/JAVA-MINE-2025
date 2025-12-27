import java.awt.*;
import java.util.*;

public class againbyte {

    public static void addOddNumbers(int n){
        int sum = 0;

        for (int i =1; i<=n; i++){
            if (i % 2 == 1){
                sum+=i;
            }
        }
        System.out.println("The Sum Of Enterd Odd Numbers is " + sum);

    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        addOddNumbers(n);


        }

    }

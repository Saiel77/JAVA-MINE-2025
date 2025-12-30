import java.awt.*;
import java.util.*;


public class againbyte {

    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] numbers = new int[rows][cols];

    for (int i=0; i<rows; i++) {

        for (int j = 0; j < cols; j++) {
            numbers[i][j] = sc.nextInt();

        }
    }

        int x = sc.nextInt();

        for (int i=0; i<rows; i++){

            for (int j=0; j<cols; j++){

                if (x == numbers[i][j]){
                    System.out.println("The Location Of X In Matrix Is "+" "+ i +" " + j);


                }
                }
            }



        }

    }




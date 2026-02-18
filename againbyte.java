import java.awt.*;
import java.util.*;
import java.util.HashSet;


public class againbyte {

   public static int placeTiles(int n,int m){

       if (n == m){
           return 2;
       }
       if (n < m){
           return 1;
       }

       //Placing Tiles Vertically
       int vertTiles = placeTiles(n-m, m);
       //Placing Tiles Horizontally
       int Horizontiles = placeTiles(n-1,m);

       return vertTiles+Horizontiles;

   }


    public static void main(String args[]) {
     int n =3;
     int m=3;

     int totalTiles = placeTiles(n,m);
        System.out.println(totalTiles);





    }
}




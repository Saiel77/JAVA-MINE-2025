import java.awt.*;
import java.util.*;


public class againbyte {

 public static void towerofHanoi(int n, String sroc, String hlpr, String dest){
     if (n == 1){
         System.out.println("Transfer disk "+n+" from "+sroc+" to "+dest);
         return;
     }
     towerofHanoi(n-1, sroc, dest, hlpr );
     System.out.println(" Transfer disk "+n+" from "+sroc+" to "+dest);
     towerofHanoi(n-1,hlpr,sroc,dest );

 }

    public static void main(String args[]) {

   int n=2;

   towerofHanoi(n, "S", "H", "D");




    }
}




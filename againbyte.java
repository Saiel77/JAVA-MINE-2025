import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.HashSet;


public class againbyte {

    public static void printSubset(ArrayList<Integer> subset){
        for (int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

 public static void findSubset(int n, ArrayList<Integer> subset){

     if (n == 0){
         printSubset(subset);
         return;
     }


     // Add Hoga
     subset.add(n);
     findSubset(n-1,subset);
     // Add Nahi Hoga
     subset.remove(subset.size()-1);
     findSubset(n-1,subset);

 }

    public static void main(String args[]) {
     int n =3;
     ArrayList<Integer> subset = new ArrayList<>();
     findSubset(n,subset);




    }
}




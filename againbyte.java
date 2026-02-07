import java.awt.*;
import java.util.*;


public class againbyte {

   public static boolean checkSortedArray(int arr[], int idx){

       if (idx == arr.length-1){
           return true;
       }

       if (arr[idx] >= arr[idx+1]) {
           // Array is UnSorted
           return false;
       }
       return checkSortedArray(arr,idx+1);

   }

    public static void main(String args[]) {

        int arr[] = {1,2,3,4,1};

        System.out.println(checkSortedArray(arr,0));




    }
}




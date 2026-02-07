import java.awt.*;
import java.util.*;


public class againbyte {

   public static boolean checkSortedArray(int arr[], int idx){

       if (idx == arr.length-1){
           return true;
       }

       if (arr[idx] < arr[idx+1]){
           // Array is Sorted
           return checkSortedArray(arr,idx+1);

       }else {
           return false;
       }

   }

    public static void main(String args[]) {

        int arr[] = {1,2,3,4,5};

        System.out.println(checkSortedArray(arr,0));




    }
}




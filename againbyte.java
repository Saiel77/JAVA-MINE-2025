import java.util.*;

public class againbyte{

    public static void majorityElement(int nums[]){
       HashMap<Integer,Integer> map = new HashMap<>();

       int n = nums.length;

       for (int i =0; i<n; i++){
           if (map.containsKey(i)){ //If We Get The Key
               map.put(nums[i],map.get(nums[i])+1);
           } else { // If We Didnt Get The Key
               map.put(nums[i],1);
           }
       }
    }

    public static void main(String args[]){
        int nums[] = {1,3,2,5,1,3,1,5,1};

    }

}
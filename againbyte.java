import java.util.*;

public class againbyte {




        public static void main(String args[]) {
            // Creation Of Hash Set
            HashSet<Integer> set = new HashSet<>();

            //Insert
            set.add(1);
            set.add(2);
            set.add(3);
            set.add(1);

            //Searching
            if (set.contains(1)){
                System.out.println("Element Found");
            }
            if (!set.contains(5)){
                System.out.println("Element Not Found");
            }

            //Deletion
            set.remove(1);

            if (!set.contains(1)){
                System.out.println("ITS JUST VANISHED VOILA");
            }






    }
}












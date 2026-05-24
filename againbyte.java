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

            //Size Of Set
            System.out.println("The Size Of Set is "+ set.size());

            //Print
            System.out.println(set);

            //Iterator
            Iterator it = set.iterator();

            while(it.hasNext()){
                System.out.println(it.next());
            }

//            //Searching
//            if (set.contains(1)){
//                System.out.println("Element Found");
//            }
//            if (!set.contains(5)){
//                System.out.println("Element Not Found");
//            }
//
//            //Deletion
//            set.remove(1);
//
//            if (!set.contains(1)){
//                System.out.println("ITS JUST VANISHED VOILA");
//            }








    }
}












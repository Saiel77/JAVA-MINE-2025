import  java.util.ArrayList;
import java.util.Collections;





public class againbyte{


public static void main(String args[]){

  ArrayList<Integer> list = new ArrayList<Integer>();

  // ADD ELEMENTS
  list.add(0);
  list.add(2);
  list.add(3);

    System.out.println(list);

    //GET ELEMENTS

    int element = list.get(1);

    System.out.println(element);

    // ADD ELEMENTS IN BETWEEN

    list.add(1,1);

    System.out.println(list);

    //CHANGE ELEMENT OR SET

    list.set(0,5);
    System.out.println(list);


    //DELETE ELEMENT
    list.remove(3);
    System.out.println(list);

    //DETERMINE SIZE
    int size = list.size();
    System.out.println(size);

    //LOOPS
    for (int i=0; i<list.size(); i++){
        System.out.print(list.get(i));
    }
    System.out.println();

    //SORT

    Collections.sort(list);
    System.out.println(list);




    }

}
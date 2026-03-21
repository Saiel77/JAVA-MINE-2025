import  java.util.*;




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




    }

}
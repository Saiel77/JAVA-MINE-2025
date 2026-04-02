import java.util.*;



class agaibyte {



public static void main(String args[]) {

  LinkedList<Integer> list = new LinkedList<Integer>();
  list.addLast(1);
  list.addLast(5);
  list.addLast(7);
  list.addLast(3);
  list.addLast(8);
  list.addLast(2);
  list.addLast(3);

  System.out.println("Linked List :"+ list);
// bf
int index = list.indexOf(7);

if (index != -1){
  System.out.println("The Index Of 7 Is :"+ index);
}else {
  System.out.println("The No 7 Is Not Found In The List");
}




}
    }


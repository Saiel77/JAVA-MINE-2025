import java.util.*;



  class LL{

    Node head;

    class Node{
      String data;
      Node next;

      Node(String data){
        this.data = data;
        this.next = null;
      }
    }


    // Add - First,Last
    public void addFirst(String data){
      Node newNode = new Node(data);
      if (head == null){
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    public void addLast(String data){
      Node newNode = new Node(data);
      if (head == null){
        head = newNode;
        return;
      }

      Node currnode = head;
      while(currnode.next != null){
        currnode = currnode.next;

      }
      currnode.next = newNode;

    }

    public void printList(){
      if (head == null){
        System.out.println("ListIs Empty");
      }
      Node currnode = head;
      while (currnode != null){
        System.out.print(currnode.data + "->");
        currnode = currnode.next;
      }
      System.out.println("NULL");

    }



    



public static void main(String args[]) {

  LL list = new LL();
  list.addFirst("a");
  list.addFirst("is");

  list.printList();



}
    }


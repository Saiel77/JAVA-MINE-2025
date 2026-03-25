import java.util.*;



  class LL{

    Node head;

    private int size;

    LL(){
      this.size = 0;
    }

    class Node{
      String data;
      Node next;

      Node(String data){
        this.data = data;
        this.next = null;
        size++;
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

    //Delete First
    public void deleteFirst(){
      if (head == null){
        System.out.println("The List is Empty");
      }
       size --;
      head = head.next;

    }

    //Delete Last
    public void deleteLast(){
      if (head == null){
        System.out.println("The List is Empty");
      }
      size--;
      if (head.next == null){
        head = null;
        return;
      }

      Node secondLast = head;
      Node lastNode = head.next;
      while (lastNode.next != null){
        lastNode = lastNode.next;
        secondLast = secondLast.next;
      }
      secondLast.next = null;

    }

    public int getSize(){
      return size;
    }

public static void main(String args[]) {

  LL list = new LL();
  list.addFirst("a");
  list.addFirst("is");

  list.printList();
  list.addLast("list");
  list.printList();

list.addFirst("this");
list.printList();

list.deleteFirst();
list.printList();

list.deleteLast();
list.printList();

  System.out.println(list.getSize());

  list.addFirst("this");
  System.out.println(list.getSize());

}
    }


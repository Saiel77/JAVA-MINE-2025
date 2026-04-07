import java.util.*;


class againbyte{

  class stack {
    static ArrayList<Integer>  list = new ArrayList<Integer>();

    public static boolean isEmpty(){
      return list.size() == 0;
    }

    //Push
    public static void push(int data){
      list.add(data);
    }

    //pop
    public static int pop(){
      int top = list.get(list.size()-1);
      list.remove(list.size-1);
      return top;
    }

    //peek





  }
public static void main(String args[]){

    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    while (!s.isEmpty()){
      System.out.println(s.peek());
      s.pop();
    }




}

}
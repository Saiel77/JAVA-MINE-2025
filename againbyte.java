import java.util.*;


public class againbyte{

    static class Node{
        Node chindren[];
        boolean eow;

        public Node(){
            chindren = new Node[26];

            for (int i=0; i< chindren.length; i++){
                chindren[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();


    public static void insert(String word){

        for (int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';

            if (root.chindren[idx] == null){
                root.chindren[idx] = new Node();
            }

            if ( i == word.length()-1){
                root.chindren[idx].eow = true;
            }
            root = root.chindren[idx];

        }
    }







    public static void main(String args[]){
        String words[] ={"the","a","there","their","any" };

        for (int i=0; i< words.length; i++){
            insert(words[i]);
            System.out.println(words[i]);
        }



    }


}


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
        Node curr = root;
        for (int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';

            if (curr.chindren[idx] == null){
                curr.chindren[idx] = new Node();
            }

            if ( i == word.length()-1){
                curr.chindren[idx].eow = true;
            }
            curr = curr.chindren[idx];

        }
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i =0; i<key.length(); i++){ // Time Complexity For This -> O(L) Where L is Length Is Length Of the Longest word
            int idx = key.charAt(i) - 'a';
            Node node = curr.chindren[idx];

            if (node == null){
                return false;
            }
            if (i == key.length()-1 && node.eow == false ){
                return false;
            }

            curr = curr.chindren[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key){
        if (key.length() == 0){
            return true;
        }

        for (int i =1; i<=key.length(); i++){
            String firstPart = key.substring(0,i);
            String secPart = key.substring(i);
            if (search(firstPart) && wordBreak(secPart)){
                return true;
            }
        }
        return false;

    }

    public static boolean startsWith(String prefix){
        Node curr = root;

        for (int i =0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';

            if (curr.chindren[idx]== null){
                return false;
            }
            curr = curr.chindren[idx];
        }

        return true;
    }





    public static void main(String args[]){
        String words[] = {"apple","app","mango","man","woman"};
        String prefix = "moon";

        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startsWith(prefix));

    }


}


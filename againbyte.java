import java.util.*;


public class againbyte {

    static class Node {
        Node chindren[];
        boolean eow;

        public Node() {
            chindren = new Node[26];

            for (int i = 0; i < chindren.length; i++) {
                chindren[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();


    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.chindren[idx] == null) {
                curr.chindren[idx] = new Node();
            }

            if (i == word.length() - 1) {
                curr.chindren[idx].eow = true;
            }
            curr = curr.chindren[idx];

        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) { // Time Complexity For This -> O(L) Where L is Length Is Length Of the Longest word
            int idx = key.charAt(i) - 'a';
            Node node = curr.chindren[idx];

            if (node == null) {
                return false;
            }
            if (i == key.length() - 1 && node.eow == false) {
                return false;
            }

            curr = curr.chindren[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);
            if (search(firstPart) && wordBreak(secPart)) {
                return true;
            }
        }
        return false;

    }

    public static boolean startsWith(String prefix) {
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if (curr.chindren[idx] == null) {
                return false;
            }
            curr = curr.chindren[idx];
        }

        return true;
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.chindren != null) {
                count += countNodes(root.chindren[i]);

            }
        }

        return count + 1;
    }

    public static String ans = " ";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i=0; i<26; i++){
             if (root.chindren[i] != null && root.chindren[i].eow == true){
                 temp.append((char)(i+'a'));
                 if (temp.length() > ans.length()){
                     ans = temp.toString();
                 }
                 longestWord(root.chindren[i], temp);
                 temp.deleteCharAt(temp.length()-1);
             }
        }



    }


    public static void main(String args[]) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));

        System.out.println(ans);


    }


}



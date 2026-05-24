import java.util.*;

public class againbyte {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }


    public static Node insert(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;

    }

    public static void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print((root.data+ " "));
        inOrder(root.right);
    }

    public static boolean search(Node root, int key){
        if (root == null){
            return false;
        }
        if (root.data> key){ //Left Search
            return search(root.left, key);
        }
        else if (root.data == key){
            return true;
        }
        else{ //Right Search
            return search(root.right, key);
            }
    }

    public static Node delete(Node root, int val){
        if (root.data > val){
            root.left = delete(root.left, val);
        }else if (root.data < val){
            root.right = delete(root.right, val);
        }else{//root data == val
            //Case 1
            if (root.left == null && root.right == null){
                return null;
            }
            //Case 2
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

            //Case 3
            Node IS = inorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccesor(Node root){
        while(root.left != null){
            root = root.left;

        }
        return root;
    }

    public static void printInRange(Node root, int X, int Y){
        if (root == null){
            return;
        }
        if (root.data >= X && root.data <= Y ){
            printInRange(root.left,X,Y);
            System.out.print(root.data+ " ");
            printInRange(root.right,X,Y);
        }
        else if (root.data >= Y){
            printInRange(root.left,X,Y);
        }else {
            printInRange(root.right,X,Y);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+ "->");
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);

        //leaf
        if (root.left == null && root.right == null){
            printPath(path);
        }else { //Non Leaf
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }


    public static Node delete2(Node root, int val) {
        //Searching for root
        if (root.data > val) {
            root.left = delete2(root.left, val);
        } else if (root.data < val) {
            root.right = delete2(root.right, val);
        } else {
            //Case 1 when we get the node to delete
            if (root.left == null && root.right == null) {
                return null;
            }// Case 2
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }

            //Case 3
            Node IS = InorderSucc(root.right);
            root.data = IS.data;
            delete2(root.right, IS.data);
        }

            return root;


        }

        public static Node InorderSucc (Node root){
            while (root.left != null) {
                root=  root.left;
            }
            return root;
        }












    public static void main(String args[]) {
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;

        for (int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

       delete2(root, 3);
       inOrder(root);





    }
}












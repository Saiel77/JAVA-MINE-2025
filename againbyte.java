import java.util.*;


public class againbyte{
    static class HashMap<K,V> { //K,V are Called Generics
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; //Number Of Nodes
        private int N; //Number Of Buckets
        private LinkedList<Node> buckets[]; //HashMap Array Of LinkedList

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i =0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;

        }

        private int searchInLL(K key, int bi){
             LinkedList<Node > ll = buckets[bi];

             for (int i=0; i<ll.size(); i++){
                 if (ll.get(i).key == key) {
                     return i; //di
                 }
             }
             return -1;
        }

        private void rehash(){
            LinkedList<Node> oldbucket[] = buckets;
            buckets = new LinkedList[N*2];

            for (int i=0; i<N*2; i++){
                oldbucket[i] = new LinkedList<>();
            }

            for (int i=0; i<oldbucket.length; i++){
                LinkedList<Node> ll = oldbucket[i];
                for (int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key,node.value);

                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1){ //If the Key Is Not Present In The Node
                buckets[bi].add(new Node(key,value));
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double K = 2.0;
            double lambda = (double)n/N;
            if (lambda > K){
                rehash();
            }

        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1){
                return null;
            }else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if (di == -1){
                return false;
            } else {
                return true;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if (di == -1){
                return null;
            } else {
                Node node = buckets[bi].remove(di);
                return node.value;
            }
        }

        public boolean isEmpty(){
            return n==0;
        }

        public ArrayList
    }












    public static void main(String args[]){

        HashMap<String, Integer> map = new HashMap<>();
        map.put("INDIA",190);
        map.put("CHINA",200);
        map.put("USA",50);
        map.put("GERMANY",30);

    }
}
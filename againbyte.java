import java.util.*;

public class againbyte{

    static class Edge{
        int src;
        int dest;


        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));






    }

    public static void bfs(ArrayList<Edge> graph[], int V,boolean vis[], int start){
        Queue<Integer> q = new LinkedList<>();


        q.add(start);

        while (!q.isEmpty()){
            int curr = q.remove();
            if (vis[curr] == false){
                System.out.print(curr+ " ");
                vis[curr] = true;

                for (int i =0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) { // Time Complexity -> O(V+E) GOOD
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false)
                dfs(graph, e.dest, vis);


        }
    }

    public static void printallPath(ArrayList<Edge> graph[],boolean vis[], int curr,String path,int tar){ // Time Complexity -> O(V^V) Worst 
        if (curr == tar){
            System.out.println(path);
            return;
        }

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                vis[curr] = true;
                printallPath(graph,vis,e.dest,path+e.dest,tar);
                vis[curr] = false;
            }
        }
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[], int curr,boolean vis[], boolean rec[]){
        vis[curr] = true;
        rec[curr] = true;

        for (int i=0; i< graph[curr].size(); i++ ){
            Edge e = graph[curr].get(i);
            if (rec[e.dest]){ //Cycle Condition
                return true;
            }else if(!vis[e.dest]){
                if (isCycleDirected(graph,e.dest,vis,rec)){
                    return true;
                }
            }

        }
        rec[curr] = false;
        return false;

    }






    public static void main(String args[]){

        int V = 7;

        @SuppressWarnings("unchecked")
       ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(isCycleDirected(graph,0,new boolean[V],new boolean[V]));



    }
}
import java.util.*;
public class DFSTraversal {
    
    static void addEdge(List<List<Integer>> graph,int u,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
     }

     static void dfs(int node, List<List<Integer>>graph,boolean[]visited){
            visited[node] = true;
            System.out.println(node+" ");

            for(int neighbor:graph.get(node)){
                if(!visited[neighbor]){
                    dfs(neighbor,graph,visited);
                }
            }
     }
    public static void main(String[] args){
        int n = 5; // Number of Vertics (Node)

        //Graph Represented using Adjacency List
        List<List<Integer>>adjList = new ArrayList<>();

        //create list for each vertics(Node)
        for (int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }


        addEdge(adjList,0,1);
        addEdge(adjList,0,4);
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList, 3,4);

        boolean[] visited = new boolean[n];

        System.out.println("DFS Traversasl starting from node 0: ");
        dfs(0,adjList,visited);
    }
}

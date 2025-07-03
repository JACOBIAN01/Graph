import java.util.*;
public class CycleDetectionDirectedDFS {

    static void addEdge(List<List<Integer>>graph,int u,int v){
        graph.get(u).add(v);//Directed Graph only one direction
    }

    // static boolean dfs(int node,List<List<Integer>>graph,boolean[] visited, boolean[]recStack ){

    //     visited[node] = true;
    //     recStack[node] = true;

    //     for(int neighbor:graph.get(node)){
    //         if(!visited[node]){
    //             if(dfs(neighbor,graph,visited,recStack)){

    //             }
    //         }
    //     }
    // }
    public static void main(String[] args){
        int n= 4;

        List<List<Integer>>adjList = new ArrayList<>();
        for(int i =0 ;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        // Add directed edges
        addEdge(adjList, 0, 1);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 1); // This edge creates a cycle

        boolean[] visited = new boolean[n];
        boolean[] recStack = new boolean[n];

        boolean hasCycle = false;

        // for(int i=0;i<n;i++){
        //     if(!visited[i]){
        //         if(dfs(i,adjList,visited,recStack)){
        //             hasCycle=true;
        //             break;
        //         }
        //     }
        // }






  
    }
}

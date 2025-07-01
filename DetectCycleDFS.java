
import java.util.ArrayList;
import java.util.List;

public class DetectCycleDFS {

    static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static boolean dfs(int node,int parent,boolean[] visited , List<List<Integer>>graph){

        return true;
    }

    public static void main(String[] args) {

        int n = 5;

        //Initialize adjacency list
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 0, 1);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 4);
        addEdge(adjList, 4, 1);

        boolean[] visited = new boolean[n];
        boolean hasCycle = false;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(dfs(i,-1,visited,adjList){
                    hasCycle = true;
                    break;
                })
            }
        }
    }
}

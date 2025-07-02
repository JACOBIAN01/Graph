import java.util.*;

public class DetectCycleBFS {

    static void addEdge(List<List<Integer>>graph , int u , int v){
    graph.get(u).add(v);
    graph.get(v).add(u);
}

static boolean bfs(int start , List<List<Integer>>graph,boolean[] visited){
    Queue<int[]>queue = new LinkedList<>();


    return false;
}


    public static void main(String[] args) {
        int n = 5;

        //Initialize Adjacency List
        List<List<Integer>>adjList = new ArrayList<>();

        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        addEdge(adjList, 0, 1);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 4);
        addEdge(adjList, 4, 1); // forms a cycle

        boolean visited[] = new boolean[n];
        boolean hasCycle = false;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(bfs(i,adjList,visited)){
                    hasCycle= true;
                    break;
                }
            }
        }

    System.out.println(hasCycle);
 
    }
}

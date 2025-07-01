import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class BFS{

    static void addEdge(List<List<Integer>>graph , int u , int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void bfs(int start,List<List<Integer>> graph,int n){
        boolean[] visited = new boolean[n];
        Queue<Integer>queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;
        
        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node+" ");

            for(int neighbor:graph.get(node)){
                if(!visited[neighbor]){
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>>adjList = new ArrayList<>();

        for(int i =0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 4);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 3, 4);

        System.out.println("BFS Traversal starting from node 0:");

        bfs(0,adjList,n);

    }
}
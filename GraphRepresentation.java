import java.util.*;

class GraphRepresentation{
    public static void main(String[] args) {
       int n = 5 ; //Number of Nodes
       int[][] adjMatrix = new int[n][n];

       //list of edges(undirected)
       int[][] edges = {
        {0,1} , {0,4},{1,2},{1,3},{1,4},{2,3},{3,4}
       };

       for (int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adjMatrix[u][v] = 1;
            adjMatrix[v][u]= 1;
       }

       for(int i=0;i<n;i++){
        System.out.println(Arrays.toString(adjMatrix[i]));
       }

       //Adjacency List
       List<List<Integer>>adjlist = new ArrayList<>();
       for(int i=0;i<n;i++){
        adjlist.add(new ArrayList<>());
       }

       for(int[] edge: edges){
        int u = edge[0];
        int v = edge[1];
        adjlist.get(u).add(v);
        adjlist.get(v).add(u);  
       }

       System.out.println(adjlist);

       for(int i=0;i<n;i++){
        System.out.print(i+": ");
        for(int neighbor:adjlist.get(i)){
            System.out.print(neighbor+" ");
        }
       System.out.println();
       }
    }
}

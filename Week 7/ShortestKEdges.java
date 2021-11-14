import java.util.*;
public class ShortestKEdges {
    static int min(int a,int b){
        return a<b?a:b;
    }
    static int shortestPath(int V,int graph[][], int u, int v, int k) {
        if (k == 0 && u == v)			 
            return 0;
        if (k == 1 && graph[u][v] != Integer.MAX_VALUE) 
            return graph[u][v];
        if (k <= 0)					 
            return Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < V; i++)
        {
            if (graph[u][i] != Integer.MAX_VALUE && u != i && v != i)
            {
                int rec_res = shortestPath(V,graph, i, v, k-1);
                if (rec_res != Integer.MAX_VALUE)
                    res = min(res, graph[u][i] + rec_res);
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V,src,des,k;
        V=sc.nextInt();
        int graph[][]=new int[V][V];
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                graph[i][j]=sc.nextInt();
            }
        }
        src=sc.nextInt();
        des=sc.nextInt();
        k=sc.nextInt();
        System.out.printf("Weight of the shortest path from"+src+" "+des+"with"+k+"edges:",shortestPath(V,graph, src-1, des-1, k));
    }
    
}

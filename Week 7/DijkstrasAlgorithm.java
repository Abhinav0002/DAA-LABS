import java.util.*;
public class DijkstrasAlgorithm{
static int minDistance(int dist[],boolean sptSet[],int V) {
	int min = Integer.MAX_VALUE, min_index=0;
	for (int v = 0; v < V; v++){
		if (sptSet[v] == false && dist[v] <= min)
			min = dist[v];
            min_index = v;
    }
	return min_index;
}

static void printPath(int parent[], int j) {
	if (parent[j] == - 1)
		return;
	printPath(parent, parent[j]);
	System.out.println(j);
}

static void printSolution(int dist[], int V, int parent[], int src) {
	System.out.println("Vertex\t Distance\tPath");
	for (int i = 1; i < V; i++)
	{
		System.out.println(src+"->"+"\t\t"+i+"\t\t"+src);
		printPath(parent, i);
	}
}

static void dijkstra(int V, int graph[][], int src) {
	int dist[]=new int[V];
	boolean sptSet[]=new boolean[V];
	int parent[]=new int[V];
	for (int i = 0; i < V; i++)
	{
		parent[0] = -1;
		dist[i] = Integer.MAX_VALUE;
		sptSet[i] = false;
	}
	dist[src] = 0;
	for (int count = 0; count < V - 1; count++) {
		int u = minDistance(dist, sptSet, V);
		sptSet[u] = true;
		for (int v = 0; v < V; v++)
			if (!sptSet[v] && dist[u] + graph[u][v] < dist[v]) {
				parent[v] = u;
				dist[v] = dist[u] + graph[u][v];
			}
	}
	printSolution(dist, V, parent,src);
}

public  static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int V,src;
    V=sc.nextInt();
    int graph[][]=new int[V][V];
    for(int i=0;i<V;i++){
        for(int j=0;j<V;j++){
            graph[i][j]=sc.nextInt();
        }
    }
    src=sc.nextInt();
	dijkstra(V, graph, src-1);
}
}
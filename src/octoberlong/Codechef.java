package octoberlong;
import java.util.*; 
import java.lang.*; 
import java.io.*;
// Java program for Kruskal's algorithm to find Minimum 
//Spanning Tree of a given connected, undirected and 
//weighted graph 
 

 class Codechef 
{ 

	  
	// A class to represent a graph edge 
	class Edge implements Comparable<Edge> 
	{ 
		int src, dest;
		long weight; 

		// Comparator function used for sorting edges 
		// based on their weight 
		public int compareTo(Edge compareEdge) 
		{ 
			return (int) (this.weight-compareEdge.weight); 
		} 
	}; 

	// A class to represent a subset for union-find 
	class subset 
	{ 
		int parent, rank; 
	}; 

	int V, E; // V-> no. of vertices & E->no.of edges 
	Edge edge[]; // collection of all edges 

	// Creates a graph with V vertices and E edges 
	Codechef(int v, int e) 
	{ 
		V = v; 
		E = e; 
		edge = new Edge[E]; 
		for (int i=0; i<e; ++i) 
			edge[i] = new Edge(); 
	} 

	// A utility function to find set of an element i 
	// (uses path compression technique) 
	int find(subset subsets[], int i) 
	{ 
		// find root and make root as parent of i (path compression) 
		if (subsets[i].parent != i) 
			subsets[i].parent = find(subsets, subsets[i].parent); 

		return subsets[i].parent; 
	} 

	// A function that does union of two sets of x and y 
	// (uses union by rank) 
	void Union(subset subsets[], int x, int y) 
	{ 
		int xroot = find(subsets, x); 
		int yroot = find(subsets, y); 

		// Attach smaller rank tree under root of high rank tree 
		// (Union by Rank) 
		if (subsets[xroot].rank < subsets[yroot].rank) 
			subsets[xroot].parent = yroot; 
		else if (subsets[xroot].rank > subsets[yroot].rank) 
			subsets[yroot].parent = xroot; 

		// If ranks are same, then make one as root and increment 
		// its rank by one 
		else
		{ 
			subsets[yroot].parent = xroot; 
			subsets[xroot].rank++; 
		} 
	} 

	// The main function to construct MST using Kruskal's algorithm 
	void KruskalMST() 
	{ 
		Edge result[] = new Edge[V]; // Tnis will store the resultant MST 
		int e = 0; // An index variable, used for result[] 
		int i = 0; // An index variable, used for sorted edges 
		for (i=0; i<V; ++i) 
			result[i] = new Edge(); 

		// Step 1: Sort all the edges in non-decreasing order of their 
		// weight. If we are not allowed to change the given graph, we 
		// can create a copy of array of edges 
		Arrays.sort(edge); 

		// Allocate memory for creating V ssubsets 
		subset subsets[] = new subset[V]; 
		for(i=0; i<V; ++i) 
			subsets[i]=new subset(); 

		// Create V subsets with single elements 
		for (int v = 0; v < V; ++v) 
		{ 
			subsets[v].parent = v; 
			subsets[v].rank = 0; 
		} 

		i = 0; // Index used to pick next edge 

		// Number of edges to be taken is equal to V-1 
		while (e < V - 1) 
		{ 
			// Step 2: Pick the smallest edge. And increment 
			// the index for next iteration 
			Edge next_edge = new Edge(); 
			next_edge = edge[i++]; 

			int x = find(subsets, next_edge.src); 
			int y = find(subsets, next_edge.dest); 

			// If including this edge does't cause cycle, 
			// include it in result and increment the index 
			// of result for next edge 
			if (x != y) 
			{ 
				result[e++] = next_edge; 
				Union(subsets, x, y); 
			} 
			// Else discard the next_edge 
		} 

		// print the contents of result[] to display 
		// the built MST 
//		System.out.println("Following are the edges in " + 
//									"the constructed MST"); 
		long g=0;
		for (i = 0; i < e; ++i) {
//			System.out.println(result[i].src+" -- " + 
//				result[i].dest+" == " + result[i].weight); 
	
			g=g+result[i].weight;
		
		System.out.println((-1)*g);}
	}
	// Driver Program 
	public static void main (String[] args) 
	{ 
		int  T=0,D=0;
		Scanner sc = new Scanner(System.in);
	   	if(sc.hasNext())
	   	{   T = sc.nextInt();}
	   	if(sc.hasNext())
	   	{   D = sc.nextInt();}
	   	int [][]a=new int[T][D];
		int V = T; // Number of vertices in graph 
		int E = (V*(V-1))/2; // Number of edges in graph 
				for(int i=0;i<V;i++) {
			for(int j=0;j<D;j++)
			{a[i][j]=sc.nextInt();}}
		int z=0;
		Codechef graph = new Codechef(V, E);
		for(int i=0;i<V;i++)
		{
			for(int j=i+1;j<V;j++)
			{
				graph.edge[z].src=i;
				graph.edge[z].dest=j;
				long g=0;
				int h=0;
				while(h<D) {int y=(a[i][h]-a[j][h]);if(y<0) {y=y*(-1);}g=g+y;h++;}


				graph.edge[z].weight=((-1)*g);
				z++;
			}
			
		}
		
		graph.KruskalMST(); 
		/* Let us create following weighted graph 
		10 
	0--------1 
	| \	     | 
   6|   5\   |15 
	|	   \ | 
	2--------3 
		4	 */
		
//		Graph graph = new Graph(V, E);
//		// add edge 0-1 
//		graph.edge[0].src = 0; 
//		graph.edge[0].dest = 1; 
//		graph.edge[0].weight = 10; 
//
//		// add edge 0-2 
//		graph.edge[1].src = 0; 
//		graph.edge[1].dest = 2; 
//		graph.edge[1].weight = 6; 
//
//		// add edge 0-3 
//		graph.edge[2].src = 0; 
//		graph.edge[2].dest = 3; 
//		graph.edge[2].weight = 5; 
//
//		// add edge 1-3 
//		graph.edge[3].src = 1; 
//		graph.edge[3].dest = 3; 
//		graph.edge[3].weight = 15; 
//
//		// add edge 2-3 
//		graph.edge[4].src = 2; 
//		graph.edge[4].dest = 3; 
//		graph.edge[4].weight = 4; 
//
//		graph.KruskalMST(); 
	} 
} 
//This code is contributed by Aakash Hasija 
 
 
 
 
 
 //approach 2
 
 class MST {
	    // Number of vertices in the graph
	    private static  int V = 5;
	 
	    // A utility function to find the vertex with minimum key
	    // value, from the set of vertices not yet included in MST
	    int minKey(int key[], Boolean mstSet[])
	    {
	        // Initialize min value
	        int min = Integer.MAX_VALUE, min_index = -1;
	 
	        for (int v = 0; v < V; v++)
	            if (mstSet[v] == false && key[v] < min) {
	                min = key[v];
	                min_index = v;
	            }
	 
	        return min_index;
	    }
	 
	    // A utility function to print the constructed MST stored in
	    // parent[]
	    void printMST(int parent[], int graph[][])
	    {
	       int g=0;
	        for (int i = 1; i < V; i++)
	         g=g + graph[i][parent[i]];
	        System.out.println((-1)*g);
	    }
	 
	    // Function to construct and print MST for a graph represented
	    // using adjacency matrix representation
	    void primMST(int graph[][])
	    {
	        // Array to store constructed MST
	        int parent[] = new int[V];
	 
	        // Key values used to pick minimum weight edge in cut
	        int key[] = new int[V];
	 
	        // To represent set of vertices included in MST
	        Boolean mstSet[] = new Boolean[V];
	 
	        // Initialize all keys as INFINITE
	        for (int i = 0; i < V; i++) {
	            key[i] = Integer.MAX_VALUE;
	            mstSet[i] = false;
	        }
	 
	        // Always include first 1st vertex in MST.
	        key[0] = 0; // Make key 0 so that this vertex is
	        // picked as first vertex
	        parent[0] = -1; // First node is always root of MST
	 
	        // The MST will have V vertices
	        for (int count = 0; count < V - 1; count++) {
	            // Pick thd minimum key vertex from the set of vertices
	            // not yet included in MST
	            int u = minKey(key, mstSet);
	 
	            // Add the picked vertex to the MST Set
	            mstSet[u] = true;
	 
	            // Update key value and parent index of the adjacent
	            // vertices of the picked vertex. Consider only those
	            // vertices which are not yet included in MST
	            for (int v = 0; v < V; v++)
	 
	                // graph[u][v] is non zero only for adjacent vertices of m
	                // mstSet[v] is false for vertices not yet included in MST
	                // Update the key only if graph[u][v] is smaller than key[v]
	                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
	                    parent[v] = u;
	                    key[v] = graph[u][v];
	                }
	        }
	 
	        // print the constructed MST
	        printMST(parent, graph);
	    }
	 
	    public static void main(String[] args)
	    {
	        /* Let us create the following graph
	        2 3
	        (0)--(1)--(2)
	        | / \ |
	        6| 8/ \5 |7
	        | /     \ |
	        (3)-------(4)
	            9         */
	    	int  T=0,D=0;
			Scanner sc = new Scanner(System.in);
		   	if(sc.hasNext())
		   	{   T = sc.nextInt();}
		   	if(sc.hasNext())
		   	{   D = sc.nextInt();}
		   	int [][]a=new int[T][D];
			int V = T; // Number of vertices in graph 
					for(int i=0;i<V;i++) {
				for(int j=0;j<D;j++)
				{a[i][j]=sc.nextInt();}}
			int z=0;
			 int graph[][] = new int[V][V];
			for(int i=0;i<V;i++)
			{
				for(int j=i+1;j<V;j++)
				{

					int g=0;
					int h=0;
					while(h<D) {int y=(a[i][h]-a[j][h]);if(y<0) {y=y*(-1);}g=g+y;h++;}


					graph[i][j]=((-1)*g);
					z++;
				}
				
			}
			
	        MST t = new MST();

	 
	        // Print the solution
	        t.primMST(graph);
	    }
	}
import java.util.*;

class Vertex{
	public int d;
	public int p;
	public String id;
	public int val;
	
	public Vertex(String id,int val){
		this.d = Integer.MAX_VALUE;
		this.p = -1;
		this.id = id;
		this.val = val;
	}
	
	public String toString() {
		return id;
	}
}

class VertexComparator implements Comparator<Vertex>{
	public int compare(Vertex v1, Vertex v2){
		if(v1.d > v2.d)
			return 1;
		else if (v1.d < v2.d)
			return -1;
		else return 0;
	}
}

class Graph{
	public Vertex vertex [] = null;
	public LinkedList<Integer> [] adj = null;
	
	public Graph(int n,String []ids){
		vertex = new Vertex[n];
		adj = new LinkedList[n];
		
		for(int i=0;i<n;i++)
		{
			vertex[i] = new Vertex(ids[i],i);
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	//Adding edges to adjacency list
	public void addEdge(int u,int v){
		adj[u].add(v);
	}
	
	
}


class Dijk{
	public static void main(String [] args){
		int n = 5;
		String ids [] = {"s","t", "x", "y","z"};
		
		//Adjacency matrix of graph
		int [][] adjMatrix ={
	   //	s	t	x	y	z
		   {0,	10,	0,	5,	0}, //s
		   {0,	0,	1,	2,  0}, //t
		   {0,  0,	0,	0,	4}, //x
		   {0,	3,  9,	0, 	2}, //y
		   {7,	0,	6,	0,	0}  //z
		   
		};
		
		//Initializing graph
		Graph graph = new Graph(n,ids); 
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(adjMatrix[i][j]!=0)
				{
					graph.addEdge(i,j);
				}
			}
		}
		
		int s = 0;
		initializeSingleSource(graph,n,s);
		ArrayList<Vertex> list = new ArrayList<Vertex>();
		
		PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>(5, new VertexComparator());
		
		for(int i=0;i<n;i++){
			pq.add(graph.vertex[i]);
		}
		
		while(!pq.isEmpty()){
			Vertex u = pq.poll();
			int ui = u.val;
			list.add(u);
			
			for(Integer v : graph.adj[ui]){
				relax(graph,ui,v,adjMatrix[ui][v]);
			}
			
		}
		
		System.out.println(graph.vertex[s]);
		for(int i=1;i<n;i++){
			//System.out.print(graph.vertex[s]+" -> ");
			String str = "";
			str+=printPath(graph,s,i,str);
			System.out.print(str.substring(0,str.length()-2)+"\n");
		}
		
	}
	
	static void initializeSingleSource(Graph graph,int n,int s){
		for(int i=0;i<n;i++){
			graph.vertex[i].d = Integer.MAX_VALUE;
			graph.vertex[i].p = -1;
		}
		
		graph.vertex[s].d = 0;
	}
	
	static void relax(Graph graph, int u, int v,int w){
		
		if(graph.vertex[v].d > (graph.vertex[u].d + w))
		{
			graph.vertex[v].d = graph.vertex[u].d + w;
			graph.vertex[v].p = u;
		}
	}
	
	static String printPath(Graph graph, int s, int v,String str){
		if(v==s){
			return str+=" "+graph.vertex[v]+"("+graph.vertex[v].d+") ->";
		}
		else if(graph.vertex[v].p == -1){
			return str+="No path Exists!";
		}
		else{
			str+=printPath(graph,s,graph.vertex[v].p,str);
			return str+=" "+graph.vertex[v]+" ("+graph.vertex[v].d+") ->";
		}
	}
}

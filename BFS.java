import java.util.*;

class Node{
	
	String color;
	int d;
	int pi;
	
	public Node(String color,int d,int pi){
		this.d = d;
		this.color = color;
		this.pi = pi;
	}
}

class BFS{
	public static void main(String [] args){
		int [][] graph = {
			{0,1,0,0,1,0},
			{1,0,1,0,0,0},
			{0,1,0,0,1,0},
			{0,0,0,0,1,0},
			{1,0,1,1,0,0},
			{0,0,0,0,0,0}
		};
		int n = graph.length;
		
		Node [] vert = new Node[n];
		
		for(int i=0;i<n;i++)
		{
			vert[i] = new Node("white",Integer.MAX_VALUE,-1);
		}
		
		ArrayList<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>(n);
		
		for(int i=0;i<n;i++)
		{	
			ArrayList<Integer> a = new ArrayList<Integer>(n);
			for(int j=0;j<n;j++)
			{
				if(graph[i][j]==1)
				{
					a.add(j);
				}
			}
			
			li.add(a);
		}
		
		int start = 0;
		
		int c=0;
		while(c<n){
			int k = (start+c)%n;
			if(vert[k].color.equals("white"))
			{	
				bfs(li,vert,k);
			}
			c++;
		}
	}
	
	static void bfs(ArrayList<ArrayList<Integer>> a, Node [] vert,int k){
		
		vert[k].color = "grey";
		vert[k].d = 0;
		Queue<Integer> q = new LinkedList<>();
		
		q.add(k);
		
		while(q.size()>0)
		{
			
			int i = q.peek();
			System.out.print(i+" ");
			q.remove();
			
			for(int v: a.get(i))
			{
				if(vert[v].color.equals("white"))
				{	vert[v].color="grey";
					vert[v].d = vert[i].d+1;
					vert[v].pi = i;
					q.add(v);
				}
			}
			
			vert[i].color = "black";
		}
	}
}
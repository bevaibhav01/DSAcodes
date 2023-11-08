package Graph;

import java.util.*;

import Graph.GraphImplementation.Edge;

public class graphDFS {
	
	static void traversalDFS(ArrayList<Edge> []graph) {
		
		boolean[] visited=new boolean[graph.length];
		helperDFS(0,graph,visited);
		
		
		
	}
	static void helperDFS(int src,ArrayList<Edge> []graph,boolean[] vis) {
		if(!vis[src]) {
			System.out.print(src+" ");
			vis[src]=true;
			
			ArrayList<Edge> list=graph[src];
			for(int i=0;i<list.size();i++) {
				if(!vis[list.get(i).dest])
				helperDFS(list.get(i).dest,graph,vis);
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		ArrayList<Edge> []graph=new ArrayList[7];
		 for(int i=0;i<graph.length;i++){
	          graph[i]=new ArrayList<>();
	     }
		 
		 graph[0].add(new Edge(0,1));
		 graph[0].add(new Edge(0,2));
		 
		 graph[1].add(new Edge(1,0));
		 graph[1].add(new Edge(1,3));
		 
		 graph[2].add(new Edge(2,0));
		 graph[2].add(new Edge(2,4));
		 
		 graph[3].add(new Edge(3,1));
		 graph[3].add(new Edge(3,4));
		 graph[3].add(new Edge(3,5)); 
		 
		 graph[4].add(new Edge(4,2)); 
		 graph[4].add(new Edge(4,3));
		 graph[4].add(new Edge(4,5)); 
		 
		 graph[5].add(new Edge(5,3)); 
		 graph[5].add(new Edge(5,4));
		 graph[5].add(new Edge(5,6)); 
		 
		 graph[6].add(new Edge(6,5));
		 traversalDFS(graph);
		 



		
		
	}


}

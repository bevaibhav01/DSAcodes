package Graph;

import java.util.ArrayList;

import Graph.GraphImplementation.Edge;
/*
  
 
//LOGIC FOR UNDIRECTED GRAPH CYCLE

// 1 VISIT A NODE AND MAKE IT TRUE
// 2 VISIT ITS NEIGHBOUR AND SEE IF ANY NEIGHBOUR IS ALREADY VISITED AND THAT NEIGHBOUR IS NOT 
// PARENT OF CURRENT NODE THEN CYCLE EXITS.
// IF IT IS PARENT THEN SKIP OR CONITNUE.
// IF IT IS NOT VISITED THEN VISIT IT AND SEE IF CYCLE EXITS FROM IT IF IT EXIST RETURN TRUE;
  
 */
 

public class undirectedGraphCycleDfs {
	
static boolean dfsCycle(ArrayList<Edge> []graph) {
	boolean []vis=new boolean[graph.length];
	for(int i=0;i<graph.length;i++)
	{
		if(!vis[i]&&dfsCycleHelper(graph,vis,i,-1))
			return true;
			
	}
	return false;
}
	
private static boolean dfsCycleHelper(ArrayList<Edge>[] graph, boolean[] vis,int curr,int p) {
	// TODO Auto-generated method stub
	 vis[curr]=true;
	 for(int i=0;i<graph[curr].size();i++) {
		 Edge newCurr=graph[curr].get(i);
		 if(vis[newCurr.dest]) {
			 if(newCurr.dest!=p)
				 return true;
		 }
		 if(!vis[newCurr.dest]&& dfsCycleHelper(graph,vis,newCurr.dest,curr))
			  return true;
			 
	 }
	 return false;
	
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
		 System.out.println(dfsCycle(graph));
		 
	
		 



		
		
	}

}

package Graph;

import java.util.ArrayList;

import Graph.GraphImplementation.Edge;

//LEETCODE SOLN OF HAS PATH 
//FIRST CONVERT IT TO ADJACENCY LIST THEN PROCEED WITH THE LOGIC

//class Solution {
//    public boolean validPath(int n, int[][] edges, int source, int destination) {
//         Map<Integer, List<Integer>> graph = new HashMap<>();
//        for (int[] edge : edges) {
//            int a = edge[0], b = edge[1];
//            graph.computeIfAbsent(a, val -> new ArrayList<Integer>()).add(b);
//            graph.computeIfAbsent(b, val -> new ArrayList<Integer>()).add(a);
//        }
//        return findPath(graph,source,destination,new boolean[n]);
//       
//    }
//    boolean findPath( Map<Integer, List<Integer>> graph,int src,int dest,boolean []vis){
//        if(src==dest)
//         return true;
//         vis[src]=true;
//         for(int a:graph.get(src)){
//             if(!vis[a]&&findPath(graph,a,dest,vis))
//              return true;
//         }
//         return false;
//    }
//}

public class graphHasPath {
	
static boolean hasPath(ArrayList<Edge> []graph,int src,int dest) {
	for(int i=0;i<graph.length;i++) {
		boolean test= helperHasPath(graph,i,dest,new boolean[graph.length]);
		if(test)
			return true;
			
	}
	return false;
	
	
}
private static boolean helperHasPath(ArrayList<Edge> []graph,int src,int dest,boolean[]vis) {
	if(src==dest)
  		 return true;
	vis[src]=true;
    
    	ArrayList<Edge> list=graph[src];
    	for(int i=0;i<list.size();i++) {
    		//CHECKING PATH THROUGH NEIGHBOUR
    		if(!vis[list.get(i).dest]&& helperHasPath(graph,list.get(i).dest,dest,vis))
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
		 
		 System.out.print(hasPath(graph,5,6));
	
		 



		
		
	}

}

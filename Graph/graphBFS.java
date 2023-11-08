package Graph;

import java.util.*;

import Graph.GraphImplementation.Edge;



public class graphBFS {
static void traversalBFS(ArrayList<Edge> []graph) {
	
//CREATING BOOLEAN ARRAY TO TRACK IF VERTEX IS ALREADY VISITED		
boolean visited[]=new boolean[graph.length];

//CREATING QUEUE TO STORE IMEDIATE NEIGHBOUR
Queue<Integer> q=new LinkedList<>();

//ADDING STARTING VERTEX/SOURCE
q.add(0);

while(!q.isEmpty()) {	
	
	//REMOVING FIRST VERTEX
	int curr=q.remove();
	
	//IF IT IS NOT VISITED THEN VISIT IT AND ADD ALL ITS NEIGHBOUR
	if(!visited[curr]) {
		visited[curr]=true;
		System.out.print(curr+" ");
		ArrayList<Edge> list=graph[curr];
		
		//ADDING ALL THE NEIGHBOURS
		for(int i=0;i<list.size();i++) {
			q.add(list.get(i).dest);
		}	
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
	 //displayGraph(graph);
	 traversalBFS(graph);



	
	
}


static void displayGraph(ArrayList<Edge>[] graph) {
	
	for(int i=0;i<graph.length;i++) {
		//GETTING EDGE LIST ONE BYE ONE 
		ArrayList<Edge> list=graph[i];
		for(int j=0;j<list.size();j++) {
			System.out.print(list.get(j).src+"->"+ list.get(j).dest+"  ");
		}
		System.out.println();
	}
	
}


}

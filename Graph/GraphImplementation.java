package Graph;

import java.util.*;

public class GraphImplementation {
    public static void main(String[] args) {
        //CREATING ARRAY OF ARRAYLIST OF EDGES SIZE OF ARRAY WILL BE NO.OF VERTEX 
        ArrayList<Edge> []list=new ArrayList[5];
        
        //INITIALISING EACH ARRAYLIST WITH ARRAYLIST OBJECT
        for(int i=0;i<5;i++){
            list[i]=new ArrayList<>();
        }
        list[0].add(new Edge(0,1));
        
        list[1].add(new Edge(1,0));
        list[1].add(new Edge(1,2));
        list[1].add(new Edge(1,3));
        
        list[2].add(new Edge(2,1));
        list[2].add(new Edge(2,3));
        list[2].add(new Edge(2,4));
        
        list[3].add(new Edge(3,1));
        list[3].add(new Edge(3,2));
        
        list[4].add(new Edge(4,2));
        displayGraph(list);
       



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
     static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
   
}
 


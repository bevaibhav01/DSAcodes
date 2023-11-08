package Graph;
import java.util.*;

public class GraphImplement {
    public static void main(String[] args) {

        ArrayList<Edge> []list=new ArrayList[5];
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



    }
}
class Edge{
    int src;
    int dest;
    Edge(int src,int dest){
        this.src=src;
        this.dest=dest;
    }
}

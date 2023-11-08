package Myjava;
import java.util.*;

public class Arrays {
public static void main(String []args) {
	int arr[]= {3,2,2,3};
	System.out.println(find3Numbers(arr,arr.length,6));
	
}
public static boolean find3Numbers(int A[], int n, int X) { 
    
    // Your code Here
    HashMap<Integer,Integer> list=new HashMap<>();
    
    for(int i=0;i<n;i++){
        if(list.containsKey(A[i]))
              list.put(A[i],list.get(A[i])+1);
         else if(A[i]<=X)
           list.put(A[i],1);
        
        
    }
    int count=0;
    for(int i=0;i<n-1;i++){
        if(list.containsKey(A[i])){
              if(list.get(A[i])==1)
                     list.remove(A[i]);
                 else
                     list.put(A[i],list.get(A[i])-1);
                     
          for(int j=i+1;j<n;j++){
            //int c=X-A[i]+A[j];
            if(list.containsKey(A[j])){
                
                 int c=X-(A[i]+A[j]);
                 
                 list.put(A[j],list.get(A[j])-1);
               
                     
                     if(list.containsKey(c))
                          count+=list.get(c);
                  list.put(A[j],list.get(A[j])+1);
            }
            
            
            
            
        }
            
            
        }
     //   else
     //      continue;
        
        
    }
    return count!=0;
 
 }
}

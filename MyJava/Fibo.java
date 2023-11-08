package Myjava;

public class Fibo {
     public static void main(String [] args) {
    	 long []f=new long[8];
    	 System.out.println(find(7,f));
    	 //USING DP SOLUTIONS
    	 
     }
     static long find(long n,long []f) {
    	 if(n==0||n==1)
    		  return n;
    	 if(f[(int)n]!=0)
    		  return f[(int)n];
    	 
    	 f[(int)n]=find(n-1,f)+find(n-2,f);
    	 return f[(int)n];
     }
}

package Myjava;
import java.util.*;
public class SSTF {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter maximum request");
		int max=sc.nextInt();
		System.out.println("Enter no. of requests");
		int req=sc.nextInt();
		int list[]=new int[req+1];
		System.out.println("Enter the request");
		for(int i=0;i<req;i++)
			 list[i]=sc.nextInt();
		System.out.println("Enter the R/W");
		     list[req]=sc.nextInt();
		     int t=list[req];
		     Arrays.sort(list);
		 int rw=BinarySearch(list,t);
		 
		 System.out.println("Enter 1 for lower and 0 for higher");
		 int c=sc.nextInt();
		 if(c==1)
			 lower(list,rw,req);
		 else
			 higher(list,rw,req);
		
		
	}
	static void lowerScan(int arr[],int rw,int req,int min) {
		int s=rw-1;
		int e=rw+1;
		int count=0;
		int seek=arr[rw];
		while(s!=-1) {
			count+=Math.abs(seek-arr[s]);
			seek=arr[s];
			s--;
			System.out.println("NEW R/W IS "+seek);
			System.out.println("SEEK TIME "+count);
			 if(s==-1) {
	    		 seek=0;
	    		 count+=Math.abs(arr[s+1]);
	    		 System.out.println("NEW R/W IS "+seek);
	 			System.out.println("SEEK TIME "+count);
	    		 
	    		 
	    	 }
			
			
		}
		while(e!=arr.length) {
			 count+=Math.abs(seek-list[e]);
		    	// rw=e;
				 seek=arr[e];
		    	 e++;
		    	 System.out.println("NEW R/W IS "+seek);
				System.out.println("SEEK TIME "+count);
			
		}
		System.out.println("---------------------------------------");
		System.out.println("TOTAL SEEK TIME "+count);
		System.out.println("---------------------------------------");
		System.out.println("AVG SEEK TIME "+count/req);
		
		
		
	}
	static void higherScan(int arr[],int rw,int req,int max) {
		int s=rw-1;
		int e=rw+1;
		int count=0;
		int seek=arr[rw];
		while(e!=arr.length) {
			 count+=Math.abs(seek-arr[e]);
	    	// rw=e;
			 seek=arr[e];
	    	 e++;
	    	 System.out.println("NEW R/W IS "+seek);
			System.out.println("SEEK TIME "+count);
	    	 if(e==arr.length) {
	    		 seek=max-1;
	    		 count+=Math.abs(arr[e-1]-seek);
	    		 System.out.println("NEW R/W IS "+seek);
	 			System.out.println("SEEK TIME "+count);
	    		 
	    		 
	    	 }
			
			
			
		}
		while(s!=-1) {
			count+=Math.abs(seek-arr[s]);
			seek=arr[s];
			s--;
			System.out.println("NEW R/W IS "+seek);
			System.out.println("SEEK TIME "+count);
			
			
		}
		System.out.println("---------------------------------------");
		System.out.println("TOTAL SEEK TIME "+count);
		System.out.println("---------------------------------------");
		System.out.println("AVG SEEK TIME "+count/req);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void lower(int []list,int rw,int req) {
		int s=rw-1;
		int e=rw+1;
		//int time=list[rw];
		int count=0;
		while(s!=-1&&e!=list.length) {
			if(Math.abs(list[rw]-list[s])<=Math.abs(list[rw]-list[e])) {
				count+=Math.abs(list[rw]-list[s]);
				rw=s;
				s--;
				System.out.println("NEW R/W IS "+list[rw]);
				System.out.println("SEEK TIME "+count);
				//count+=Math.abs()
				
				
		     }else {
		    	 count+=Math.abs(list[rw]-list[e]);
		    	 rw=e;
		    	 e++;
		    	 System.out.println("NEW R/W IS "+list[rw]);
				System.out.println("SEEK TIME "+count);
		    	 
		    	 
		    	 
		     }
		
			
			
		}
		while(e!=list.length) {
			count+=Math.abs(list[rw]-list[e]);
	    	 rw=e;
	    	 e++;
	    	 System.out.println("NEW R/W IS "+list[rw]);
			System.out.println("SEEK TIME "+count);
	    	 
			
			
		}
		while(s!=-1) {
			count+=Math.abs(list[rw]-list[s]);
			rw=s;
			s--;
			System.out.println("NEW R/W IS "+list[rw]);
			System.out.println("SEEK TIME "+count);
		}
		System.out.println("---------------------------------------");
		System.out.println("TOTAL SEEK TIME "+count);
		System.out.println("---------------------------------------");
		System.out.println("AVG SEEK TIME "+count/req);
		
		
		
	}
	static void higher(int []list,int rw,int req) {
		int s=rw-1;
		int e=rw+1;
		//int time=list[rw];
		int count=0;
		while(s!=-1&&e!=list.length) {
			if(Math.abs(list[rw]-list[s])>=Math.abs(list[rw]-list[e])) {
				count+=Math.abs(list[rw]-list[s]);
				rw=s;
				s--;
				System.out.println("NEW R/W IS "+list[rw]);
				System.out.println("SEEK TIME "+count);
				//count+=Math.abs()
				
				
		     }else {
		    	 count+=Math.abs(list[rw]-list[e]);
		    	 rw=e;
		    	 e++;
		    	 System.out.println("NEW R/W IS "+list[rw]);
				System.out.println("SEEK TIME "+count);
		    	 
		    	 
		    	 
		     }
		
			
			
		}
		while(e!=list.length) {
			count+=Math.abs(list[rw]-list[e]);
	    	 rw=e;
	    	 e++;
	    	 System.out.println("NEW R/W IS "+list[rw]);
			System.out.println("SEEK TIME "+count);
	    	 
			
			
		}
		while(s!=-1) {
			count+=Math.abs(list[rw]-list[s]);
			rw=s;
			s--;
			System.out.println("NEW R/W IS "+list[rw]);
			System.out.println("SEEK TIME "+count);
		}
		System.out.println("---------------------------------------");
		System.out.println("TOTAL SEEK TIME "+count);
		System.out.println("---------------------------------------");
		System.out.println("AVG SEEK TIME "+count/req);
		
		
		
		
	}
	static int BinarySearch(int []arr,int t) {
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int m=(s+e)/2;
			if(arr[m]==t)
				 return m;
			else if(arr[m]>t) {
				e=m-1;
			}
			else {
				s=m+1;
			}
		}
		return 0;
	}

}

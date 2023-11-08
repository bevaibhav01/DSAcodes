package DynamicProgramming;

public class Knapsack_01 {
public static void main(String[]args) {
	
	int[]value= {15,14,10,45,30};
	int []wt= {2,5,1,3,4};
	System.out.println(maxProfit(value,wt,0,7));
	
}

static int maxProfit(int []val,int[]wt,int i,int maxWt) {
	 if(maxWt==0||i==wt.length)
		  return 0;
	 if(wt[i]<=maxWt) {
		 int include=val[i]+maxProfit(val,wt,i+1,maxWt-wt[i]);
		 int exclude=maxProfit(val,wt,i+1,maxWt);
		 return Math.max(include,exclude);
	 }else {
		 int exclude=maxProfit(val,wt,i+1,maxWt);
		 return exclude;
	 }
}
}

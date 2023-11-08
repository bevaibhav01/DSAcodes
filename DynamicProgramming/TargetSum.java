package DynamicProgramming;

public class TargetSum {
	public static void main(String []args) {
		int arr[]= {4,2,7,1,3};
		int sum=10;
		System.out.println(targetSum(arr,sum));
	}
	static boolean targetSum(int []arr,int sum) {
		int n=arr.length;
		int m=sum;
		boolean dp[][]=new boolean[n+1][m+1];
		for(int i=0;i<=n;i++) {
			dp[i][0]=true;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				int currVal=arr[i-1];
				
				if(currVal<=j) {
					
					dp[i][j]=dp[i-1][j-currVal]||dp[i-1][j]?true:false;
				}else {
					dp[i][j]=dp[i-1][j]==true?true:false;
				}
				
			}
		}
		
		return dp[n][m];
		
		
		
	}

}

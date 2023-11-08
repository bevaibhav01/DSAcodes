package DynamicProgramming;

public class catalan {
	public static void main(String[]args) {
		int n=7;
		int dp[]=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		System.out.println(catalanMem(n,dp));
	}
	
	static int catalanRec(int n) {
		if(n<1)
			return 1;
		int ans=0;
		for(int i=0;i<n;i++) {
			ans+=catalanRec(i)*catalanRec(n-1-i);
		}
		return ans;
	}
	static int catalanMem(int n,int[]dp) {
		if(dp[n]!=0)
			return dp[n];
		int ans=0;
		for(int i=0;i<n;i++) {
			ans+=catalanMem(i,dp)*catalanMem(n-1-i,dp);
		}
		dp[n]=ans;
		return dp[n];
	}

}

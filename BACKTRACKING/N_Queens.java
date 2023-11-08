package BACKTRACKING;

import java.util.Scanner;

public class N_Queens {
	public static void main(String []args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int nqueen[][]=new int[n][n];
			nQueens(nqueen,0);
		}
		
		
		
	}
	
	static void nQueens(int [][]nqueen,int row) {
		int n=nqueen.length;
		if(row==n) {
			printQ(nqueen);
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(isSafe(nqueen,row,i)) {
				nqueen[row][i]=1;
				nQueens(nqueen,row+1);
				nqueen[row][i]=0;
			}
		}
		
		
	}
	
	private static void printQ(int[][] nqueen) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------");
		int n=nqueen.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(nqueen[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	static boolean isSafe(int [][]nqueen,int row,int col) {
		for(int i=row-1;i>=0;i--) {
			if(nqueen[i][col]==1)
				return false;
		}
		
		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
			if(nqueen[i][j]==1)
				return false;
		}
		
		for(int i=row-1,j=col+1;i>=0&&j<nqueen.length;i--,j++) {
			if(nqueen[i][j]==1)
				 return false;
		}
		
		return true;
		
		
	}

}

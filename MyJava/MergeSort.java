package Myjava;

import java.util.Arrays;

public class MergeSort {
	public static void main(String [] args) {
		int[] arr= {5,4,3,2};
		mergeSortInPlace(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		
	}

	static void mergeSortInPlace(int []arr,int s,int e) {
		if(e-s==0)
			return;
		int m=(s+e)/2;
		mergeSortInPlace(arr,s,m);
		mergeSortInPlace(arr,m+1,e);
		mergeInplace(arr,s,m,e);
		
		
	}
	static void mergeInplace(int []arr,int s,int m,int e) {
		int i=s,j=m+1,k=0;
		int []mix=new int[e-s+1];
		while(i<=m&&j<=e) {
			if(arr[i]>arr[j]) {
				 mix[k]=arr[j];
				 j++;
			}
			else {
				mix[k]=arr[i];
				i++;
			}
			k++;
		}
		while(i<=m) {
			mix[k]=arr[i];
			i++;
			k++;
		}
		while(j<=e) {
			mix[k]=arr[j];
			j++;
			k++;
		}
		
		for(k=0;k<mix.length;k++) {
			arr[s+k]=mix[k];
			
		}
		
		
	}
	
	
	static int[] mergeSort(int[] arr) {
		if(arr.length==1)
			 return arr;
		int mid=arr.length/2;
		int []left=mergeSort(Arrays.copyOfRange(arr,0,mid));
		int []right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
	}
	static int[] merge(int [] left,int [] right) {
		int i=0;
		int j=0;
		int k=0;
		int [] ans=new int[left.length+right.length];
		while(i<left.length&&j<right.length) {
			if(left[i]>right[j])
			{
				ans[k]=right[j];
				j++;
			}
			else {
				ans[k]=left[i];
				i++;
			}
			k++;
		
			
		}
		while(i<left.length) {
			ans[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			ans[k]=right[j];
			j++;
			k++;
		}
		return ans;
		
	}

}

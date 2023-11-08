package Myjava;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int a[]= {5,4,3,2,1};
		insertSort(a);
		System.out.println(Arrays.toString(a));
		
	}
	
	static void insertSort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					int t=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=t;
					
				}
				else {
					break;
				}
				
				
				
			}
		}
		
	}

}

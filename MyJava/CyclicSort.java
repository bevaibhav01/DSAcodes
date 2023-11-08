package Myjava;

public class CyclicSort {
	public static void main(String[]args) {
		int arr[]= {3,5,2,1,4};
		cyclicSort(arr);
		//System.out.println(arr);
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	static void cyclicSort(int []arr) {
		int n=arr.length;
		int i=0;
		
		while(i<n) {
			if(i!=arr[i]-1) {
				int idx=arr[i]-1;
				int temp=arr[idx];
				arr[idx]=arr[i];
				arr[i]=temp;
			}else {
				i++;
			}
			
		}
	}

}

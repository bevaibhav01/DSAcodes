package Myjava;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] a={44,6,2,33,11,23,0};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));

    }
    static void bubbleSort(int [] arr){
        int f=0;
        for(int i=0;i<arr.length-1;i++){
            f=0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                    f=1;
                }
            }
            if(f==0)
                break;
        }

    }
}

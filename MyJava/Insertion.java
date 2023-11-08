package Myjava;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int []a={5,4,3,2,1};
        insertion(a);
        System.out.println(Arrays.toString(a));

    }
    static void insertion(int []arr){
        for(int i=0;i<=arr.length-2;i++){
            int key=i+1;
            while(key>0&&arr[key]<arr[key-1]){
                int a=arr[key-1];
                arr[key-1]=arr[key];
                arr[key]=a;
                key--;

            }
        }
    }
}

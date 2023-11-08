package MyJava;

public class Ceiling {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 13, 14, 16, 18};
        int ans=search(a,19);
        System.out.println(ans);
    }
    static int search(int [] a,int t){
        int s=0;
        int e=a.length-1;
       int m=(s+e)/2;
        while(s<=e){
            m=(s+e)/2;
            if(a[m]==t)
                return a[m];
            if(t>a[m])
            {
                s=m+1;
            }
            else
                e=m-1;



        }
       // return a[s];///ceiling number return;
        return a[e];//floor number return;


    }

}

public class binarysearch {
    public static void main(String[] args) {
        int []a={2,3,4,5,6,7};
        System.out.println(binary(a,7,0,5));

    }
    static int binary(int [] a,int t, int s ,int e){
        int m=s+(e-s)/2;
        if(s>e)
          return -1;
        if(a[m]==t)
            return m;
        else if(a[m]>t)
               return  binary(a,t,s,m-1);
        else
            return binary(a,t,m+1,e);

    }
}

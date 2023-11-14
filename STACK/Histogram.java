import java.util.*;
import java.math.*;
public class Histogram {
    public static void main(String[] args) {
        //IMP Q YOU SHOULD KNOW HOU FIND SMALLER LEFT AND RIGHT ALREADY CODED IN NEXT GREATER ELEMENT
        int max=0,curr=0;
        int a[]={2,4};
        int rl[]=new int[a.length];
        int rr[]=new int[a.length];
        smallerLeft(a,rl);
        smallerRight(a,rr);
        for(int i=0;i<a.length;i++){
            curr=a[i]*(rr[i]-rl[i]-1);
            max=Math.max(max,curr);

        }
        System.out.println(max);
    }
    static void smallerLeft(int a[],int [] rl){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.empty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.empty()){

                rl[i]=-1;
            }
            else if(s.empty()==false)
                 rl[i]=s.peek();
            s.push(i);
        }

    }
    static void smallerRight(int a[],int [] rr){
        Stack<Integer> s=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!s.empty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.empty()){

                rr[i]=a.length;
            }
            else if(s.empty()==false)
               rr[i]=s.peek();
            s.push(i);
        }

    }

}

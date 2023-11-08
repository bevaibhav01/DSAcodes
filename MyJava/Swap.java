package MyJava;
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        num c=new num();
//        num d=new num();
//        c.a=3;
//        d.a=4;
        int c=3;
        int d=4;
        swap(c,d);
        System.out.println(c);

    }
    static void swap(int a,int b){
   //a.a=4;
        int t;
        t=a;
        a=b;
        b=t;
//        System.out.println(a.a);
    }
}
//class num{
//    int a;
//    //int b;
//
//}

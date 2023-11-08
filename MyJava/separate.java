package MyJava;

import java.util.Scanner;

public class separate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%3==0)
            System.out.println(n/3+"  3s");
       else  if(n%3==2) {
            System.out.println(n / 3 + "  3s");
            System.out.println(1 + " 2s");
        }
       else
        {
            System.out.println((n/3)-1+"   3s");
            System.out.println(2+"   2s");
        }

    }
}

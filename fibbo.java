package MyJava;

public class fibbo {
    public static void main(String[] args) {
        System.out.println(search(6));

    }
    static int search(int n)
    {
        if(n==0)
            return 0;
        if(n==1|| n==2)
            return 1;
        return search(n-1)+search(n-2);
    }
}

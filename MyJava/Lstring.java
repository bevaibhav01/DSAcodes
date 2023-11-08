package MyJava;

public class Lstring {
    public static void main(String[] args) {
        String s="vaibhav";
        char a='h';
        System.out.println(search(s,a));

    }
    static int search(String s,char a){
        for(int i=0;i<s.length();i++){
            if(a==s.charAt(i))
                return i;

        }
        return -1;

    }
}

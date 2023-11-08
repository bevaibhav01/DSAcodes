import java.util.Stack;

public class DuplicateRemovals1047lc {
    public static void main(String[] args) {
        String s="azxxzy";

        Stack<Character> list =new Stack<>();
        for(int i=0;i<s.length();i++){
            if(list.empty()){
                list.push(s.charAt(i));
            }
            else if(s.charAt(i)==list.peek()){
                list.pop();
            }
            else
                list.push(s.charAt(i));

        }
        StringBuilder a=new StringBuilder();
        System.out.println(list.pop());
        System.out.println(list.pop());

//        String result="";
//        removeDuplicates(s,list,list.pop());
//        while(!list.empty()){
//           // System.out.println();
//            result+=s.charAt(list.pop());
//        }
//        System.out.println(result);



    }
    static void removeDuplicates(String s,Stack<Integer> list, int a){
         String result="";

        if(list.empty()){
           // System.out.println("iam running");
            list.push(a);
            return;
        }
       else if(s.charAt(a)==s.charAt(list.peek())){
         //   System.out.println("iam running");
            list.pop();
            removeDuplicates(s, list, a);
        }
        else{
          //  System.out.println("iam running");
            int t=list.pop();
            removeDuplicates(s,list,a);
            list.push(t);
            return;
        }


    }
}

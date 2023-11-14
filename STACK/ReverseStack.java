import java.util.*;
public class ReverseStack {
    public static void main(String[] args) {
      Stack<Integer> list=new Stack<>();
      list.push(1);
      list.push(2);
      list.push(3);
      removeTop(list);
      while(!list.empty())
          System.out.println(list.pop() + " ");
    }
   static void removeTop(Stack<Integer> s){
        if(s.empty())
             return;
        int top=s.pop();
        removeTop(s);
        pushAtBottom(s,top);

    }
   static void pushAtBottom(Stack<Integer> s , int top){
        if(s.empty()){
            s.push(top);
            return;
        }
        int t=s.pop();
        pushAtBottom(s,top);
        s.push(t);




    }
}

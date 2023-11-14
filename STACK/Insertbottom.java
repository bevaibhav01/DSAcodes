import java.util.*;

public class Insertbottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> list = new Stack<Integer>();
      //  Stack<Integer> list1 = new Stack<Integer>();
        //Stack<Integer> result = new Stack<Integer>();
        //Don't need for extra stack use first empty stack and try
        //try to solve using functions
        //You can also solve this Q with recursion both soln r provided down there.
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        pushAtBottom(list,7);
        while(!list.empty()){
            System.out.println(list.pop());
        }

//        while (!list.empty()) {
//            list1.push(list.peek());
//            list.pop();
//        }
//        int a = sc.nextInt();
//        list.push(a);
//        while (!list1.empty()) {
//            list.push(list1.peek());
//            list1.pop();
//        }
//        while (!list.empty()) {
//            System.out.print(list.peek() + " ");
//            // System.out.println("helloe");
//            list.pop();
//        }
    }
    static void pushAtBottom(Stack<Integer> s ,int input){
        if(s.empty()){
            s.push(input);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,input);
        s.push(top);
    }
}

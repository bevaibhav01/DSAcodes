import java.util.*;
public class Prefix {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter the size of your eqn");
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        MyStack2 stack=new MyStack2(a);
        System.out.println("enter the eqn");
        char [] array=new char[a];
        MyStack2 result =new MyStack2(a);
        for(int i=0;i<a;i++){
            array[i]=sc.next().charAt(0);
        }
        //(8+3)*(4+2)
        for(int i=a-1;i>=0;i--){
            if(array[i]==')') {
                stack.push(')');
            }
            if(array[i]>='0'&&array[i]<='9'){
                result.push(array[i]);
            }
            if(array[i]=='+' || array[i]=='-'){
                if(stack.top()=='*' || stack.top()=='/') {
                    result.push(stack.pop());
                    stack.push(array[i]);
                }
                if(stack.top()=='+'|| stack.top()=='-' || stack.top==')')
                       stack.push(array[i]);

            }
            char r;
            if(array[i]=='*'|| array[i]=='/')
                  stack.push(array[i]);
            if(array[i]=='('){
                while(stack.top()!=')'){
                    if(stack.top==')')
                        r=stack.pop();
                    else
                    result.push(stack.pop());
                }

            }
        }
        while(!stack.isEmpty()){
            result.push(stack.pop());
        }
        while(!result.isEmpty()){
            System.out.print(result.pop()+" ");
        }




    }

}
class MyStack2{
    int top=-1;
    int size;
    char [] data;
    MyStack2(int size){
        data=new char[size];

    }
    boolean isFull(){
        return top==data.length-1;

    }
    boolean isEmpty(){
        return top==-1;
    }
    void push(char input){
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        data[top]=input;

    }
    char pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return data[top--];
    }
    char top() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return data[top];
    }


}

import java.util.*;
public class Infixtoprefix{
    public static void main(String [] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of charcter in eqn and enter it one by one");
        int a=sc.nextInt();
        System.out.println("Enter the Eqn");
        char [] eqn=new char[a];
        char tmp;
        MyStack1 result=new MyStack1(a);

        for(int i=0;i<a;i++){
            eqn[i]=sc.next().charAt(0);
        }
        MyStack1 stack=new MyStack1(a);
        for(int i=a-1;i>-1;i--){
            if(eqn[i]==')'){
                stack.push(')');
                System.out.println(" ')' Push into the Stack ");
            }
            else if(eqn[i]>='0'&&eqn[i]<='9'){
                result.push(eqn[i]);
                System.out.println(eqn[i]+" Operand encounter printed on the screen");
            }
            else if(eqn[i]=='*'||eqn[i]=='/'){

                stack.push(eqn[i]);
                System.out.println(eqn[i] +" push into the stack");


            }
            else if(eqn[i]=='+'||eqn[i]=='-'){
                if(stack.isEmpty()){
                    stack.push(eqn[i]);
                    System.out.println(eqn[i]+" Push into the stack");

                }
               else if(stack.top()=='*'||stack.top()=='/'){
                    System.out.println(stack.top()+" Pop to the output");
                    result.push(stack.pop());
                    stack.push(eqn[i]);
                    System.out.println(eqn[i] +" push into the stack");
                }
                else {
                    stack.push(eqn[i]);
                    System.out.println(eqn[i]+" Push into the stack");
                }


            }

            else if(eqn[i]=='('){
                while(true){
//if(stack.top()!=')')
                    if(stack.top()==')')
                    {
                       // System.out.println(stack.top()+"  Pop");
                        tmp=stack.pop();
                        break;
                    }
                    else {
                        System.out.println(stack.top()+"  Pop to the output");
                        result.push(stack.pop());
                    }

                }


            }
        }
        while(!stack.isEmpty()){
//if(stack.top()!=')')
            System.out.println(stack.top()+"   Pop to output ");
            result.push(stack.pop());
        }
       // char r;

        System.out.println("The final answer");
        System.out.println("----------------------------------------------------------------------------");
        while(!result.isEmpty()){
            System.out.print(result.pop());

        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------");











    }

}


class MyStack1{
    final int default_size=10;
    int ptr=-1;
    char [] data;
    MyStack1(){
        this.data=new char[default_size];

    }
    MyStack1(int size){
        this.data=new char[size];

    }
    boolean isFull(){
        return ptr==data.length-1;
    }
    boolean isEmpty(){
        return ptr==-1;
    }

    void push(char input) {
        if(isFull()){
            System.out.print("Stack is full");

        }
       ptr++;

        data[ptr]=input;


    }
    char pop() throws Exception{
        if(isEmpty()){
            System.out.print("Stack empty");

        }

        return data[ptr--];


    }
    char top(){
        return data[ptr];
    }



}

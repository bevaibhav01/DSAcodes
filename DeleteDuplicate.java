import java.util.*;
public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StackLinkedL list = new StackLinkedL();
        while(true){
            System.out.println("Enter value");
            int a=sc.nextInt();
            list.push(a);
            System.out.println("press 1 to continue");
            a=sc.nextInt();
            if(a==1)
                 continue;
            else
                break;
        }
        StackLinkedL result=new StackLinkedL();
        while(!list.isEmpty()){
            if(result.isEmpty()){
                result.push(list.pop());
            }
            else if(result.peek()==list.peek()){
                list.pop();
            }
            else
                result.push(list.pop());
        }
        result.display();




    }
}
class StackLinkedL{
    Node head;
    void display(){
        Node n=head;
        while(n!=null){
            System.out.println(n.value);
            n=n.next;

        }
    }
    void push(int data){
        Node a = new Node(data);
        if (head==null){
            head=a;
        }
        else{
            a.next=head;
            head=a;
        }

    }
    int peek(){
        return head.value;
    }
    boolean isEmpty(){
        return head==null;
    }
    int pop(){
        int value=head.value;
        head=head.next;
        return value;


    }


    class Node{
        int value;
        Node next;
        Node(int data){
            value=data;
        }
    }
}

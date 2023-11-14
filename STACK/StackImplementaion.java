
import java.util.*;

public class StackImplementaion {
    public static void main(String[] args) {
        //Implementing stack in array is not preferable because has a fixed size
        //We can implement stack in arraylist and linked list to overcome this fixed sized problem

        //solving for array list
        /*  StackArrayList list=new StackArrayList();
        list.push(7);
        list.push(8);
        list.push(9);
        System.out.println(list.pop());
        list.push(99);
        list.push(78);
        list.push(66);
        list.display();
        */
    StackLinkedList list=new StackLinkedList();
    list.push(1);
    list.push(2);
    list.push(3);
    list.display();
        list.pop();
        list.pop();
        list.pop();
    list.display();

    }
}
class StackLinkedList{
    Node head;
   boolean isEmpty(){
       return head==null;
   }
   void display(){
       Node t=head;
       while(t!=null) {
           System.out.print(t.value+" ");
           t=t.next;
       }
       System.out.println("");
   }
   void push(int input){
       Node a =new Node(input);
       if(isEmpty())
       {
           head=a;
           return;
       }
       a.next=head;
       head=a;


   }
   int pop(){
       if(isEmpty()){
           System.out.println("Stack is mt");
           return -1;
       }
       int val=head.value;
       head=head.next;
       return val;

   }

    class Node{
        int value;
        Node next;
        Node(int a){
            value=a;
        }
    }

}
class StackArrayList{
    ArrayList<Integer> list=new ArrayList<>();

    boolean isEmpty(){
        return list.size()==0;
    }
    void push(int input){
        list.add(input);
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int a=list.get(list.size()-1);//time complexity for get,add,remove is 0(1);
        list.remove(list.size()-1);
        return a;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return list.get(list.size()-1);
    }
    void display(){
        for(int i=list.size()-1;i>=0;i--)
            System.out.print(list.get(i)+" ");
    }


}


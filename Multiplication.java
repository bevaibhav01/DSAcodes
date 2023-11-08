import java.util.*;
public class Multiplication{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        PolyList list1=new PolyList();
        PolyList list2=new PolyList();
        PolyList result=new PolyList();

        System.out.println("Enter the number of terms in your equation1");
        int t=sc.nextInt();
        int c,e;
        for(int i=1;i<=t;i++){
            System.out.println("Enter Coefficient of term "+ i);
            c=sc.nextInt();
            System.out.println("Enter Exponent of term "+ i);
            e=sc.nextInt();

            list1.insert(c,e);


        }
        System.out.println("Enter the number of terms in your equation2");
        t=sc.nextInt();
        for(int i=1;i<=t;i++){
            System.out.println("Enter Coefficient of term "+ i);
            c=sc.nextInt();
            System.out.println("Enter Exponent of term "+ i);
            e=sc.nextInt();

            list2.insert(c,e);


        }
        list1.display();
        list2.display();
        result.Multiplication(list1,list2);
        result.display();



    }


}

class PolyList{
    Node head;
    Node tail;
    int size=0;

    void Multiplication(PolyList list1 , PolyList list2){
        Node temp1=list1.head;
        while(temp1!=null){
            Node temp2=list2.head;
            while(temp2!=null){
                this.insert((temp1.coefficient*temp2.coefficient),(temp1.exponent+temp2.exponent));

                temp2=temp2.next;



            }
            temp1=temp1.next;


        }

    }


    void insert(int coefficient , int exponent){
        Node newnode=new Node(coefficient,exponent);
        size++;
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;


    }
    void display(){

        Node p=head;
        while(p!=null){
            System.out.print(p.coefficient+"x^"+p.exponent+"+ ");
            p=p.next;

        }
        System.out.println();

    }



}


class Node{
    int coefficient;
    int exponent;
    Node next;
    Node(int coefficient , int exponent){
        this.coefficient=coefficient;
        this.exponent=exponent;


    }
}

import java.util.*;
    public class Vaibhav71{
        public static void main(String[] args) {
            DLL list = new DLL();
            Scanner sc = new Scanner(System.in);
            int t,c,a;
            while(true){
                System.out.println("--------------------------------------");
                System.out.println("1)ENTER 1 FOR INSERTION");
                System.out.println("2)ENTER 2 FOR DELETION");
                System.out.println("--------------------------------------");
                t=sc.nextInt();
                if(t==1){
                    System.out.println("ENTER THE DATA YOU WANT TO INSERT");
                    c=sc.nextInt();
                    System.out.println("------------------------------------");
                    System.out.println("1)ENTER 1 FOR INSERTION AT FIRST");
                    System.out.println("1)ENTER 2 FOR INSERTION AT LAST");
                    System.out.println("1)ENTER 3 FOR INSERTION AT LEFT SIDE");
                    System.out.println("1)ENTER 4 FOR INSERTION AT RIGHT SIDE");
                    System.out.println("------------------------------------");
                    t=sc.nextInt();
                    if(t==1){
                        list.insertAtFirst(c);
                        list.display();
                    }
                    if(t==2){
                        list.insertAtLast(c);
                        list.display();

                    }
                    if(t==3){
                        System.out.println("Enter the data refrence data");
                        a=sc.nextInt();
                        list.insertLeft(a,c);
                        list.display();

                    }
                    if(t==4){
                        System.out.println("Enter the data refrence data");
                        a=sc.nextInt();
                        list.insertRight(a,c);
                        list.display();


                    }



                }
                else{
                    System.out.println("------------------------------------");
                    System.out.println("1)ENTER 1 FOR DELETION  AT FIRST");
                    System.out.println("1)ENTER 2 FOR DELETION AT LAST");
                    System.out.println("1)ENTER 3 FOR DELETION AT RIGHT SIDE");
                    System.out.println("1)ENTER 4 FOR DELETION AT LEFT SIDE");
                    System.out.println("------------------------------------");
                    t=sc.nextInt();
                    if(t==1){
                        System.out.println(list.deleteFirst());
                        list.display();
                    }
                    if(t==2){
                        System.out.println(list.deleteLast());
                        list.display();
                    }
                    if(t==3){
                        System.out.println("Enter refrence data");
                        a=sc.nextInt();
                        list.deleteLeft(a);
                        list.display();
                    }
                    if(t==4){
                        System.out.println("Enter refrence data");
                        a=sc.nextInt();
                        list.deleteRight(a);
                        list.display();
                    }





                }

                System.out.println("press 1 to continue else any");
                c=sc.nextInt();
                if(c==1)
                    continue;
                else
                    break;


            }

        }


    }

    class DLL{
        Node head;
        void insertAtFirst(int data){
            Node node=new Node(data);
            if(head==null){
                head=node;
                return;
            }
            node.next=head;
            head.prev=node;
            head=node;


        }
        int deleteFirst(){
            int val=head.value;
            head=head.next;
            head.prev=null;
            return val;


        }
        int deleteLast(){
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            int val=temp.value;
            temp.prev.next=null;
            return val;


        }
        int deleteLeft(int data){
            Node ptr=getNode(data);
            int val=ptr.next.value;
            ptr.next.next.prev=ptr;
            ptr.next=(ptr.next).next;
            return val;



        }
        int deleteRight(int data){
            Node ptr=getNode(data);
            int val=ptr.prev.value;
            ptr.prev.prev.next=ptr;
            ptr.prev=ptr.prev.prev;
            return val;



        }
        void insertAtLast(int data){
            Node node=new Node(data);
            if(head==null){
                head=node;
                return;

            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;

        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value+" ");
                temp=temp.next;

            }
            System.out.println();

        }

        Node getNode(int data){
            Node temp=head;
            while(temp!=null){
                if(temp.value==data){

                    return temp;
                }
                temp=temp.next;

            }

            return null;



        }
        void insertLeft(int data,int c){//wprk remaing here;
            Node ptr=getNode(data);
            Node node=new Node(c);
            if(ptr==null){
                System.out.println("Node not exist");
                return;
            }
            node.next=ptr.next;
            ptr.next.prev=node;
            ptr.next=node;
            node.prev=ptr;



        }
        void insertRight(int data,int c){//wprk remaing here;
            Node ptr=getNode(data);
            Node node=new Node(c);
            if(ptr==null){
                System.out.println("Node not exist");
                return;
            }
            ptr.prev.next=node;
            node.prev=ptr.prev;
            node.next=ptr;
            ptr.prev=node;



        }

        class Node {
            int value;
            Node next;
            Node prev;
            Node(int data){
                value=data;

            }
        }
}
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Node1 root=null;
        BinaryTree list = new BinaryTree();
        while(true){
            System.out.println("PRESS 1 FOR INSERT /n PRESS 2 FOR DELETE /n PRESS 3 FOR EXIT");
            int t=sc.nextInt();
            if (t==1){



                int data;
                System.out.println("Enter data");
                data=sc.nextInt();


                root=list.insert(root,data);


                list.display(root);
                System.out.println();
            }
            if(t==2){
                System.out.println("Enter the element you want to delete");
                int q=sc.nextInt();
                root=list.delete(root,q);
                list.display(root);
                System.out.println();
            }
            else if(t==3)
                break;

        }






    }

}

class BinaryTree{



    Node1 insert(Node1 root,int value){

        if(root==null){
            return new Node1(value);

        }

        if(root.value>value){
            root.left=insert(root.left,value);

        }

        else{

            root.right=insert(root.right,value);

        }

        return root;


    }



    void display(Node1 root){
        if(root==null)
            return;

        display(root.left);
        System.out.print(root.value+" ");
        display(root.right);

    }

    Node1 delete(Node1 root, int value){
        if(root.value>value){
            root.left=delete(root.left,value);
        }
        else if(root.value<value){
            root.right=delete(root.right,value);
        }

        if(root.value==value){
            if(root.left==null && root.right==null)
                return null;

            if(root.left==null)
                return root.right;
            else if (root.right==null)
                return root.left;

            Node1 is=succesor(root.right);
            root.value=is.value;
            root.right=delete(root.right,is.value);



        }

        return root;
    }

    Node1 succesor(Node1 root){
        while(root.left!=null)
            root=root.left;

        return root;



    }

}

class Node1{
    int value;
    Node1 left;
    Node1 right;

    Node1(int data){

        value=data;

    }
}


import java.util.*;
class ExpressionTree{
    public static void main(String [] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String exp="";
        System.out.println("Enter the number of charcter in eqn an enter it one by one");
        int a=sc.nextInt();
        System.out.println("Enter the Eqn");
        char [] eqn=new char[a];
        char tmp;
        MyStack result=new MyStack(a);
        for(int i=0;i<a;i++){
            eqn[i]=sc.next().charAt(0);
        }
        MyStack stack=new MyStack(a);
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
// System.out.println(stack.top()+" Pop");
                        tmp=stack.pop();
                        break;
                    }
                    else {
                        System.out.println(stack.top()+" Pop to the output");
                        result.push(stack.pop());
                    }
                }
            }
        }
        while(!stack.isEmpty()){
//if(stack.top()!=')')
            System.out.println(stack.top()+" Pop to output ");
            result.push(stack.pop());
        }
// char r;
        System.out.println("The final answer");
        System.out.println("----------------------------------------------------------------------------");
        while(!result.isEmpty()){
            exp=exp+result.pop();
        }
        System.out.println(exp);
        System.out.println("-------------------------------------------------------------------------------");


        ET1 e=new ET1();

        e.BuildTree(exp);

        System.out.println("inOrder: ");
        e.inOrderCall();
        System.out.println();

        System.out.println("postOrder: ");
        e.postOrderCall();
        System.out.println();

        System.out.println("preOrder: ");
        e.preOrderCall();
        System.out.println();






    }
}
class MyStack{
    final int default_size=10;
    int ptr=-1;
    char [] data;
    MyStack(){
        this.data=new char[default_size];
    }
    MyStack(int size){
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
class TreeNode{
    char data;
    TreeNode left, right;

    public TreeNode(char d) {
        data=d;
        left=null;
        right=null;
    }
}// normal Node class

class StackNode{
    TreeNode treeNode;
    StackNode next;

    public StackNode(TreeNode t){
        treeNode=t;
        next=null;
    }
} // stack ka node q ki stack mai bi phele wale ka address chahiye

class ET1{
    StackNode top;
    ET1(){
        top=null;
    }

    public void push(TreeNode t){
        if(top==null){
            top=new StackNode(t);
        }
        else {
            StackNode s=new StackNode(t);
            s.next=top;
            top=s;
        }
    }
    public TreeNode pop(){
        if(top==null){
            //System.out.println("Underflow");
            throw new RuntimeException("underflow");
        }
        else{
            TreeNode ptr=top.treeNode;
            top=top.next;
            return ptr;
        }
    }


    public TreeNode peek(){
        return top.treeNode;
    }

    public boolean isDigit(char ch){
        return ch>='0' && ch<='9';
    }

    public Boolean isOpertor(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch=='/';
    }

    public void insert(char val){
        if(isDigit(val)){
            TreeNode n =new TreeNode(val);
            push(n);
        }
        else if(isOpertor(val)){
            TreeNode n =new TreeNode(val);
            n.left=pop();
            n.right=pop();
            push(n);
        }
    }

    public void BuildTree(String exp){

        for(int i=exp.length()-1;i>=0;i--){
            insert(exp.charAt(i));
        }
    }

    void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    void inOrderCall(){
        inOrder(peek());
    }

    void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    void preOrderCall(){
        preOrder(peek());
    }

    void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    void postOrderCall(){
        postOrder(peek());
    }

}

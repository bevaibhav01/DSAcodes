import java.util.Stack;

public class QueueStack {
    public static void main(String[] args) {
        QueueUsing2Stack list=new QueueUsing2Stack();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());

    }

}
class QueueUsing2Stack{
    Stack<Integer>  list1 = new Stack<>();
    Stack<Integer>  list2= new Stack<>();

    boolean isEmpty(){
        return list1.empty();
    }
    void add(int input){
        while(!list1.isEmpty()){
            list2.push(list1.pop());
        }
        list1.push(input);
        while(!list2.isEmpty()){
            list1.push(list2.pop());
        }
    }
    int remove(){
        return list1.pop();
    }


}

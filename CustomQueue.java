import java.lang.Exception;
public class CustomQueue {
    int start=0;
    int end=-1;
    int [] array;
    int size;
    final int size1=10;
    CustomQueue(int size){
        array=new int[size];

    }
    boolean isFull(){
        return end==array.length-1;

    }
    boolean isEmpty(){
        return start>end;
    }
    void insert(int input) throws QueueException{
        if(isFull()){
            throw new QueueException("Q is full");
        }
        end++;
        array[end]=input;

    }
    int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Q is empty");
        }

        return array[start++];

    }
    void display(){
        for(int i=start;i<=end;i++)
            System.out.println(array[i]);
    }
}
class QueueException extends Exception{
     QueueException(String n){
        System.out.println(n);
    }

}

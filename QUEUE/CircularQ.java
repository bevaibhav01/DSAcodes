import java.lang.Exception;
public class CircularQ {
    int start=0;
    int end=-1;
    int [] array;
    int size=0;
   // final int size1=10;
    CircularQ(int size){
        array=new int[size];

    }
    boolean isFull(){
        return size==array.length;

    }
    boolean isEmpty(){
        return size==0;
    }
    void insert(int input) throws QueueException{
        if(isFull()){
            throw new QueueException("Q is full");
        }
        end++;
        end=end%array.length;
        array[end]=input;
        size++;

    }
    int remove() throws QueueException1{
        if(isEmpty()){
            throw new QueueException1("Q is empty");
        }
        size--;
        int a= array[start++];
        start= start% array.length;
        return a;

    }
    void display(){
        for(int i=start;i<=end;i++)
            System.out.println(array[i]);
    }
}
class QueueException1 extends Exception{
    QueueException1(String n){
        System.out.println(n);
    }

}


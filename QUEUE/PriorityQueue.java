public class PriorityQueue {
    int front=0;
    int rear=-1;
    int []data;
    int max;
    PriorityQueue(int size){
        data=new int[size];
    }
    boolean isFull(){
        return rear==data.length-1;
    }
    boolean isEmpty(){
        return front>rear;
    }
    void insert(int input) throws Exception{
        if(isFull()){
            throw new Exception("FULL");
        }
        rear++;
        data[rear]=input;
        max=input;
        for(int i=front;i<=rear;i++){
            
        }

    }
    int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Q is empty");
        }

        return data[front++];

    }

}

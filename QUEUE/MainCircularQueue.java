public class MainCircularQueue {
    public static void main(String[] args) {
        CircularQueue list=new CircularQueue(5);
        list.enque(1);
        list.enque(2);
        list.enque(3);
        list.enque(4);
        list.enque(5);
        System.out.println(list.deque());
        System.out.println(list.deque());
        list.display();
        list.enque(10);
        list.enque(11);
        list.display();
        System.out.println(list.data[1]);
    }
}
class CircularQueue{
    int [] data;
    CircularQueue(int size){
        data=new int[size];
    }
    int front=-1;
    int rear=-1;
boolean isEmpty(){
    return front==-1&&rear==-1;
}
boolean isFull(){
    return (rear+1) % data.length == front;
}
void enque(int input){
    if(isFull()){
        System.out.println("Q is full");
        return ;
    }
    if(front==-1)
         front=0;
    rear=(rear+1)%data.length;
    data[rear]=input;

}
int deque(){
    if(isEmpty()){
        System.out.println("Q is empty");
        return -1;
    }
    int val=data[front];
    if(front==rear){
        front=rear=-1;
    }
    else
    {
        front=(front+1)%data.length;
    }
    return val;

}
int peek(){
    if(isEmpty()){
        System.out.println("Q is empty");
        return -1;
    }
    return data[front];

}
void display(){
    int t=front;
    do{
        System.out.print(data[t]+" ");
        t=(t+1)%data.length;
    }while(t!=rear);
    System.out.println(data[t]);

}
}

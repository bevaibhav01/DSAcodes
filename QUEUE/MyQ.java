import java.util.*;
public class MyQ{
    public static void main(String [] args)throws Exception{
        MultiQ q1=new MultiQ();

        int c,a;
        int t;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("press 1 for Deque ");
            System.out.println("Enter 2 to insert");
            a=sc.nextInt();
            if(a==1)
            {
                System.out.println("Enter 1 to deque in Q1");
                System.out.println("Enter 2 to deque in Q2");
                System.out.println("Enter 3 to deque in Q3");
                System.out.println("Enter 4 to deque in Q4");
                c=sc.nextInt();

                    q1.deque(c);
                    q1.display();




            }

            if(a==2){
                System.out.println("Enter the element");
                t=sc.nextInt();
                System.out.println("Enter 1 to insert in Q1");
                System.out.println("Enter 2 to insert in Q2");
                System.out.println("Enter 3 to insert in Q3");
                System.out.println("Enter 4 to insert in Q4");
                c=sc.nextInt();

                    q1.enque(t,c);


                q1.display();

                System.out.println();
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



class MultiQ{
    int [] data=new int[20];

    int front[]={0,5,10,15};
    int rear[]={-1,4,9,14};
    int limit[]={4,9,14,19};

    boolean isEmpty(int c){
        return front[c-1]>rear[c-1];
    }
    boolean isFull(int c){
        return rear[c-1]==limit[c-1];
    }
    void enque(int input,int c)throws Exception{
        try {
            if (isFull(c)) {
                throw new Exception("Queue is Full");
            }

            if (c == 1) {
                data[++rear[0]] = input;

            }
            if (c == 2) {
                data[++rear[1]] = input;

            }
            if (c == 3) {
                data[++rear[2]] = input;
            }
            if (c == 4) {
                data[++rear[3]] = input;
            }

        }
        catch(Exception e){
            System.out.println("Sorry Queue is full try again in another queue");
        }




    }
    void deque(int c) throws Exception{
        if(isEmpty(c)){
            throw new Exception("Q is Empty");
        }
      else  if(c==1){
            data[front[0]++]=0;

        }
     else   if(c==2){
            data[front[1]++]=0;

        }
     else   if(c==3){
            data[front[2]++]=0;
        }
      else  if(c==4){
            data[front[3]++]=0;
        }


    }
    void display(){
        for(int i=0;i<=19;i++){
            System.out.print(data[i]+" ");
        }


    }




}




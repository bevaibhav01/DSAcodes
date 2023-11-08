import java.util.Stack;

public class StockAndSpan {
    public static void main(String[] args) {
        int stock[]={100,80,60,70,60,85,100};
        int [] span=new int[stock.length];// 1,1,1,2,1,5,6
        span(stock,span);
        for(int i=0;i<span.length;i++)
            System.out.println(span[i]);

    }
    static void span(int [] stock,int [] span){
        span[0]=1;
        Stack<Integer> data=new Stack<>();
        data.push(0);
        for(int i=1;i<stock.length;i++){
            int cPrice=stock[i];
            while(!data.empty() && cPrice>=stock[data.peek()]){
                data.pop();
            }
            if(data.empty()){
                span[i]=i+1;
                //System.out.println(i);
                //System.out.println("irunn");
            }
            else
                span[i]=i-data.peek();
            data.push(i);


        }

    }
}

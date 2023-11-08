import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] a={6,8,0,1,3};
        int [] result=new int[a.length];
        findGreater(a,result);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");

        }

    }
    //THIS IS THE MOST IMP ALGO BECAUSE IT CAN BE ASKED IN 4 WAYS
    //1 GREATEST LEFT AND RIGHT
    //2 SMALLEST LEFT AND RIGHT
   static void findGreater(int [] a , int [] result){
        Stack<Integer> data=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!data.empty() && a[i]>=a[data.peek()]){
                  data.pop();

            }
            if(data.empty())
               result[i]=-1;
            else
                result[i]=a[data.peek()];
            data.push(i);

        }

    }
}

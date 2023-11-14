public class Queuemain {
    public static void main(String[] args) throws Exception{
        CustomQueue a=new CustomQueue(5);
        a.insert(5);
        a.insert(4);
        a.insert(3);
        a.insert(2);
        a.insert(1);
       // a.insert(0);
        a.remove();
        a.display();

    }
}

public class Insertion {
    public static void main(String[] args) {
        int []a={5,4,3,2,1};
        insertion(a);
        System.out.println(a);

    }
    static void insertion(int []arr){
        for(int i=0;i<=arr.length-1;i++){
            int key=i;
            while(key>0&&arr[key+1]<arr[key]){
                int a=arr[key];
                arr[key]=arr[key+1];
                arr[key+1]=a;
                key--;

            }
        }
    }
}

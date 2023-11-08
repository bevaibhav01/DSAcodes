import java.util.*;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************************************************");
        ArrayList<User> users=new ArrayList<>();
        while(true){
            System.out.println("Enter you name");
            String name=sc.nextLine();
            System.out.println("enter password");
            int pass=sc.nextInt();
            User.data.put(pass,name);

            break;


        }
        User list=new User();
        list.dateOfJourney="23/09/88";
        list.isConfirm=true;
        users.add(list);
        System.out.println("enter ey");
        int pass=sc.nextInt();
        System.out.println(User.data.get(pass));
        System.out.println(users.get(0).dateOfJourney);
        System.out.println(users.get(0).isConfirm);


    }
}
class User{
    static HashMap<Integer,String> data=new HashMap<>();
    String dateOfJourney;
    boolean isConfirm;


}

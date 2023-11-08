import java.util.*;

public class Dsproject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int registration=-1;
        ArrayList<Users> listOfUsers=new ArrayList<>();
        ArrayList<Bus> listOfBuses=new ArrayList<>();
        System.out.println("******************************************************************");
        System.out.println("WELCOME TO VRD BUS RESERVATIONS");
//        System.out.println("WE BOOKS TICKET FROM MUMBAI TO DELHI");
        System.out.println("******************************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        boolean m=true;
        while(m) {
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("PRESS 1 FOR ADMIN LOGIN");
            System.out.println("PRESS 2 FOR USERS SIGNUP AND NEW BOOKING");
            System.out.println("PRESS 3 FOR BUS ENQUIRY");
            System.out.println("PRESS 4 FOR BOOK THE TICKET");
            System.out.println("PRESS 5 FOR TO CHECK YOU CURRENT TICKET STATUS");
            int choice = sc.nextInt();
            if (choice == 1) {
               getBusDetails(listOfBuses);
            }
            if (choice == 2) {
                getUser(listOfUsers);

            }
            if (choice == 3) {
                Enquiry(listOfBuses);
            }
            System.out.println("PRESS 1 TO CONTINUE");
            int choice2=sc.nextInt();
            if(choice2!=1){
                m=false;
            }
        }




    }
    static void getBusDetails(ArrayList<Bus> listOfBuses){
        Scanner sc=new Scanner(System.in);

        System.out.println("ADMIN LOGIN SUCCESFULL");
        boolean test = true;
        while (test) {
            System.out.println("ENTER THE BUS DETAILS");
            System.out.println("Enter Name");
            String name = sc.next();
            System.out.println("Enter Bus code");
            int code = sc.nextInt();
            System.out.println("Enter Date of journey");
            String date = sc.next();
            System.out.println("Enter the Destination");
            String desti = sc.next();
            System.out.println("Enter Number of seats");
            int seats = sc.nextInt();
            System.out.println("Price of 1 Ticket");
            double price = sc.nextDouble();
            Bus newBus = new Bus(name, date, code, seats, price, desti);
            listOfBuses.add(newBus);
            System.out.println("IF YOU WANT TO ADD MORE BUS PLEASE ENTER 1");
            int c = sc.nextInt();
            if (c != 1) {
                test = false;
            }
        }


    }
    static void getUser(ArrayList<Users> listOfUsers){
        System.out.println("PLEASE ENTER YOUR NAME;-");
        String name = sc.nextLine();
        Users newUser = new Users(name);

        boolean test = true;
        while (test) {
            System.out.println("PLEASE ENTER USERNAME FOR YOUR ACCOUNT");
            String username = sc.next();
            if (Users.data.containsKey(username)) {
                System.out.println("SORRY USERNAME ALREADY EXIST");
            } else {
                registration++;
                System.out.println("ENTER PASSWORD");
                String password = sc.next();
                Users.data.put(username, password);
                Users.data2.put(username, registration);
                test = false;
                listOfUsers.add(newUser);
            }
        }


    }
    static void Enquiry(ArrayList<Bus> listOfBuses){
        System.out.println("WELCOME TO VRD BUS RESERVATIONS:-");
        System.out.println("CURRENTLY WE HAVE THIS MUCH BUSSES OPEN FOR BOOKINGS");

        for (int i = 0; i < listOfBuses.size(); i++) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Bus Number  " + i + 1);
            System.out.println("Bus name :-" + listOfBuses.get(i).name);
            System.out.println("Bus code :-" + listOfBuses.get(i).code);
            System.out.println("Bus date :-" + listOfBuses.get(i).date);
            System.out.println("Bus Ticket price :-" + listOfBuses.get(i).tPrice);
            System.out.println("Bus Destination :-" + listOfBuses.get(i).Destination);
            System.out.println("Seats Available " + listOfBuses.get(i).seats);
            System.out.println("--------------------------------------------------------------");


        }



    }
}
class Users{
static HashMap<String,String> data = new HashMap<>();
static HashMap<String,Integer> data2=new HashMap<>();

String name;
//String password;
int tickets;
int cnft;
int wlt;
//String dob;
    Users(String name){
        this.name=name;
    }


}

class Bus{
    static HashMap<Integer,Integer> busdata=new HashMap<>();

    String name;
    String date;
    int code;
    int seats;
    double tPrice;
    String Destination;

    LinkedListBus busTicket=new LinkedListBus();
    Bus(String name,String date,int code,int seats,double price,String Destination){
        this.name=name;
        this.date=date;
        this.code=code;
        this.seats=seats;
        this.tPrice=price;
        this.Destination=Destination;
        busTicket.insert(seats);

    }
}

class LinkedListBus{
    NodeBus head;
    NodeBus tail;
   void insert(int seats) {
       for (int i = 1; i <= seats; i++) {
           NodeBus a = new NodeBus('n');
           a.next = head;
           head = a;
           if (tail == null) {
               tail = head;
           }

       }
   }

}
class NodeBus{
    char status;
    NodeBus next;
    NodeBus(char n){
        this.status=n;
    }

}

import java.util.*;

public class Client {
    public String name;
    private String password;
    public String emailadresse;
    public String phonenumber;
    int id;

    public int checkbalance(int x){
        return x;
    }
    public void transfer(){

    }
    public void searchtransaction(){

    }
    public Client login(String name, String password, ArrayList<Client> mon) {
        Client customer = new Client();
        for (Client client : mon) {
            if (name == client.name && password == client.password) {
                customer = client;
                return customer;
            } else {
                System.out.println("Do not have an account");

            }


        }
        return customer;
    }
    public void register(){
        Scanner scan= new Scanner(System.in);
        Random random=new Random();

        System.out.println("Enter your name");
        this.name=scan.nextLine();
        System.out.println("Enter your password");
        this.password=scan.nextLine();
        System.out.println("Enter your emailaddress");
        this.emailadresse=scan.nextLine();
        System.out.println("Enter your phonenumber");
        this.phonenumber=scan.nextLine();
        this.id= random.nextInt(1000); //gives the code randomly

    }
    public void openaccount(String name,String customername){
      Account account= new Account();

    }
    @Override
    public String toString(){
        return "Name: " + name + ", Email: " + emailadresse;

    }
}

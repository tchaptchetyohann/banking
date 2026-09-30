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
            if (name.equals(client.name) && password.equals(client.password) ) {
                customer = client;
                System.out.println("\n Login successfull");

                return customer;
            }




        }
        System.out.println("Do not have an account");
        return null;
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
    public Account openaccount(String name,String customername){
      Account account = new Account();
      account.balance=0;
      account.owner=customername;
      account.nameaccount=name;
      account.status="Active";
      System.out.println(name+" Account has been created");
      return account;
    }
    public void viewaccount(String name,ArrayList<Account>accounts){
       for(Account account:accounts){
           if(account.owner.equals(name)){
               System.out.println(account);
           }
           else{
               System.out.println("Do not have an active account ");
           }
       }
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Email: " + emailadresse;

    }
}

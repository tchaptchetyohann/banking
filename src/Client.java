import java.util.*;

public class Client {
    public String name;
    private String password;
    public String emailadresse;
    public String phonenumber;

    public int checkbalance(int x){
        return x;
    }
    public void transfer(){

    }
    public void searchtransaction(){

    }
    public void login(){
        System.out.println("Enter your name");
        this.name=scan.nextLine();
        System.out.println("Enter your password");
        this.password=scan.nextLine();

    }
    public void register(){
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your name");
        this.name=scan.nextLine();
        System.out.println("Enter your password");
        this.password=scan.nextLine();
        System.out.println("Enter your emailaddress");
        this.emailadresse=scan.nextLine();
        System.out.println("Enter your phonenumber");
        this.phonenumber=scan.nextLine();

    }
}

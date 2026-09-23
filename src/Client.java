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

    }
    public void register(){
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your name");
        this.name=scan.nextLine();
        this.password=scan.nextLine();
        this.emailadresse=scan.nextLine();
        this.phonenumber=scan.nextLine();

    }
}

import java.util.*;
import java.time.LocalDate;

public class Client {
    public String name;
    private String password;
    public String emailadresse;
    public String phonenumber;
    int id;
    Scanner scan= new Scanner(System.in);

    public int checkbalance(int x){
        return x;
    }

    public Transactions maketransaction(String initiator,Account account){
        Transactions transaction= new Transactions();
        System.out.print("Enter the compapnies name: ");
        scan.nextLine();
        String name=scan.nextLine();
        System.out.println("Enter the amount of transaction");
        double amount=scan.nextDouble();
        LocalDate dates = LocalDate.now();
        double difference= account.getBalance()-amount;
        if(difference<=0){
            System.out.println("There no Sufficient funds");
            return null;
        }
        else{
            account.setBalance(difference);
            transaction.name=name;
            transaction.amount=amount;
            transaction.initiator=initiator;
            transaction.date=dates;
            account.banktransactions.add(transaction);
            return transaction;
        }


    }
    public void viewtransaction(String name, ArrayList<Transactions> list){


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
      account.setBalance(0);
      account.owner=customername;
      account.nameaccount=name;
      account.status="Active";
      System.out.println(name+" Account has been created");
      return account;
    }
    public Account updatebankaccount(String name, ArrayList<Account> accounts){
        String new_name;
        Account acc=new Account();
        Scanner scan = new Scanner(System.in);
        for(Account account:accounts){
            if(name.equals(account.owner)){
                System.out.println("Enter the new account type");
                new_name=scan.nextLine();
                account.nameaccount=new_name;
                acc=account;
            }
            System.out.println(acc);
        }
        return acc;
    }
    public Client updateaccount(String name,ArrayList<Client> clients){
        Scanner scan= new Scanner(System.in);
        Client update_clien = new Client();
        int x=0;
        for(Client client:clients){
            if(name.equals(client.name)){
                System.out.println(client);
                System.out.println("What information do you want to update (name,password,emailadresse,phone number)");
                String update_value= scan.nextLine();
               do{ if(update_value.equals("name")){
                    System.out.println("Please enter the new name");
                    String new_name=scan.nextLine();
                    client.name=new_name;
                   update_clien=client;
                }
                else if(update_value.equals("password")){
                    System.out.println("Please enter the new name");
                    String new_password =scan.nextLine();

                    client.password=new_password;
                   update_clien=client;
                }
                else if(update_value.equals("email")){
                    System.out.println("Please enter the email");
                    String email =scan.nextLine();
                    client.emailadresse=email;
                   update_clien=client;
                }
                else if(update_value.equals("phone number")){
                    System.out.println("Please enter the phone number");
                    String phone =scan.nextLine();

                    client.emailadresse=phone;
                   update_clien=client;
                }
                else{
                    System.out.println("Please enter a valid entry ");
                     x=1;
                }
            }while(x==1);
                System.out.println("Account updated");


            }
            else{
                System.out.println("No account found");

            }

        }
        return update_clien;

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
    public void depositfunds(String name,ArrayList<Account>accounts,double amount){
        for(Account account:accounts){
            if(account.owner.equals(name)){
                account.updatebalance(amount);

                System.out.println("Funds deposited successfully");

                account.getBalance();
            }
            else{
                System.out.println("Do not have an active account ");
            }
        }
    }

    @Override
    public String toString(){
        return "Name: " + name + "\n Email: " + emailadresse;

    }
}

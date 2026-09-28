import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner scan= new Scanner(System.in);
    String name;
    String password;
    ArrayList<Client>clients=new ArrayList<>();
    int selection;
System.out.println("---------------------------------Banking APP---------------------------------");
System.out.println("\n--------------------------- WELCOME TO BANKING APP-------------------------- \n********************************************************************************** \n----------------------PLEASE MAKE YOUR SELECTION BELOW-------------------------- ");
System.out.println("\n\t 1. LOGIN\n\t 2.REGISTER");

System.out.print("ENTER THE SELECTED OPTION:_ ");
selection= scan.nextInt();
    Client person1= new Client();
if(selection==2){

    person1.register();
    clients.add(person1);
    System.out.println("Customer Registered");
    for(Client client:clients){
        // this for loop is to print all the client registered in bank
        System.out.println(client);
    }

}
System.out.println("now you can login");

    System.out.println("Enter your name");
    name=scan.nextLine();
    System.out.println("Enter your password");
    password=scan.nextLine();

    person1.login(name,password,clients);

}

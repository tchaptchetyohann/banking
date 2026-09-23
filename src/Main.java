import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner scan= new Scanner(System.in);
    ArrayList<Client>clients=new ArrayList<>();
    int selection;
System.out.println("---------------------------------Banking APP---------------------------------");
System.out.println("\n--------------------------- WELCOME TO BANKING APP-------------------------- \n********************************************************************************** \n----------------------PLEASE MAKE YOUR SELECTION BELOW-------------------------- ");
System.out.println("\n\t 1. LOGIN\n\t 2.REGISTER");

System.out.print("ENTER THE SELECTED OPTION:_ ");
selection= scan.nextInt();
if(selection==2){
    Client person1= new Client();
    person1.register();
    clients.add(person1);
    System.out.println("Customer Registered");
    for(Client client:clients){
        System.out.println(client.name);
    }


}


}

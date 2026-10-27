import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner scan = new Scanner(System.in);


    Client user = new Client();
    String name = "";
    String password;
    boolean back = false;
    boolean loginmenu = false;
    int menuSelection;
    ArrayList<Client> clients = new ArrayList<>();
    ArrayList<Account> accounts = new ArrayList<>();
    String accountname = "";
    Transactions transaction=new Transactions();

    do {
        int selection;
        System.out.println("---------------------------------Banking APP---------------------------------");
        System.out.println("\n--------------------------- WELCOME TO BANKING APP-------------------------- \n********************************************************************************** \n----------------------PLEASE MAKE YOUR SELECTION BELOW-------------------------- ");
        System.out.println("\n\t 1. LOGIN\n\t 2.REGISTER");

        System.out.print("ENTER THE SELECTED OPTION:_ ");
        selection = scan.nextInt();
        scan.nextLine(); // Consume the leftover newline


        Client person1 = new Client();
        if (selection == 2) {

            person1.register();
            clients.add(person1);
            System.out.println("Customer Registered");
            for (Client client : clients) {
                // this for loop is to print all the client registered in bank
                System.out.println(client);
            }

        }
        System.out.println("now you can login\n");

        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Enter your password");
        password = scan.nextLine();

        user = person1.login(name, password, clients);

        System.out.println("Welcome " + user.name );
        do {
            System.out.println("***********/////  Menu ////************");

            System.out.println("\n\t1. View details of account \n\t2. Deposite funds \n\t3. Change account type \n\t4. Change personal infomation \n\t5.Open new account \n\t6. Make a transaction \n\t7. View transactions \n\t8. Logout");

            System.out.print("Please Enter you selection with the right number: ");

            menuSelection = scan.nextInt();

            switch (menuSelection) {
                case 1:
                    System.out.println("account");

                    user.viewaccount(user.name,accounts);
                    break;
                case 2:
                    System.out.println("Deposit funds");
                    System.out.println("Enter the desire value you want to deposit");
                    int x =scan.nextInt();
                    user.depositfunds(user.name,accounts,x);
                    break;
                case 3:
                    System.out.println("Update Bank type");
                    user.updatebankaccount(user.name,accounts);
                    break;
                case 4:

                    user.updateaccount(user.name,clients);
                    break;

                case 5:
                    System.out.println("Enter the name of the account");
                    scan.nextLine();
                    accountname = scan.nextLine();

                  accounts.add(user.openaccount(accountname, user.name));
                    break;

                case 6:
                    if(accountname.isEmpty()){
                        System.out.println("Account list is empty you need to open an account");
                    }
                    else{
                        for(Account account:accounts){
                            if(account.owner.equals(user.name) ){
                                transaction= user.maketransaction(user.name, account);
                                if(transaction !=null ){
                                    account.banktransactions.add(transaction);
                                }

                            }
                            else{
                                System.out.println("Do not have a valid account");

                            }
                        }
                    }

                    break;
                case 7:
                    for(Account account:accounts){
                        account.showTransactions(account.banktransactions);
                    }
                    
                    break;
                case 8:
                    loginmenu=true;
                    break;



            }
            System.out.println("Would like to go back to the menu");

            System.out.println("1-YES      2- NO");

            System.out.print("Enter here: ");
            int x = scan.nextInt();
            if (x == 1) {
                back = true;
            } else {
                back = false;
            }
        }
        while (back);
    }

        while (!loginmenu);
    }

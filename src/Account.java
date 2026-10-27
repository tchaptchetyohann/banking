import java.util.*;

public class Account {
    String nameaccount;
    private double balance;
    String status;
    String owner;
    ArrayList<Transactions> banktransactions=new ArrayList<>();

    public void showTransactions(ArrayList<Transactions> lists){

    for(Transactions list : lists){
        System.out.println(list);
    }
    }
    public void addTransactions(Transactions transaction){
this.banktransactions.add(transaction);
    }

    public void setBalance(double balance) {

       while(balance <0.0)
       { System.out.println("Enter a valid amount");}
        this.balance =+balance;
    }
    public void updatebalance(double x){
        this.balance+=x;
    }
    public double getBalance(){
      //  System.out.println("The balance your "+nameaccount+" is "+balance);
        return balance;
    }


    @Override
    public String toString(){
      return "\nName account:" + nameaccount + "\nBalance: "+ balance +"\nStatus: "+status+"\n Owner:"+owner;
    }

}


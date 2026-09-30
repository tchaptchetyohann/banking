import java.util.*;

public class Account {
    String nameaccount;
    int balance;
    String status;
    String owner;

    public String toString(){
      return "\nName account:" + nameaccount + "\nBalance: "+ balance +"\nStatus: "+status+"\n Owner:"+owner;
    }
}

import java.time.LocalDate;

public class Transactions {
    String name;
    double amount;
    LocalDate date;
    String initiator;
    @Override
    public String toString(){
        return "Transaction name: "+name+ "\t Amount: $"+amount+ "\t Date: "+date;
    }

}

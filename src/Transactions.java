import java.time.LocalDate;

public class Transactions {
    String name;
    double amount;
    LocalDate date;
    String initiator;
    @Override
    public String toString(){
        return "transaction name: "+name+ "\t Amount: $"+amount+ "\t Date: "+date;
    }

}

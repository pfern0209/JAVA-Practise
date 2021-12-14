import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String nameOfCustomer,double initialTransaction){
        this.name=nameOfCustomer;
        this.transactions=new ArrayList<Double>();
        this.transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }
}
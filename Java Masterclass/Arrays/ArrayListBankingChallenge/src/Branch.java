import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String nameOfBranch){
        this.name = nameOfBranch;
        this.customers=new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction){
        Customer customer=new Customer(nameOfCustomer, initialTransaction);
        if(findCustomer(customer.getName())==null){
            this.customers.add(customer);

            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction){
        Customer customer=findCustomer(nameOfCustomer);
        if(customer==null){

            return false;
        }else{
            customer.addTransaction(transaction);

            return true;
        }
    }

    private Customer findCustomer(String nameOfCustomer){
        for(int i=0;i<this.customers.size();i++){
            Customer customer=this.customers.get(i);
            if(customer.getName().equals(nameOfCustomer)){
                return this.customers.get(i);
            }
        }return null;
    }
}

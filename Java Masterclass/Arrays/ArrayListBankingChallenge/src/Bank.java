

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String nameOfBank){
        this.name=nameOfBank;
        this.branches=new ArrayList<Branch>();
    }

    public boolean addBranch(String nameOfBranch){
        Branch branch=findBranch(nameOfBranch);
        if(branch==null){
            Branch newBranch=new Branch(nameOfBranch);
            this.branches.add(newBranch);

            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction){
//        Customer customer=new Customer(nameOfCustomer,initialTransaction);
        Branch branch=findBranch(nameOfBranch);
        if(branch!=null){
            if(branch.newCustomer(nameOfCustomer,initialTransaction)){

                return true;
            }
        }return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction){
        Branch branch=findBranch(nameOfBranch);

        if(branch!=null ){

            return branch.addCustomerTransaction(nameOfCustomer, transaction);
        }
        return false;
    }

    private Branch findBranch(String nameOfBranch){
        Branch testBranch=new Branch(nameOfBranch);
        for(int i=0;i<branches.size();i++){
            Branch branch=branches.get(i);
            if(branch.getName().equals(nameOfBranch)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String nameOfBranch,boolean printTransactions){
//        Branch branch=findBranch(nameOfBranch);
//        if(branch==null){
//            return false;
//        }else{
//            System.out.println("Customer details for branch "+branch.getName());
//            if(printTransactions){
//                for(int i=0;i<this.branches.size();i++){
//                    System.out.println("Customer: "+branch.getCustomers().get(i).getName()+"["+(i+1)+"]");
//                    System.out.println("Transactions");
//                    for(int j=0;j<branch.getCustomers().get(j).getTransactions().size();j++){
//                        System.out.println("["+(j+1)+"]  Amount "+branch.getCustomers().get(j).getTransactions().get(j));
//                    }
//                }return true;
//            }else{
//                for(int i=0;i<this.branches.size();i++) {
//                    System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
//                }
//                return true;
//            }
//        }
        Branch branch = findBranch(nameOfBranch);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }

    }
}

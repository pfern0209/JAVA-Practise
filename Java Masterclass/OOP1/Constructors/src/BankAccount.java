public class BankAccount {
    private long accountNumber;
    private long balance=0L;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void setAccountNumber(String accountNumber){
        if(accountNumber.isEmpty()){
            System.out.println("Account number is mandatory");
        }else{
            this.accountNumber=Long.parseLong(accountNumber);
            System.out.println("Account number has been initialized");
        }
    }

    public void setPhoneNumber(String phoneNumber){
        if(phoneNumber.isEmpty()){
            System.out.println("Phone number is mandatory");
        }else{
            this.phoneNumber=Long.parseLong(phoneNumber);
            System.out.println("Phone number has been set");
        }

    }

    public void setCustomerName(String customerName){
        if(customerName.isEmpty()){
            System.out.println("Customer name is mandatory");
        }else{
            this.customerName=customerName;
            System.out.println("Customer name has been set");
        }

    }

    public void setEmail(String email){
        String valid=email.toLowerCase();
        if(valid.isEmpty()){
            System.out.println("Email is mandatory");
        }else{
            this.email=email;
            System.out.println("Email has been set");
        }
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public long getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getCustomerEmail(){
        return this.email;
    }

    public long getBalance(){
        return this.balance;
    }

    public void depositFunds(long amount){
        if(amount<=0){
            System.out.println("Minimum amount for entry is 1");
        }else{
            this.balance+=amount;
            System.out.println("Amount successfully deposited");
        }
    }

    public void withdrawFunds(long amount){
        if(amount<=0){
            System.out.println("Minimum amount for withdraw is 1");
        }else{
            if(amount<=this.balance){
                this.balance-=amount;
                System.out.println("Amount successfully debited");
            }else{
                System.out.println("Insufficient Funds for this transaction");
            }
        }
    }

    //Constructor

    public BankAccount(long accountNumber,String name,String email,long phoneNumber){
        System.out.println("Constructor with parameter");
        this.accountNumber=accountNumber;
        this.phoneNumber=phoneNumber;
        this.customerName=name;
        this.email=email;
    }

    public BankAccount(){
        this(0L,"NA","NA",0);//calling of constructor must always be on first line
        System.out.println("Empty Constructor");

    }
}

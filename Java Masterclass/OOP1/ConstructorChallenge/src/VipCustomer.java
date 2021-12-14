public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;
    private double bonus;
    public VipCustomer(String name,double creditLimit, String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }

    public VipCustomer(){
//        this.name="John Hancock";
//        this.creditLimit=5000;
//        this.emailAddress="test@email.com";
        this("John Hancock",5000,"test@email.com");
    }

    public VipCustomer(String name,double creditLimit ){
        this(name,creditLimit,"test@email.com");
    }
    public VipCustomer(String name,double creditLimit, String emailAddress,double bonus){
        this(name,creditLimit,emailAddress);
        this.bonus=bonus;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getBonus() {
        return bonus;
    }
}

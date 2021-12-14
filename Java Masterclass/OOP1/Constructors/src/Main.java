public class Main {
    public static void main(String[] args) {
//        BankAccount preston=new BankAccount();
//        preston.setAccountNumber("123456789");
//        preston.setCustomerName("Preston Fernandes");
//        preston.setEmail("fernzie2k@gmail.com");
//        preston.setPhoneNumber("444555666");
//        System.out.println("Account number is: "+preston.getAccountNumber());
//        System.out.println("Phone number is: "+preston.getPhoneNumber());
//        System.out.println("Customer name is: "+preston.getCustomerName());
//        System.out.println("Email address is: "+preston.getCustomerEmail());
//        preston.depositFunds(37850);
//        System.out.println("The balance is: "+preston.getBalance());
//        preston.withdrawFunds(37800);
//        System.out.println("The balance is: "+preston.getBalance());
//        preston.withdrawFunds(100);
//        System.out.println("The balance is: "+preston.getBalance());

        //Constructor
        BankAccount peter = new BankAccount(852147963L, "Peter Fernandes", "hello@email.com", 9869455972L);
        System.out.println("Account number is: " + peter.getAccountNumber());
        System.out.println("Phone number is: " + peter.getPhoneNumber());
        System.out.println("Customer name is: " + peter.getCustomerName());
        System.out.println("Email address is: " + peter.getCustomerEmail());

        BankAccount preston = new BankAccount();
        System.out.println("Account number is: " + preston.getAccountNumber());
        System.out.println("Phone number is: " + preston.getPhoneNumber());
        System.out.println("Customer name is: " + preston.getCustomerName());
        System.out.println("Email address is: " + preston.getCustomerEmail());
    }
}

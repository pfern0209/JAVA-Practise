import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    private static MobilePhone mobilePhone=new MobilePhone("147852369");


    public static void main(String[] args) {
        printInstructions();
        boolean quit=false;
        while(!quit){

            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    printInstructions();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    mobilePhone.printContacts();
                    break;
                case 7:
                    quit=true;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }

    public static void printInstructions(){
        System.out.println("1: Print Instructions");
        System.out.println("2: Add Contact");
        System.out.println("3: Update Contact");
        System.out.println("4: Remove Contact");
        System.out.println("5: Search Contact");
        System.out.println("6: Print Contacts");
        System.out.println("7: Quit");
    }

    public static void addNewContact(){
        System.out.println("Enter Contact Name");
        String name=sc.nextLine();
        System.out.println("Enter Contact Number");
        String number=sc.nextLine();
        Contact contact=Contact.createContact(name,number);
        if(mobilePhone.addNewContact(contact)){
            System.out.println("Contact added successfully");
        }else{
            System.out.println("Contact exists");
        }
    }

    public static void updateContact(){
        System.out.println("Enter old Contact name");
        String oldName=sc.nextLine();
        Contact oldContact=mobilePhone.queryContact(oldName);
        System.out.println("Enter new Contact name");
        String newName=sc.nextLine();
        System.out.println("Enter new Contact number");
        String newNumber=sc.nextLine();
        Contact newContact=Contact.createContact(newName,newNumber);
        mobilePhone.updateContact(oldContact,newContact);
    }

    public static void removeContact(){
        System.out.println("Enter name of Contact to be removed");
        String name=sc.nextLine();
        Contact contact=mobilePhone.queryContact(name);
        if(contact==null){
            System.out.println("Not found");
        }
        if(mobilePhone.removeContact(contact)){
            System.out.println("Removed successfully");
        }else{
            System.out.println("Removal not successful");
        }
    }

    public static void searchContact(){
        System.out.println("Enter Contact name");
        String name=sc.nextLine();
        Contact contact=mobilePhone.queryContact(name);
        if(contact==null){
            System.out.println("Not found");
        }else{
            System.out.println(contact.getName()+" -> "+contact.getPhoneNumber());
        }
    }

}

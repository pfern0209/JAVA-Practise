import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        this.myContacts=new ArrayList<Contact>();// Did not typer this.myContacts= gave null pointer exception
    }

    private int findContact(Contact contact){
        int position=this.myContacts.indexOf(contact);
        if(position>=0){
            System.out.println(position);
            return position;
        }
        return -1;
    }

    private int findContact(String name){
        for(int i=0;i<this.myContacts.size();i++){
            Contact contact=this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            //System.out.println("Contact already exists");
            return false;
        }
        this.myContacts.add(contact);
        //System.out.println("Contact added");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position=findContact(oldContact);
        if(findContact(oldContact)<0){
            System.out.println("Contact not found");
            return false;
        }else if(findContact(newContact.getName())!=-1){
            System.out.println("The new Contact name already exists");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println("Contact successfully updated");
        return true;
    }

    public boolean removeContact(Contact contact){
        int position=myContacts.indexOf(contact);
        if(position<0){
            System.out.println("Contact does not exist");
            return false;
        }else{
            this.myContacts.remove(position);
            System.out.println("Contact removed");
            return true;
        }
    }

    public Contact queryContact(String name){
        int position=findContact(name);
        if(position<0){
            return null;
        }else{
            return this.myContacts.get(position);
        }
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i=0;i<myContacts.size();i++){
            System.out.println((i+1)+". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getPhoneNumber());
        }
    }
}

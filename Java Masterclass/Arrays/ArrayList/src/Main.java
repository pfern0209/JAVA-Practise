import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList();

    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit){
            System.out.println("Enter a choice");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    modifyList();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArray();
                    break;
                case 7:
                    quit=true;
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
    public static void printInstructions(){
        System.out.println("0: Print Instructions");
        System.out.println("1: Print List");
        System.out.println("2: Add Item");
        System.out.println("3: Remove Item");
        System.out.println("4: Modify List");
        System.out.println("5: Search Item in the list");
        System.out.println("6: Process Array");
    }

    public static void printList(){
        System.out.println("The Items in the list are");
        groceryList.printGroceryList();
    }

    public static void addItem(){
        System.out.println("Enter Item to be added in the list");
        String item=sc.nextLine();
        groceryList.addGroceryItem(item);
    }

    public static void removeItem(){
        printList();
        System.out.println("Enter name of item to be removed");
        String name=sc.nextLine();
        groceryList.removeGroceryItem(name);
    }

    public static void modifyList(){
        printList();
        System.out.println("Enter item to be replaced");
        String item=sc.nextLine();
        System.out.println("Enter new Item");
        String newItem=sc.nextLine();

        groceryList.modifyGroceryList(item,newItem);
    }

    public static void searchItem(){
        System.out.println("Enter item to be searched");
        String item=sc.nextLine();
        groceryList.findItem(item);
    }

    public static void processArray(){
        String[] newArray=new String[groceryList.getGroceryList().size()];
        groceryList.getGroceryList().toArray(newArray);
        System.out.println(Arrays.toString(newArray));
    }
}

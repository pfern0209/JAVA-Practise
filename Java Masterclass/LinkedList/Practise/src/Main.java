import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<String>();
        addInOrder(placesToVisit,"Mumbai");
        addInOrder(placesToVisit,"Chennai");
        addInOrder(placesToVisit,"Aurangabad");
        addInOrder(placesToVisit,"Hyderabad");
        addInOrder(placesToVisit,"Agra");
        printList(placesToVisit);
        visitCities(placesToVisit);
    }

    private static void printList(LinkedList linkedList){
        Iterator<String> iterator=linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println("Now Visiting: "+iterator.next());
        }
        System.out.println("======================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> listIterator=linkedList.listIterator();
        while(listIterator.hasNext()){
            int comparison=listIterator.next().compareTo(newCity);

            if(comparison==0){
                System.out.println(newCity+" already exists");
                return false;
            }else if(comparison>0){
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            }else if(comparison<0){
            }
        }
        listIterator.add(newCity);
        return true;
    }

    private static void printMenu(){
        System.out.println("0: Quit\n1: Next City\n2: Previous City\n3: Print Menu");
    }

    private static void visitCities(LinkedList<String> cities){
        Scanner sc=new Scanner(System.in);
        boolean goingForward=true;
        boolean quit=false;
        ListIterator<String> stringListIterator=cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("Nothing to visit");
            return;
        }else{
            System.out.println("Now visiting: "+stringListIterator.next());
            printMenu();
        }

        while(!quit){
            int action=sc.nextInt();
            sc.nextLine();
            switch(action){
                case 0:
                    System.out.println("Vacation over");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){
                        if(stringListIterator.hasNext()){
                            stringListIterator.next();
                        }
                        goingForward=true;
                    }
                    if(stringListIterator.hasNext()){
                        System.out.println("Now Visiting: "+stringListIterator.next());
                    }else{
                        System.out.println("You are at end of the list");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(stringListIterator.hasPrevious()){
                            stringListIterator.previous();
                        }
                        goingForward=false;
                    }
                    if(stringListIterator.hasPrevious()){
                        System.out.println("Now Visiting: "+stringListIterator.previous());
                    }else{
                        System.out.println("You are at beginning of the list");
                        goingForward=true;
                    }
                    break;
                case 3:
                    printMenu();

            }
        }
    }
}

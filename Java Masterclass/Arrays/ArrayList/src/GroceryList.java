import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList=new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        for(int i=0;i< groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public void modifyGroceryList(String oldItem,String newItem){
        int position=findItem(oldItem);
        modifyGroceryList(position,newItem);
    }

    private void modifyGroceryList(int position,String item){
        groceryList.set(position,item);
        System.out.println((position+1)+". modified to: "+item);
    }

    public void removeGroceryItem(String item){
        int position=findItem(item);
        removeGroceryItem(position);
    }

    private void removeGroceryItem(int position){
        System.out.println(groceryList.get(position)+" removed");
        groceryList.remove(position);
    }

    public int findItem(String searchItem){
//        groceryList.contains(searchItem);
//        String item=searchItem.toLowerCase();
        int position=groceryList.indexOf(searchItem);
//        if(position==-1){
//            System.out.println("Item does not exist");
//        }else{
//            System.out.println(groceryList.get(position)+" exists");
//        }
        if(position>0) {
            return position;
        }
        else{
            return -1;
        }
    }
}

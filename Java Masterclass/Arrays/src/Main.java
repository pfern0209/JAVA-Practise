public class Main {
    public static void main(String[] args) {
        int[] myIntArray=new int[5];
        for(int i=0;i<myIntArray.length;i++){
            myIntArray[i]=i+1;
        }

        printArray(myIntArray);

    }

    public static void printArray(int[] array){
        for(int i=0;i<=array.length;i++){
            System.out.println("Position "+i+" has value "+array[i]+" stored");
        }
    }
}

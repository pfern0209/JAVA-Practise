import java.util.*;

public class SortedArray {

    public static int[] getIntegers(int size){
        Scanner sc=new Scanner(System.in);
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] newArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j< array.length-1;j++){
                if(newArray[j]>newArray[j+1]){
                    int temp=newArray[j+1];
                    newArray[j+1]=newArray[j];
                    newArray[j]=temp;
                }
            }
        }return newArray;
//        boolean flag=true; For Descending
//        while(flag){
//            flag=false;
//            for(int j=0;j< array.length-1;j++){
//                if(newArray[j]<newArray[j+1]){
//                    int temp=newArray[j+1];
//                    newArray[j+1]=newArray[j];
//                    newArray[j]=temp;
//                    flag=true;
//                }
//            }
//        }return newArray;
    }

}

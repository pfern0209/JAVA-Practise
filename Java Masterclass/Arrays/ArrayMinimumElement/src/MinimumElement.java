import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        sc.nextLine();
        return size;
    }

    private static int[] readElements(int numberOfElements){
        Scanner scanner=new Scanner(System.in);
        int[] arrayInput=new int[numberOfElements];
        int i=0;
        while(i<numberOfElements){

            arrayInput[i]=scanner.nextInt();
            i++;
        }
        return arrayInput;
    }

    private static int findMin(int[] array){
        int minimum=array[0];
        for(int i=0;i<array.length-1;i++){

            if(array[i+1]<minimum){
                minimum=array[i+1];
            }
        }return minimum;
    }

    public static void main(String[] args) {
        int size=readInteger();
        int array[]=readElements(size);
        int min=findMin(array);
        System.out.println(min);
    }
}

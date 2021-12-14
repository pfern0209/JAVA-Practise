import java.util.Scanner;

public class SearchAndSort {
//    public static int binarySearch(){
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int[] arr=new int[size];
//        for(int i=0;i<size;i++){
//            arr[i]=sc.nextInt();
//        }
//        int target=sc.nextInt();
//        int start=0;
//        int end=arr.length-1;
//        int mid=(start+end)/2;
//        while(mid>=start){
//            if(arr[mid]==target){
//                return mid;
//            }
//            if(target<arr[mid]){
////               start=0;
//                end=mid-1;
//                mid=(start+end)/2;
//            }
//            if(target>arr[mid]){
//                start=mid+1;
////                end=end;
//                mid=(start+end)/2;
//            }
//        }
//
//        return -1;
//    }

    public static int[] arrayInput(){
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=1;

        while(end>=start){
            mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }

    public static int[] selectionSort(int[] arr){
        int temp;
        int minimumPosition;
        for(int i=0;i<arr.length-1;i++){
            minimumPosition=minimum(arr,i);
            if(minimumPosition==i){
                continue;
            }
            temp=arr[i];
            arr[i]=arr[minimumPosition];
            arr[minimumPosition]=temp;
        }
        return arr;
    }

    public static int minimum(int[] arr,int start){
        int minimum=arr[start];
        int minimumPosition=start;
        for(int i=start+1;i<arr.length;i++){
            if(minimum>arr[i]){
                minimum=arr[i];
                minimumPosition=i;
            }
        }
        return minimumPosition;
    }
}

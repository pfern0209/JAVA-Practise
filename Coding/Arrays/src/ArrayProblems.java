import java.util.Scanner;

public class ArrayProblems {
    public static int[] arrayInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void largest(int[] arr) {
        int length = arr.length;
        int largest = arr[0];
        for (int i = 0; i < length - 1; i++) {
            if (largest <= arr[i + 1]) {
                largest = arr[i + 1];
            }
        }
        System.out.println(largest);
    }

    public static int linearSearch(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    public static int[] arrangeNumbers(int n) {
        int arr[] = new int[n];
        int number = 1;
        int leftIndex = 0;
        int rightIndex = n - 1;
        int count = 1;

        while (count <= n) {
            if (number % 2 != 0) {
                arr[leftIndex] = number;
                number++;
                leftIndex++;
            } else {
                arr[rightIndex] = number;
                number++;
                rightIndex--;
            }
            count++;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printPairs(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            for (int j = (i + 1); j < arr.length; j++) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
            i++;
        }
    }

    public static int[] swapAlternate(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 > arr.length - 1) {
                break;
            }
            if (i % 2 != 0) {
                continue;
            }
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

//    public static int findUnique(int[] arr){
//        int count;
//        for(int i=0;i<arr.length;i++){
//            count=0;
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//                if(count>1){
//                    break;
//                }
//            }
//            if(count==1){
//                return arr[i];
//            }
//        }
//        return -1;
//    }

    public static int findUnique(int[] arr) {
        boolean isUnique;
        for (int i = 0; i < arr.length; i++) {
            isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (j == i) {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int findDuplicate(int[] arr) {
//        boolean isDuplicate;
        for (int i = 0; i < arr.length; i++) {
//            isDuplicate=false;
            for (int j = 0; j < arr.length; j++) {
                if (j == i) {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }

        }
        return -1;
    }

//    public static void arrayIntersection(int[] arr1,int[] arr2){
//        int smallerArray=(arr1.length<arr2.length)?arr1.length:arr2.length;
//        int[] positions=new int[smallerArray];
//        int iterator=0;
//
//        for(int i=1;i<=arr1.length;i++){
//            int position;
//            for(int j=1;j<=arr2.length;j++){
//                if(arr1[i-1]==arr2[j-1]){
//                    position=j;
//                    if(linearSearch(positions,position)!=-1){
//                        continue;
//                    }
//                    positions[iterator]=j;
//                    iterator++;
//                    System.out.print(arr1[i-1]+"\t");
//                    break;
//                }
//            }
//        }
//    }

    public static void arrayIntersection(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.print(arr2[j]+"\t");
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static int pairSum(int[] arr, int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }

    public static int tripleSum(int[] arr, int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int[] sort01(int [] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==0){
                    break;
                }else if(arr[i]==1 && arr[j]==0){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        return arr;
    }

    public static int[] sortZeroesAndOne(int[] arr){
        int nextZero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                nextZero++;
            }
        }return arr;
    }

}

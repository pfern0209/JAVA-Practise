public class Main {
    public static void main(String[] args) {
//        int arr[]=ArrayProblems.arrayInput();
//        ArrayProblems.largest(arr);
//        int position=ArrayProblems.linearSearch(arr,7);
//        System.out.println(position);
//        ArrayProblems.printArray(ArrayProblems.arrangeNumbers(3));
//        ArrayProblems.printPairs(arr);
//        int[] swappedArray=ArrayProblems.swapAlternate(arr);
//        int unique=ArrayProblems.findUnique(arr);
//        int duplicate=ArrayProblems.findDuplicate(arr);
//        int[] arr1=ArrayProblems.arrayInput();
//        int[] arr2=ArrayProblems.arrayInput();
//        ArrayProblems.arrayIntersection(arr1,arr2);
//        int count=ArrayProblems.tripleSum(arr,10);
//        System.out.println(count);
//        ArrayProblems.printArray(ArrayProblems.sort01(arr));
        int[] arr=ArrayProblems.arrayInput();
        int[] sorted01=ArrayProblems.sortZeroesAndOne(arr);
        ArrayProblems.printArray(sorted01);


    }
}

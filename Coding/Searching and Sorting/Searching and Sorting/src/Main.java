public class Main {
    public static void main(String[] args) {
//        int index=SearchAndSort.binarySearch(arr,9);
//        System.out.println(index);
        int[] arr=SearchAndSort.arrayInput();
        int[] sortedArray=SearchAndSort.selectionSort(arr);
        SearchAndSort.printArray(sortedArray);
    }
}

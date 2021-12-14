public class Main {
    public static void main(String[] args) {
        int[] myArray=SortedArray.getIntegers(5);
        SortedArray.printArray(myArray);
        int[] sortedArray=SortedArray.sortIntegers(myArray);
        SortedArray.printArray(sortedArray);
    }
}

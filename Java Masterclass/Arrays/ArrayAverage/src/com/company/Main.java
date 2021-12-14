package com.company;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray=array(5);
        printArray(myIntArray);
        double average=getAverage(myIntArray);
        System.out.println(average);

    }

    public static int[] array(int number){
        int[] values=new int[number];
        System.out.println("Enter "+number+" integer values\r");
        for(int i=0;i<number;i++){
            System.out.println("Enter value: "+i );
            values[i]=sc.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element at position "+i+" is: "+array[i]);
        }
        System.out.println(array.length);
    }

    public static double getAverage(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double)sum/(double)array.length;
    }
}

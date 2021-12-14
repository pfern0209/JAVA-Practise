package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        int[] anotherArray = myArray;

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));

        modifyArray(myArray);
        anotherArray= new int[] {1,3,5,6,7};

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));

        myArray[1]=7;
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[0]=2;
        array=new int[] {1,2,3,4,5};
        array[4]=9;
    }

}
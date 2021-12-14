package com.company;

public class Main {

    public static void main(String[] args) {
        int minIntValue=Integer.MIN_VALUE;
        int maxIntValue=Integer.MAX_VALUE;
        System.out.println("Minimum Integer Value: "+minIntValue);
        System.out.println("Maximum Integer Value: "+maxIntValue);
        System.out.println("Busted minimum value: "+(minIntValue-1));//underflow
        System.out.println("Busted maximum value: "+(maxIntValue+1));//overflow

        byte minByteValue=Byte.MIN_VALUE;
        byte maxByteValue=Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value: "+minByteValue);
        System.out.println("Maximum Byte Value: "+maxByteValue);

        short minShortValue=Short.MIN_VALUE;
        short maxShortValue=Short.MAX_VALUE;
        System.out.println("Minimum Short Value: "+minShortValue);
        System.out.println("Maximum Short Value: "+maxShortValue);

        long minLongValue=Long.MIN_VALUE;
        long maxLongValue=Long.MAX_VALUE;
        System.out.println("Minimum Long Value: "+minLongValue);
        System.out.println("Maximum Long Value: "+maxLongValue);
        long value=21474836479L;

        byte newByteValue=(byte)(minByteValue/2);
        System.out.println(newByteValue);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	byte myByteNumber=Byte.MAX_VALUE;
	short myShortNumber=Short.MAX_VALUE;
	int myIntNumber=Integer.MAX_VALUE;
	long total=(50000L+(10L*((long)myByteNumber+myShortNumber+myIntNumber)));
	System.out.println(total);
    }
}
//21475215410
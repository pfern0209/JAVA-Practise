package com.company;

public class Main {

    public static void main(String[] args) {
	    int a=5;
	    int b;
	    b=a++;
        System.out.println("Value of b is: "+b);
        System.out.println("Value of a is: "+a);

        System.out.println(a+b);
        System.out.println(b);

        int c=8;
        int d;
        d=c++;
        System.out.println(c+d);
        System.out.println(d);

    }
}

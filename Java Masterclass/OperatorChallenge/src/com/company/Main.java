package com.company;

public class Main {

    public static void main(String[] args) {
	    double a=20.00d;
	    double b=80.00d;
	    double result1=(a+b)*100d;
        System.out.println(result1);
	    double result2=result1%40.00d;
        System.out.println(result2);
	    boolean result3=(result2==0)?true:false;
        System.out.println(result3);
        if(!result3){
            System.out.println("Got some remainder");
        }
    }
}

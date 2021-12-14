package com.company;

public class Main {

    public static void main(String[] args) {
	    int number=0;
	    while(number<15){
            System.out.println(number);
	        number++;


	        if(number<=5){
                System.out.println("Continuing at: "+number);
                continue;
            }
            System.out.println("Number is: "+number);
	        if(number>=10){
                System.out.println("Breaking at: "+number);
                break;
            }
        }
        System.out.println("Code Ended");
	    int condition=1;
	    do{
            System.out.println("Printing condition: "+condition);
            condition++;
        }while(condition>3);
    }
}

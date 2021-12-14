package com.company;

public class Main {

    public static void main(String[] args) {
	    char ch='D';
	    switch(ch){
            case 'A': case 'a':
            {
                System.out.println("The character was A");
                break;
            }
            case 'B':
                System.out.println("The character was B");
                break;
            case 'C':
                System.out.println("The character was C");
                break;
            case 'D':
                System.out.println("The character was D");
                break;
            case 'E':
                System.out.println("The character was E");
                break;
            default:{
                System.out.println("Not found");
            }
        }
    }
}

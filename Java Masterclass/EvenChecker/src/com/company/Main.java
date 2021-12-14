package com.company;

public class Main {

    public static void main(String[] args) {
        int start=3;
        int end=30;
        int count=0;
	    while((start<=end) && count<5){
	        start++;
	        if(!isEven(start)){
	            continue;
            }
            System.out.println(start);
	        count++;
//	        if(count>=5){
//	            break;
//            }

        }
    }

    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
}

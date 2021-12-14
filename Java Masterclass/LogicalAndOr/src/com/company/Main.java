package com.company;

public class Main {

    public static void main(String[] args) {
	boolean isAdult=false;
	boolean hasDrivingLicense=false;
	if((isAdult)&&(hasDrivingLicense)){
        System.out.println("The Person is legal to drive");
    }else{
        System.out.println("Not permitted");
    }

	boolean hasAadhar=false;
	boolean hasPanCard=false;
	boolean hasDriversLicense=false;
	if((hasAadhar)||(hasDriversLicense)||(hasPanCard)){
        System.out.println("Has ID Proof");
    }else{
        System.out.println("No ID Proof");
    }

	int age=18;

	if(age==18 && !isAdult){
        System.out.println("No entry in party");
    }
    }
}

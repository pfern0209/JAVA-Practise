package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean isAdult=false;
	    if(isAdult){//isAdult==true;
            System.out.println("The person can vote");
        }
	    boolean hasLicense=false;
	    if(hasLicense){
            System.out.println("The Person can drive");
        }else{
            System.out.println("The Person cannot drive");
        }

	    boolean gameOver=true;
	    int levelCompleted=5;
	    int bonus=500;
	    if(gameOver){
	        int finalScore=levelCompleted*bonus;
            System.out.println(finalScore);
        }else{
            System.out.println("Game is still not completed");
        }

        System.out.println("The Final Score is: "+levelCompleted);//cannot use finalScore outside codeblock
    }
}

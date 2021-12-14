package com.company;

public class Main {

    public static void main(String[] args) {
	    calculateScore(true,5,21);
	    int finalCalcScore=calcScore(true,8,12);
        System.out.println(finalCalcScore);

    }
    public static void calculateScore(boolean gameOver, int level, int bonus){
        if(gameOver){
            int finalScore=level*bonus;
            System.out.println(finalScore);
        }
    }
    public static int calcScore(boolean gameOver,int level,int bonus){
        if(gameOver){
            int finalScore=level*bonus;
            return finalScore;
        }else{
            return -1;
        }
    }
}

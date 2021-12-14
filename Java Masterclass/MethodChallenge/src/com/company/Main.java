package com.company;

public class Main {

    public static void main(String[] args) {
        int position0=calculateHighScorePosition(1000);
        displayHighScorePosition("Adam",position0);
        int position1=calculateHighScorePosition(900);
        displayHighScorePosition("Bob",position1);
        int position2=calculateHighScorePosition(400);
        displayHighScorePosition("Clinton",position2);
        int position3=calculateHighScorePosition(50);
        displayHighScorePosition("David",position3);
    }
    public static void displayHighScorePosition(String name,int positionOnTable){
        System.out.println(name+" managed to get into position "+positionOnTable+" on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore>=1000){
//            return 1;
//        }else if(playerScore>500 && playerScore<1000){
//            return 2;
//        }else if(playerScore>100 && playerScore<500){
//            return 3;
//        }else{
//            return 4;
//        }
        int position=4;
        if (playerScore>=1000){
            position=1;
        }else if(playerScore>=500){
            position=2;
        }else if(playerScore>=100){
            position=3;
        }
        return position;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        double centimeters=calcFeetAndInchesToCentimeters(157);
        if(centimeters==-1){
            System.out.println("Invalid Input");
        }else{
            System.out.println("Value in centimeters is: "+centimeters);
        }

    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet>=0 && inches>=0 && inches<=12){
            //double totalInches=((feet*12)+inches);
            return ((feet*12)+inches)*2.54;
        }else{
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double feet=(int)inches/12;//so that feet doesn't have any decimal numbers
            double remainingInches=(int)inches%12;//so that inches doesn't have any decimal numbers
            System.out.println(feet+" feet "+remainingInches+" Inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);

        }else{
            return -1;
        }
    }
}

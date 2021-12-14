package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int minimum=0;
	    int maximum=0;
	    int count=1;
        boolean isAnInteger=true;
        while(isAnInteger){
            System.out.println("Enter number");
            isAnInteger=sc.hasNextInt();

            if(isAnInteger){
                int number=sc.nextInt();
                if(count==1){
                    minimum=number;
                    count++;
                    continue;
                }if(count==2){
                    if(number<minimum){
                        maximum=minimum;
                        minimum=number;
                    }else{
                        maximum=number;
                    }
                    continue;
                }
                if(number<minimum){
                    minimum=number;
                }else if(number>minimum && number>maximum){
                    maximum=number;
                }
            }else{
                System.out.println("Invalid Input Detected ending");
                isAnInteger=false;
            }
            sc.nextLine();
        }
        System.out.println("The maximum number entered was "+maximum+" and minimum number entered was "+minimum);
    }
}

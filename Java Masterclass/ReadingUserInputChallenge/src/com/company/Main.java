package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int currentValue;
	    int count=1;
	    int sum=0;
	    while(count<=10){
            System.out.println("Enter number #"+count);
            boolean hasNextInt= sc.hasNextInt();
            if(hasNextInt){
                currentValue=sc.nextInt();
                count++;
                sum+=currentValue;
            }else{
                System.out.println("Invalid Input Integer value is expected");
            }
            sc.nextLine();//so that content is read and removed if entered in if statement and code doesn't go inside if and directly else the invalid value will not be removed
        }
        System.out.println("The sum of the 10 numbers is: "+sum);
    }
}

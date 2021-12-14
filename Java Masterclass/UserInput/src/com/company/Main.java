package com.company;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name=sc.nextLine();
//        System.out.println("Enter your birth year");
//        int yearOfBirth=sc.nextInt();
//        int currentYear= Calendar.getInstance().get(Calendar.YEAR);
//        int age=currentYear-yearOfBirth;
//        System.out.println("Hello "+name+" you are "+age+" years old");
//        sc.close();

        System.out.println("Enter your Birth Year");
        boolean hasNextInt=sc.hasNextInt();
        if(hasNextInt){
            int year=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your name");
            String name=sc.nextLine();
            sc.close();
            int age=2021-year;
            if(age<0||age>100){
                System.out.println("Invalid age");
            }else{
                System.out.println("Hello "+name+" you are "+age+" years old");
            }
        }else{
            System.out.println("Unable to parse age");
        }

    }
}

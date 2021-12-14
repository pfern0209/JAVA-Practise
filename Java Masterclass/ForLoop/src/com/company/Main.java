package com.company;

public class Main {

    public static void main(String[] args) {
//	    for(int interest=2;interest<9;interest++){
//	        calculateInterest(10000,interest);
//        }
//        System.out.println("Reverse");
//        for(int interest=8;interest>1;interest--){
//            calculateInterest(10000,interest);
//        }
        System.out.println(Math.sqrt(8));
        int count=0;
        for(int i=2;i<12;i++){

            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
            if(count==3)
                break;

        }

    }
    public static void calculateInterest(double amount,double interestRate){
        System.out.println("Interest on "+amount+"Rs at "+interestRate+"% interest rate is: " +String.format("Rs %,.2f",(amount*(interestRate/100))));
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            //true wont be returned in else statement because we want to check further to make sure the number is prime if entire for loop is traversed and the number is not giving remainder 0 then for loop is exited and the number is prime
        }return true;
    }
}

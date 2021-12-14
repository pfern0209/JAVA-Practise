package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    boolean isAnInteger=true;
	    int number;
	    int count=0;
	    int sum=0;
	    long avg=0L;
	    while(isAnInteger){
            isAnInteger=sc.hasNextInt();
            if(isAnInteger){
                number=sc.nextInt();
                sum+=number;
                count++;
            }else{
                if(count==0){
                    isAnInteger=false;
                }else{
                    avg=Math.round((double)sum/(double)count);

                }
                System.out.println("SUM = "+sum+" AVG = "+avg);


            }
            sc.nextLine();

        }

        sc.close();

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    String s1="2018";
        System.out.println(s1);
        int number=Integer.parseInt(s1);
        number+=1;
        System.out.println(number);
        s1+=1;
        System.out.println(s1);
        s1+="a";
        System.out.println(s1);
//        int number2=Integer.parseInt(s1);
//        System.out.println(number2); Here we get an exception
        String s2="2021.2";
        double number3=Double.parseDouble(s2);
        number3+=1.23;
        System.out.println(number3);

    }
}

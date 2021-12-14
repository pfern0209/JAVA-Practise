import java.util.Scanner;

public class FunctionProblems {
    public static void nCR(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r= sc.nextInt();
        int NcR=factorial(n)/(factorial(n-r)*factorial(r));
        System.out.println(NcR);
    }

    public static int factorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }

    public static void fahrenheitToCelsiusTable(){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int step=sc.nextInt();

        for(int i=start;i<=end;i+=step){
            System.out.println(i+"\t"+fahrenheitToCelsiusConversion(i));
        }

    }

    public static int fahrenheitToCelsiusConversion(int fahrenheit){
        int celsius=(5*(fahrenheit-32))/9;
        return celsius;
    }

    public static boolean isFibonacciMember(int n){
        boolean isFibonacci=false;
        int a=0;
        int b=1;
        int c;
        while(a<=n){
            c=a+b;
            a=b;
            b=c;
            if(a==n){
                isFibonacci=true;
            }
        }

        return isFibonacci;
    }


}

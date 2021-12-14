import java.util.Scanner;

public class ForLoopProblems {
        public static void fibonacci(){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a =0;
            int b=1;
            int c=0;
            for(int i=1;i<=n;i++){
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(a);
        }

        public static void primes(){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=2;i<=n;i++){
                boolean isPrime=true;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                       isPrime=false;
                       //break; Not mandatory
                    }
                }if(isPrime){
                    System.out.println(i);
                }

            }
        }

    public static void sumOrProduct(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int choice=sc.nextInt();

        if(choice==1){
            int sum=0;
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            System.out.println(sum);
        }else if(choice==2){
            int product=1;
            for(int i=1;i<=n;i++){
                product*=i;
            }
            System.out.println(product);
        }else{
            System.out.println("-1");
        }
    }

    public static void arithmeticProgression(){
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int i=1;
        int j=1;
        while(i<=count){
            int ap=(3*j)+2;
            j++;
            if(ap%4==0){
                continue;
            }
            System.out.println(ap);
            i++;
        }
    }

    public static void reverseNumber(){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int reversedNumber=0;
        while(number>0){
            int lastDigit=number%10;
            number/=10;
            reversedNumber=reversedNumber*10+lastDigit;
        }
        System.out.println(reversedNumber);
    }

    public static void binaryToDecimal(){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int decimalNumber=0;
        int j=0;
        while(number>0){
            int lastDigit=number%10;
            number/=10;
            decimalNumber+=(int)(lastDigit*(Math.pow(2,j)));
            j++;
        }
        System.out.println(decimalNumber);
    }

    public static void decimalToBinary(){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int binary=0;
        int pow=1;
        while(number>0){
            int lastDigit=number%2;
            number/=2;
            binary+=lastDigit*pow;
            pow*=10;

        }
        System.out.println(binary);
    }

    public static void checkSequence(){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int previous=sc.nextInt();
            int current,count=2;
            boolean isDecreasing=true;
            while(count<=n){
                current=sc.nextInt();
                if(current==previous){
                    System.out.println("False");
                    return;
                }
                if(current < previous){
                    if(isDecreasing==false){
                        System.out.println("False");
                        return;
                    }
                    else{
                        previous=current;
                    }
                }else{
                    if(isDecreasing==true){
                        isDecreasing=false;
                        previous=current;
                    }
                    else{
                        previous=current;
                    }
                }count++;


            }

        System.out.println(true);

    }
    public static void squareRootIntegral() {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int currentSquare;
            int previousSquare=1;
            for(int i=2;i<n/2;i++){
                if(i*i==n){
                    System.out.println(i);
                    return;
                }
//                previousSquare=(i-1)*(i-1);
                currentSquare=i*i;
                if(currentSquare>n){
                    System.out.println(i-1);
                    return;
                }
            }
    }

    }


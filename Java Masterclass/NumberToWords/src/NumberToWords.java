public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }else{
            int reversedNumber=reverse(number);
            int DigitCount=getDigitCount(number);
            int count=1;
            int mostSignificant=reversedNumber;
            int leastSignificant;
            while(count<=DigitCount){
                count++;
                leastSignificant=mostSignificant%10;
                mostSignificant/=10;
                switch(leastSignificant){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Something went wrong");
                        break;

                }


            }


        }
    }

    public static int reverse(int number){
        if(number<0){
            number*=-1;
            int leastSignificant;
            int mostSignificant=number;
            int reverse=0;
            while(mostSignificant>0){
                leastSignificant=mostSignificant%10;
                mostSignificant/=10;
                reverse=(reverse*10)+leastSignificant;
            }
            return reverse*-1;
        }
        int leastSignificant;
        int mostSignificant=number;
        int reverse=0;
        while(mostSignificant>0){
            leastSignificant=mostSignificant%10;
            mostSignificant/=10;
            reverse=(reverse*10)+leastSignificant;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        if(number==0){
            return 1;
        }

        int Significant=number;
        int digitCount=0;

        while(Significant>0){
            Significant/=10;
            digitCount++;

        }
        return digitCount;
    }
}

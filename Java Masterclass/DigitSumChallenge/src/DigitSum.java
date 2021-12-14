public class DigitSum {
    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int mostSignificant=number;
        int leastSignificant;
        int sum=0;
        while(mostSignificant>0){
            leastSignificant=mostSignificant%10;
            sum+=leastSignificant;
            mostSignificant/=10;
        }
        return sum;
    }
}

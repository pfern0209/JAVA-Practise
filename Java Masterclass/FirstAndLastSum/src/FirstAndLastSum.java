public class FirstAndLastSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        if(number/10==0){
            return number+number;
        }

        int mostSignificant=number;
        int lastDigit=number%10;
        int count=0;
        int remaining;
        int firstDigit=0;
        while(mostSignificant>0){
            //int leastSignificant=mostSignificant%10;
            mostSignificant/=10;
            remaining=mostSignificant;
            count++;
            if(remaining/10==0){
                firstDigit=remaining;
                break;
            }
        }
        return firstDigit+lastDigit;
    }
}

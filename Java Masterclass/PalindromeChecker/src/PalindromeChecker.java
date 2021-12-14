public class PalindromeChecker {
    public static boolean isPalindrome(int number){
        if(number<0){
            number=number*-1;
        }
        int mostSignificant=number;
        int leastSignificant;
        int reverse=0;
        while(mostSignificant>0){
            leastSignificant=mostSignificant%10;
            mostSignificant/=10;
            reverse=(reverse*10)+leastSignificant;
        }
        if(reverse==number){
            return true;
        }
        return false;
    }
}

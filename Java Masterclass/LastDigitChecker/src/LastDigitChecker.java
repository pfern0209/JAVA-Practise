public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a,int b,int c){
        if((isValid(a)&&isValid(b)&&isValid(c))){
            if((a%10==b%10)||(a%10==c%10)||(c%10==b%10)){
                return true;
            }
        }
        return false;
    }
    public static boolean isValid(int a){
        if((a>9 && a<1001)){
            return true;
        }
        return false;
    }
}

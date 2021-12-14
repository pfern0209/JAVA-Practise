public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){
        if(((a>9)&&(a<100)) && ((b>9)&&(b<100))){
           int a_first=a%10;
           int a_second=a/10;
           int b_first=b%10;
           int b_second=b/10;
           if((a_first==b_first)||(a_first==b_second)||(a_second==b_first)||(a_second==b_second)){
               return true;
           }
        }
        return false;
    }
}

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first,int second){
        if((first<10)||(second<10)){
            return -1;
        }
        int minimum;
        int maximum;
        int gcd=1;
        if(first<second){
            minimum=first;
            maximum=second;
        }else{
            minimum=second;
            maximum=first;
        }
        for(int i=1;i<=minimum;i++){
            if((minimum%i==0)&&(maximum%i==0)){
                gcd=i;
            }
        }return gcd;
    }
}

public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number<0||number==0||number==1){
            return -1;
        }
        int largestPrime=0;
        for(int i=2;i<=number;i++){
            if(number%i==0){
                if(isPrime(i)){
                    largestPrime=i;
                }
            }
        }return largestPrime;

    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
}

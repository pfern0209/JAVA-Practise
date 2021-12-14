public class LargestPrimes {
    public static int getLargestPrime(int number){
        if(number<0||number==0||number==1){
            return -1;
        }
        int largestPrime=0;
        for(int i=2;i<=number;i++){

            if(number%i==0){
                int newNumber=i;
                int count=0;
                for(int j=newNumber;j>=1;j--){
                    if(newNumber%j==0){
                        count++;
                    }
                }if(count==2){
                    largestPrime=newNumber;
                }
            }
        }return largestPrime;
    }
}

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one,double two){
        if((int)one*1000==(int)two*1000){
            return true;
        }else{
            return false;
        }
    }
}

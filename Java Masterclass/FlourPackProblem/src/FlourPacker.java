public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount<0 || smallCount <0 || goal<0){
            return false;
        }
        int bigKilo=bigCount*5;
        if(bigKilo<=goal){
            int remainingTarget=goal-bigKilo;
            if(remainingTarget==0||(remainingTarget!=0 && remainingTarget<=smallCount)){
                return true;
            }else{
                return false;
            }
        }else{
            int remainingBigKilo=bigKilo-goal;
            if(goal<smallCount){
                return true;
            }
            if(goal>smallCount){
                int requiredSmallCount=goal%5;
                if(requiredSmallCount<=smallCount)
                    return true;
            }
            return false;

        }
    }
}

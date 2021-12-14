public class SecondsAndMinutes {
    public static String getDurationString(int minutes,int seconds){
        if((minutes>=0)&&(seconds>=0 && seconds<=59)){
            int hours=minutes/60;
            int remainingMinutes=minutes%60;
            String hr=hours+"h ";
            String m=remainingMinutes+"m ";
            String s=seconds+"s";
            if(hours<10){
                hr="0"+hr;
            }
            if(remainingMinutes<10){
                m="0"+m;
            }
            if(seconds<10){
                s="0"+s;
            }

                return hr+m+s;


        }else{
            return "Invalid Value";
        }
    }

    public static String getDurationString(int seconds){
        if(seconds>=0){
            int minutes=seconds/60;
            int remainingSeconds=seconds%60;
            return getDurationString(minutes,remainingSeconds);
        }else{
            return "Invalid Value";
        }
    }
}

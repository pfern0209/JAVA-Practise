public class YearsAndDays {
    public static void printYearsAndDays(long minutes){
        if(minutes>=0){
            long hours=minutes/60;
            long days=hours/24;
            long years=days/365;
            long remainingDays=days%365;
            System.out.println(minutes+" min = "+years+" y and "+remainingDays+" d");
        }else{
            System.out.println("Invalid Value");
        }
    }
}

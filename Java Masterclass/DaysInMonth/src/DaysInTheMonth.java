public class DaysInTheMonth {
    public static boolean isLeapYear(int year){
        if(year>=1 && year <=9999){
            if(year%4==0 && year%100!=0){
                return true;
            }else if(year%4==0 && year%100==0 && year%400==0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static int getDaysInMonth(int month,int year){
        if((month>=1 && month<=12)&& (year>=1 && year<=9999)){
            if(isLeapYear(year)){
                int days;
                switch(month){
                    case 1:case 3:case 5: case 7: case 8: case 10: case 12:
                        days= 31;
                        break;
                    case 2:
                        days= 29;
                        break;
                    default:
                        days= 30;

                }
                return days;
            }
            if(!isLeapYear(year)){
                int days;
                switch(month){
                    case 1:case 3:case 5: case 7: case 8: case 10: case 12:
                        days= 31;
                        break;
                    case 2:
                        days= 28;
                        break;

                    default:
                        days= 30;
                        break;

                }
                return days;
            }

        }
        return -1;

    }
}

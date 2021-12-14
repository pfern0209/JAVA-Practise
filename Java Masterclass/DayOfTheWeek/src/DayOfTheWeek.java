public class DayOfTheWeek {
    public static void dayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("It's Sunday");
                break;
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            default:
                System.out.println("Invalid Value");
                break;

        }

    }public static void dayOfWeek(int day){
        if(day==0){
            System.out.println("It's Sunday");
        }else if(day==1){
            System.out.println("It's Monday");
        }else if(day==2){
            System.out.println("It's Tuesday");
        }else if(day==3){
            System.out.println("It's Wednesday");
        }else if(day==4){
            System.out.println("It's Thursday");
        }else if(day==5){
            System.out.println("It's Friday");
        }else if(day==6){
            System.out.println("It's Saturday");
        }else{
            System.out.println("Invalid Value");
        }
    }
}

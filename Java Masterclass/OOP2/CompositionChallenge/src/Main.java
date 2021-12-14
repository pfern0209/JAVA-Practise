public class Main {
    public static void main(String[] args){
        Dimensions d=new Dimensions(5,5);
        TV tv=new TV("Sony",32,d);
        Fan f=new Fan(4,new Logo(12,14,"Blue"));
        Hall hall=new Hall(tv,f);
        hall.turnOn();

    }
}

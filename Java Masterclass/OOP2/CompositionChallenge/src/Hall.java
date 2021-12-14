public class Hall {
    private TV tv;
    private Fan fan;

    public Hall(TV tv,Fan fan){
        this.tv = tv;
        this.fan = fan;
    }

    private TV getTv() {
        return tv;
    }

    private Fan getFan() {
        return fan;
    }

    public void turnOn(){
        tv.switchOn();
        fan.fanOn();
    }
}

public class Car extends Vehicle{
    private int currentGear;
    private boolean isAutomatic;
    private String color;
    private int currentVelocity;

    public Car(String name,int currentGear,boolean isAutomatic,String color,int currentVelocity){
        super(name);
        this.currentGear=currentGear;
        this.isAutomatic=isAutomatic;
        this.color=color;
        this.currentVelocity=0;
    }

    public void setGear(int gear){
        System.out.println("Car.setGear() called and the gear is: "+gear);
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void changeVelocity(int velocity,int direction){
        System.out.println("The velocity is: "+velocity+" and the direction is: "+direction);
    }
}

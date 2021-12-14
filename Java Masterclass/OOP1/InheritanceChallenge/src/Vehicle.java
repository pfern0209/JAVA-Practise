public class Vehicle {
    private String name;
    private int velocity;
    private int direction;

    public Vehicle(String name){
        this.name=name;
        this.velocity=0;
        this.direction=0;
    }

    public void moveVehicle(int velocity,int direction){
        System.out.println("Vehicle.moveVehicle() called moving at: "+velocity+" in "+direction+" degree direction.");
    }

    public void stop(){
        System.out.println("The current speed is 0 and the direction is: "+direction);
    }

    public int getVelocity() {
        return velocity;
    }

    public int getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }
}

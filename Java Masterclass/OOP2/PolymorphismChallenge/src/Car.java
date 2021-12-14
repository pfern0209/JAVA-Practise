public class Car {
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    public Car(int cylinders,String name){
        this.cylinders=cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }

    public String startEngine(){
        return "Car is starting";
    }

    public String accelerate(){
        return "Car is accelerating";
    }

    public String brake(){
        return "Car is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

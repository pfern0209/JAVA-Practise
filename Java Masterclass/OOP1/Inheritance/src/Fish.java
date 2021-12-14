public class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(String name,int body,boolean brain,int weight,int gills,int fins){
        super(name,body,brain,weight);
        this.gills=gills;
        this.fins=fins;

    }

    public void swim(int speed){
        System.out.println("Fish.swim called");
        move();
    }

    public void backFin(){
        System.out.println("Fish.backFin called");
    }

    public void move(){
        swim(5);
        backFin();
    }

}

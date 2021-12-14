public class Dog extends Animal{
    private int legs;
    private int eyes;
    public Dog(String name,int body,boolean brain,int weight,int legs,int eyes){
        super(name,body,brain,weight);
        this.legs=legs;
        this.eyes=eyes;
    }

    private void chew(){
        System.out.println("Dog eat function called");
    }

    @Override
    public void eat(){
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move();
        super.move();
    }

    public void run(int speed){
        System.out.println("Dog.run() at "+speed);
    }

    @Override
    public void move(){
        System.out.println("Dog.move() called");

    }
}

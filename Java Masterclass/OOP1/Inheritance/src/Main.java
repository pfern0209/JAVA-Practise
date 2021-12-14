public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal("Animal",1,true,25);
        Dog dog=new Dog("Bruno",1,true,87,4,2);
        dog.eat();
        dog.walk();
    }
}

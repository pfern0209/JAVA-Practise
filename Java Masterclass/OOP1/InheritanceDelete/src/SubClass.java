public class SubClass extends SuperClass {
    public SubClass(int y) {
        super(y);

    }
    public SubClass(){
        this(1);
        System.out.println("Hello");
    }

}

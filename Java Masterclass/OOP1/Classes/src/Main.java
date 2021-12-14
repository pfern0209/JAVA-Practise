public class Main {
    public static void main(String[] args) {
        Car porsche=new Car();
        //Unlike data types objects do not have a default value and hence they have to be initialized
        Car bmw=new Car();

        System.out.println("The model is: "+porsche.getModel());
        porsche.setModel("carrera");//diablo unknown
        System.out.println("The model is: "+porsche.getModel());
    }
}

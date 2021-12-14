public class Main {
    public static void main(String[] args) {
        Dimension d = new Dimension(5,5);
        Monitor m=new Monitor("Dell",25,d);
//        Motherboard mobo=new Motherboard("MSI",7);
        Case c=new Case("Ryzen R3 1200",new Motherboard("MSI",7));
        PC myComputer=new PC(m,c);
//      myComputer.getMonitor().drawPixel(4,8,"Yellow");
        myComputer.powerUp();
    }
}

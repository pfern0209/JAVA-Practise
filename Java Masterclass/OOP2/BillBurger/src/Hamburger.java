public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    public Hamburger(String name,String meat,double price,String breadRollType){
        this.name = name;
        this.meat=meat;
        this.breadRollType=breadRollType;
        this.price=price;
    }

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String addition1Name,double addition1Price){
        this.price=this.price+addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name,double addition2Price){
        this.price=this.price+addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name,double addition3Price){
        this.price=this.price+addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name,double addition4Price){
        this.price=this.price+addition4Price;
    }

    public double itemizeHamburger(){
        return this.price;
    }
}


public class TV {
    private String brand;
    private int size;
    private Dimensions dimension;

    public TV(String brand, int size, Dimensions dimension){
        this.brand=brand;
        this.size=size;
        this.dimension=dimension;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public void setDimension(Dimensions dimension) {
        this.dimension = dimension;
    }

    public void switchOn(){
        System.out.println("TV is switched on");
    }
}

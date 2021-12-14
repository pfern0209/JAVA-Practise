

public class Monitor {
    private String brand;
    private int size;
    private Dimension dimension;

    public Monitor(String brand,int size,Dimension dimension){
        this.brand=brand;
        this.size=size;
        this.dimension=dimension;
    }

    public void drawPixel(int x,int y,String color){
        System.out.println("Pixel of "+color+" color drawn at x: "+x+" and y: "+y);
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}

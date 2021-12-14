public class Motherboard {
    private String brand;
    private int generation;

    public Motherboard(String brand,int generation){
        this.brand=brand;
        this.generation=generation;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }
}

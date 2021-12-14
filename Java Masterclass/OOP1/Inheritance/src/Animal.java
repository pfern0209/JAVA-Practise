public class Animal {
    private String name;
    private int body;
    private boolean brain;
    private int weight;

    public Animal(String name,int body,boolean brain,int weight){
        this.name=name;
        this.body=body;
        this.brain=brain;
        this.weight=weight;
    }

    public void eat(){
        System.out.println("Animal eat function called");
    }

    public void move(){
        System.out.println("Animal move function called");
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public boolean isBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }
}

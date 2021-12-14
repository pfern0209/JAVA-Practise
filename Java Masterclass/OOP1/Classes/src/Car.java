public class Car {
    private int doors;
    private String model;
    private String color;

    public void setModel(String model) {
        String validModel=model.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("x1")){
            this.model=model;//private model field is initialized
        }else{
            this.model="unknown";
        }

    }
    public String getModel(){
        return this.model;
    }
}

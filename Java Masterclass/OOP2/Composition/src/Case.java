public class Case {
    private String cpu;
    private Motherboard motherboard;

    public Case(String cpu,Motherboard motherboard){
        this.cpu = cpu;
        this.motherboard=motherboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void loadProgram(String programName){
        System.out.println("Program "+programName+" is loaded");
    }


}

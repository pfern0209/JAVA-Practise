public class Fan {
    private int panels;
    private Logo logo;

    public Fan(int panels,Logo logo){
        this.panels=panels;
        this.logo=logo;
    }



    public int getPanels() {
        return panels;
    }

    public void setPanels(int panels) {
        this.panels = panels;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }
    public void fanOn(){
        logo.switchOn();
    }
}

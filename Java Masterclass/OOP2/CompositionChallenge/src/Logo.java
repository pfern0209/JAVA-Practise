public class Logo {
    private int x;
    private int y;
    private String color;

    public Logo(int x,int y,String color){
        this.x=x;
        this.y=y;
        this.color=color;
    }

    public void switchOn(){
        System.out.println("Fan is on");
        drawLogo(this.x,this.y,this.color);
    }

    private void drawLogo(int x,int y,String color){
        System.out.println("Logo draw at: "+x+" and y: "+y+" of color: "+color);
    }
}

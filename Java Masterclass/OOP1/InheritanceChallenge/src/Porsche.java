public class Porsche extends Car{
    public Porsche(String name,boolean isAutomatic,String color,int currentVelocity){
        super(name,1,true,"Black",0);
    }
    public void accelerate(int rate){
        int newVelocity=getCurrentVelocity()+rate;

        if(newVelocity==0){
            setGear(1);
            stop();
        }else if(newVelocity>0 && newVelocity<=10){
            setGear(1);
        }else if(newVelocity>10 && newVelocity<=20){
            setGear(2);
        }else if(newVelocity>20 && newVelocity<=30){
            setGear(3);
        }else{
            setGear(4);
        }
        if(newVelocity>0){
            changeVelocity(newVelocity,getDirection());
        }
    }



}

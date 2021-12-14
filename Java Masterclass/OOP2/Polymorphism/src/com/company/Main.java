package com.company;
class Movie{
    private String name;
    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot for this movies";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "Shark eat people";
    }
}
class Rings extends Movie{
    public Rings(){
        super("Rings");
    }

    public String plot(){
        return "Horror";
    }
}

class Zootopia extends Movie{
    public Zootopia(){
        super("Zootopia");
    }

}
public class Main {
    public static Movie randomMovie(){
        int randomNumber=(int)(Math.random()*3)+1;
        System.out.println(randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new Rings();
            case 3:
                return new Zootopia();
        }
        return null;
}
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            Movie movie=randomMovie();
            System.out.println("Movie #"+i+" name: "+movie.getName()+" has a plot: "+movie.plot());
        }
    }
}

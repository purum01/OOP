package bookcode.ch05.code5_01;

abstract class Robot{
    private String name;
    public Robot(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void attack();
    public abstract void move();
}

class TaekwonV extends Robot{
    public TaekwonV(String name){
        super(name);
    }

    public void attack(){
        System.out.println("I Have Missile and can attack with it.");
    }

    public void move(){
        System.out.println("I can only walk");
    }
}

class Atom extends Robot{
    public Atom(String name){
        super(name);
    }

    public void attack(){
        System.out.println("I have strong puch and can attack with it.");
    }
    public void move(){
        System.out.println("I can fly.");
    }
}

public class Client{
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Attom");

        System.out.println("My name is "+taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My is "+ atom.getName());
        atom.move();
        atom.attack();
    }
}

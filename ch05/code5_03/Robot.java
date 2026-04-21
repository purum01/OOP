package bookcode.ch05.code5_03;
abstract class Robot{
    private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;

    public Robot(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void move(){
        movingStrategy.move();
    }

    public void attack(){
        attackStrategy.attack();
    }

    public void setMovingStrategy(MovingStrategy movingStrategy){
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }
}

class Atom extends Robot{
    public Atom(String name){
        super(name);
    }
}

class TaekwonV extends Robot{
    public TaekwonV(String name){
        super(name);
    }
}

class Sungard extends Robot{
	public Sungard(String name) {
		super(name);
	}
}
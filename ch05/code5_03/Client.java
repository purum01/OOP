package bookcode.ch05.code5_03;

interface MovingStrategy {
	public void move();
}

class FlyingStrategy implements MovingStrategy {
	public void move() {
		System.out.println("I can fly.");
	}
}

class WalkingStrategy implements MovingStrategy {
	public void move() {
		System.out.println("I can only walk.");
	}
}

class TeleportStrategy implements MovingStrategy {
	public void move() {
		System.out.println("I can teleport instantly to any location.");
	}
}

interface AttackStrategy {
	public void attack();
}

class MissilStrategy implements AttackStrategy {
	public void attack() {
		System.out.println("I have Missile and can attack with it.");
	}
}

class PunchStrategy implements AttackStrategy {
	public void attack() {
		System.out.println("I have strong punch and can attack with it.");
	}
}

public class Client {
	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Attom");

		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissilStrategy());

		atom.setMovingStrategy(new FlyingStrategy());
		atom.setAttackStrategy(new PunchStrategy());

		System.out.println("My name is " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();

		System.out.println("My name is " + atom.getName());
		atom.move();
		atom.attack();

	}
}

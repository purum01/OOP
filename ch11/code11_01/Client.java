package bookcode.ch11.code11_01;

public class Client {
	public static void main(String[] args) {
		Door door = new Door();
		HyndaiMotor hyuHyndaiMotor = new HyndaiMotor(door);
		hyuHyndaiMotor.move(Direction.UP);
	}
}

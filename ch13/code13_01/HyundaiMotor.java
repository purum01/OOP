package bookcode.ch13.code13_01;

public class HyundaiMotor extends Motor {
	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("move Hyundai Motor");
	}
}
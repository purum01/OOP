package bookcode.ch13.code13_04;


import bookcode.ch13.code13_01.*;
import bookcode.ch13.code13_03.*;

public class SamsungElevatorFactory extends ElevatorFactory {
	public Motor createMotor() {
		return new SamsungMotor();
	}

	public Door createDoor() {
		return new SamsungDoor();
	}
}

class SamsungDoor extends Door {
	protected void doClose() {
		System.out.println("close Samsung Door");
	}

	protected void doOpen() {
		System.out.println("open Samsung Door");
	}
}

class SamsungMotor extends Motor {
	protected void moveMotor(Direction direction) {
		System.out.println("move Samsung Motor");
	}
}


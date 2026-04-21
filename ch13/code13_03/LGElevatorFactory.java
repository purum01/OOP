package bookcode.ch13.code13_03;

import bookcode.ch13.code13_01.*;

public class LGElevatorFactory extends ElevatorFactory {
	public Motor createMotor() {
		return new LGMotor();
	}

	public Door createDoor() {
		return new LGDoor();
	}
}
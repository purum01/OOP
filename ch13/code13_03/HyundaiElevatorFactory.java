package bookcode.ch13.code13_03;

import bookcode.ch13.code13_01.*;

public class HyundaiElevatorFactory extends ElevatorFactory {
	public Motor createMotor() {
		return new HyundaiMotor();
	}

	public Door createDoor() {
		return new HyundaiDoor();
	}
}
package bookcode.ch13.code13_12;

import bookcode.ch13.code13_01.*;
import bookcode.ch13.code13_03.*;
import bookcode.ch13.code13_12.LGElevatorFactory;

public class HyundaiElevatorFactory extends ElevatorFactory {
	private static ElevatorFactory factory;

	private HyundaiElevatorFactory() {
	}

	public static ElevatorFactory getInstance() {
		if (factory == null)
			factory = new HyundaiElevatorFactory();
		return factory;
	}

	public Motor createMotor() {
		return new HyundaiMotor();
	}

	public Door createDoor() {
		return new HyundaiDoor();
	}
}
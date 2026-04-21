package bookcode.ch13.code13_03;

import bookcode.ch13.code13_01.*;

public class Client {
	public static void main(String[] args) {
		ElevatorFactory factory = null;
		String vendorName = args[0];
		if (vendorName.equalsIgnoreCase("LG")) {
			factory = new LGElevatorFactory();
		} else {
			factory = new HyundaiElevatorFactory();
		}

		Door door = factory.createDoor();
		Motor motor = factory.createMotor();
		motor.setDoor(door);

		door.open();
		motor.move(Direction.UP);

	}
}

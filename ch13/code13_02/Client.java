package bookcode.ch13.code13_02;

import bookcode.ch13.code13_01.*;

/*
 * 다른 제조 업체의 부품을 사용해야 하는 경우
 */
public class Client {
	public static void main(String[] args) {

		Door hyundaiDoor = DoorFactory.createDoor(VendorID.HYUNDAI);
		Motor hyundaiMotor = MotorFactory.createMotor(VendorID.HYUNDAI);

		hyundaiMotor.setDoor(hyundaiDoor);

		hyundaiDoor.open();
		hyundaiMotor.move(Direction.UP);
	}
}

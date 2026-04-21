package bookcode.ch13.code13_01;

public class MotorFactory {
	public static Motor createMotor(VendorID vendorID) {
		Motor motor = null;
		switch (vendorID) {
		case LG:
			motor = new LGMotor();

			break;

		case HYUNDAI:
			motor = new HyundaiMotor();
			break;
		}
		return motor;
	}
}

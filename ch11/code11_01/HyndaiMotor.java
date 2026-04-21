package bookcode.ch11.code11_01;

public class HyndaiMotor {
	private Door door;
	private MotorStatus motorStatus;

	public HyndaiMotor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}

	private void moveHyundaiMotor(Direction direction) {
		// Hyundai Mortor를 구동시킴
		System.out.println("Hyundai Motor 구동시킴...");
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	private void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}

	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING)
			return;

		DoorStatus doorStatus = door.getDoorStatus();
		if (doorStatus == DoorStatus.OPENED)
			door.close();

		moveHyundaiMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
}
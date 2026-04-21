package bookcode.ch13.code13_01;

public abstract class Motor {
	private Door door;
	private boolean isMoving;

	public Motor() {
		this.isMoving = false;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public void move(Direction direction) {
		if (isMoving) {
			return; 
		}

		if (door == null) {
			throw new IllegalStateException("Door is not set.");
		}

		DoorStatus doorStatus = door.getDoorStatus();
		if (doorStatus == DoorStatus.OPENED) {
			door.close(); // 문이 열려 있으면 닫음
		}

		isMoving = true;
		moveMotor(direction);
		isMoving = false;
	}

	protected abstract void moveMotor(Direction direction);
}




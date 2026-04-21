package bookcode.ch11.code11_04;

import bookcode.ch11.code11_01.Direction;
import bookcode.ch11.code11_01.Door;

public class LGMotor extends Motor {
	public LGMotor(Door door) {
		super(door);
	}

	protected void moveMotor(Direction direction) {
		// LG Motor 구동시킴
		System.out.println("LG Motor 구동시킴...");
	}

}
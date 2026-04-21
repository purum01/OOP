package bookcode.ch11.code11_03;

import bookcode.ch11.code11_01.Direction;
import bookcode.ch11.code11_01.Door;
import bookcode.ch11.code11_01.DoorStatus;
import bookcode.ch11.code11_01.MotorStatus;

public class LGMotor extends Motor {
    public LGMotor(Door door) {
        super(door);
    }

    private void moveLGMotor(Direction direction) {
        // LG Motor 구동시킴
    	System.out.println("LG Motor 구동시킴...");
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING)
            return;

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED)
            door.close();

        moveLGMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

}
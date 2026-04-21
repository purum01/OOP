package bookcode.ch11.code11_04;

import bookcode.ch11.code11_01.Direction;
import bookcode.ch11.code11_01.Door;
import bookcode.ch11.code11_01.DoorStatus;
import bookcode.ch11.code11_01.MotorStatus;

public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING)
            return;

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED)
            door.close();

        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }    
    protected abstract void moveMotor(Direction direction);
}




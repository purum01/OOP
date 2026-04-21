package bookcode.ch11.code11_03;

import bookcode.ch11.code11_01.Door;
import bookcode.ch11.code11_01.MotorStatus;

public abstract class Motor {
    protected Door door;
    protected MotorStatus motorStatus;

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
}



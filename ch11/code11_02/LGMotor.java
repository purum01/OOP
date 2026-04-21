package bookcode.ch11.code11_02;

import bookcode.ch11.code11_01.Direction;
import bookcode.ch11.code11_01.Door;
import bookcode.ch11.code11_01.DoorStatus;
import bookcode.ch11.code11_01.MotorStatus;

public class LGMotor{
    private Door door;
    private MotorStatus motorStatus;

    public LGMotor(Door door){
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    private void moveLGMotor(Direction direction){
        //LG Motor를 구동시킴
    }

    public MotorStatus geMotorStatus(){
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus){
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction){
        MotorStatus motorStatus = geMotorStatus();
        if(motorStatus==MotorStatus.MOVING)
            return;
        
        DoorStatus doorStatus = door.getDoorStatus();
        if(doorStatus==DoorStatus.OPENED)
            door.close();
        
        moveLGMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}





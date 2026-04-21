package bookcode.ch11.code11_04;

import bookcode.ch11.code11_01.Direction;
import bookcode.ch11.code11_01.Door;

public class HyndaiMotor extends Motor {
    public HyndaiMotor(Door door) {
        super(door);
    }

    protected void moveMotor(Direction direction) {
        // Hyundai Motor 구동시킴
    	System.out.println("Hyundai Motor 구동시킴...");
    }
}
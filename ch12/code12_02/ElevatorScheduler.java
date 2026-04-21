package bookcode.ch12.code12_02;

import bookcode.ch12.code12_01.Direction;

public interface ElevatorScheduler{
    public int selectElevator(ElevatorManager manger, int destination, Direction direction);
}

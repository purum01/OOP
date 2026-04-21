package bookcode.ch12.code12_02;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import bookcode.ch12.code12_01.Direction;

public class ElevatorManager {
    private List<ElevatorController> controllers;

    public ElevatorManager(int contollerCount){
        controllers = new ArrayList<>(contollerCount);
        for (int i = 0; i < contollerCount; i++) {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }
    }

    void requestElevator(int destination, Direction direction){
        ElevatorScheduler scheduler;

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(hour<12)
            scheduler = new ResponseTimeScheduler();
        else
            scheduler = new ThroughputScheduler();

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}







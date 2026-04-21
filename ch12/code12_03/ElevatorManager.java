package bookcode.ch12.code12_03;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private SchedulingStrategyID strategyID;

	public ElevatorManager(int contollerCount, SchedulingStrategyID strategyID) {
		controllers = new ArrayList<>(contollerCount);
		for (int i = 0; i < contollerCount; i++) {
			ElevatorController controller = new ElevatorController(i + 1);
			controllers.add(controller);
		}
		this.strategyID = strategyID;
	}

	public void setStrategyID(SchedulingStrategyID strategyID) {
		this.strategyID = strategyID;
	}

	void requestElevator(int destination, Direction direction) {
		ElevatorScheduler scheduler = SchedulingFactory.getScheduler(strategyID);
		System.out.println(scheduler);
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}

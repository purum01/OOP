package bookcode.ch12.code12_01;

import java.util.ArrayList;
import java.util.List;

/*
 * 여러 엘리베이터 중에서 스케쥴링에 따라서 하나의 엘리베이터를 선택하고 이동시키는 클래스
 */
public class ElevatorManager {
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;

	public ElevatorManager(int contollerCount) {
		controllers = new ArrayList<>(contollerCount);
		for (int i = 0; i < contollerCount; i++) {
			ElevatorController controller = new ElevatorController(i);
			controllers.add(controller);
		}
		scheduler = new ThroughputScheduler();
	}

	void requestElevator(int destination, Direction direction) {
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}

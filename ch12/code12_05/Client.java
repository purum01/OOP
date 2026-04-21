package bookcode.ch12.code12_05;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/*
 * 상속을 이용한 팩토리 메서드 패턴의 적용
 */

abstract class ElevatorManager {
	private List<ElevatorController> controllers;

	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<>(controllerCount);
		for (int i = 0; i < controllerCount; i++) {
			ElevatorController controller = new ElevatorController(i + 1);
			controllers.add(controller);
		}
	}

	protected abstract ElevatorScheduler getScheduler();

	void requestElevator(int destination, Direction direction) {
		ElevatorScheduler scheduler = getScheduler();
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
	}

}

class ElevatorManagerWithThroughputScheduling extends ElevatorManager {
	public ElevatorManagerWithThroughputScheduling(int controllerCount) {
		super(controllerCount);
	}

	protected ElevatorScheduler getScheduler() {
		ElevatorScheduler scheduler = ThroughputScheduler.getInstance();
		return scheduler;
	}
}

class ElevatorManagerWithResponseTimeScheduling extends ElevatorManager {
	public ElevatorManagerWithResponseTimeScheduling(int controllerCount) {
		super(controllerCount);
	}

	protected ElevatorScheduler getScheduler() {
		ElevatorScheduler scheduler = ResponseTimeScheduler.getInstance();
		return scheduler;
	}
}

class ElvatorManagerWithDynamicScheduling extends ElevatorManager {
	public ElvatorManagerWithDynamicScheduling(int controllerCount) {
		super(controllerCount);
	}

	protected ElevatorScheduler getScheduler() {
		ElevatorScheduler scheduler = null;
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour < 12)
			scheduler = ResponseTimeScheduler.getInstance();
		else
			scheduler = ThroughputScheduler.getInstance();

		return scheduler;
	}
}

/*
 * 이전 코드들
 */

enum SchedulingStrategyID {
	RESPONSE_TIME, THROUGHPUT, DYNAMIC
}

class ElevatorController {
	private int id; // 엘리베이터 ID
	private int curFloor; // 현재 층

	public ElevatorController(int id) {
		this.id = id;
		curFloor = 1;
	}

	public void gotoFloor(int destination) {
		System.out.print("Elvator [" + id + "] Floor: " + curFloor);
		curFloor = destination;
		System.out.println(" ==> " + curFloor);
	}

}

enum Direction {
	UP, DOWN
}

interface ElevatorScheduler {
	int selectElevator(ElevatorManager manager, int destination, Direction direction);
}

class ResponseTimeScheduler implements ElevatorScheduler {
	private static final ResponseTimeScheduler instance = new ResponseTimeScheduler();

	private ResponseTimeScheduler() {
	}

	public static ResponseTimeScheduler getInstance() {
		return instance;
	}

	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return 0; // 임의의 엘리베이터 선택
	}
}

class ThroughputScheduler implements ElevatorScheduler {
	private static final ThroughputScheduler instance = new ThroughputScheduler();

	private ThroughputScheduler() {
	}

	public static ThroughputScheduler getInstance() {
		return instance;
	}

	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return 0; // 임의의 엘리베이터 선택
	}
}

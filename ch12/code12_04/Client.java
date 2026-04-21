package bookcode.ch12.code12_04;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/*
 * 싱글턴패턴을 적용할 스케쥴링 전략 클래스 설계
 */

class SchedulingFactory {
	public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
		ElevatorScheduler scheduler = null;
		switch (strategyID) {
		case RESPONSE_TIME:
			scheduler = ResponseTimeScheduler.getInstance();
			break;
		case THROUGHPUT:
			scheduler = ThroughputScheduler.getInstance();
			break;
		case DYNAMIC: {
			int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
			if (hour < 12) // 오전
				scheduler = ResponseTimeScheduler.getInstance();
			else // 오후
				scheduler = ThroughputScheduler.getInstance();
			break;
		}
		}
		return scheduler;
	}
}

class ThroughputScheduler implements ElevatorScheduler {
	private static ElevatorScheduler scheduler;

	private ThroughputScheduler() {
	}

	public static ElevatorScheduler getInstance() {
		if (scheduler == null)
			scheduler = new ThroughputScheduler();
		return scheduler;
	}

	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return 0;
	}
}

class ResponseTimeScheduler implements ElevatorScheduler {
	private static ElevatorScheduler scheduler;

	private ResponseTimeScheduler() {
	}

	public static ElevatorScheduler getInstance() {
		if (scheduler == null)
			scheduler = new ResponseTimeScheduler();
		return scheduler;
	}

	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return 1;
	}
}

/*
 * 이전 코드들
 */

public class Client {
	public static void main(String[] args) {
		ElevatorManager emWithResponseTimeSchElevatorManager = new ElevatorManager(2,SchedulingStrategyID.RESPONSE_TIME);
		emWithResponseTimeSchElevatorManager.requestElevator(10, Direction.UP);

		ElevatorManager emWithThroughputScheduler = new ElevatorManager(2, SchedulingStrategyID.THROUGHPUT);
		emWithThroughputScheduler.requestElevator(10, Direction.UP);

		ElevatorManager emWithDynamicScheduler = new ElevatorManager(2, SchedulingStrategyID.DYNAMIC);
		emWithDynamicScheduler.requestElevator(10, Direction.UP);
	}
}

interface ElevatorScheduler {
	public int selectElevator(ElevatorManager manger, int destination, Direction direction);
}

enum SchedulingStrategyID {
	RESPONSE_TIME, THROUGHPUT, DYNAMIC
}

class ElevatorManager {
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
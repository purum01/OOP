package bookcode.ch12.code12_03;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Client {
	public static void main(String[] args) {
		ElevatorManager emWithResponseTimeSchElevatorManager = new ElevatorManager(2, SchedulingStrategyID.REPONSE_TIME);
		emWithResponseTimeSchElevatorManager.requestElevator(10, Direction.UP);

		ElevatorManager emWithThroughputScheduler = new ElevatorManager(2, SchedulingStrategyID.THROUGHPUT);
		emWithThroughputScheduler.requestElevator(10, Direction.UP);

		ElevatorManager emWithDynamicScheduler = new ElevatorManager(2, SchedulingStrategyID.DYNAMIC);
		emWithDynamicScheduler.requestElevator(10, Direction.UP);
	}
}

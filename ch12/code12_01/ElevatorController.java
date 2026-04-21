package bookcode.ch12.code12_01;

/*
 * 하나의 엘리베이터 이동을 제어하는 클래스
 */
public class ElevatorController {
	private int id; // 엘리베이터 ID
	private int curFloor; // 현재 층

	public ElevatorController(int id) {
		this.id = id;
		curFloor = 1;
	}

	public void gotoFloor(int destination) {
		System.out.println("Elvator [" + id + "] Floor: " + curFloor);
		curFloor = destination;
		System.out.println(" ==>" + curFloor);
	}

}
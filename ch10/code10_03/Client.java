package bookcode.ch10.code10_03;

public class Client {
	public static void main(String[] args) {
		Display road = new RoadDisplay();
		road.draw();
		System.out.println("--------------------");

		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();
		
		System.out.println("--------------------");

		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		roadWithTraffic.draw();
	}
}

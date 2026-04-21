package bookcode.ch10.code10_04;

import bookcode.ch10.code10_03.*;

public class Client {
	public static void main(String[] args) {
		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneAndTraffic.draw();

	}
}

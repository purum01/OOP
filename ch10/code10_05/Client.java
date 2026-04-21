package bookcode.ch10.code10_05;

import bookcode.ch10.code10_03.Display;
import bookcode.ch10.code10_03.LaneDecorator;
import bookcode.ch10.code10_03.RoadDisplay;
import bookcode.ch10.code10_03.TrafficDecorator;

public class Client {
	public static void main(String[] args) {
		Display roadWithCrossingAndLaneAndTraffic = new LaneDecorator(
				new TrafficDecorator(new CrossingDecorator(new RoadDisplay())));
		roadWithCrossingAndLaneAndTraffic.draw();
	}
}

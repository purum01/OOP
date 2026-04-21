/*
 * java Client Traffic Lane
 * java Client Crossing Lane Traffic
 */
package bookcode.ch10.code10_06;

import bookcode.ch10.code10_03.Display;
import bookcode.ch10.code10_03.LaneDecorator;
import bookcode.ch10.code10_03.RoadDisplay;
import bookcode.ch10.code10_03.TrafficDecorator;
import bookcode.ch10.code10_05.CrossingDecorator;

public class Client {
	public static void main(String[] args) {
		Display road = new RoadDisplay();
		for (String decorationName : args) {
			if (decorationName.equalsIgnoreCase("Lane"))
				road = new LaneDecorator(road);
			if (decorationName.equalsIgnoreCase("Traffic"))
				road = new TrafficDecorator(road);
			if (decorationName.equalsIgnoreCase("Crossing"))
				road = new CrossingDecorator(road);
		}
		road.draw();
	}
}

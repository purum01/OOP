package bookcode.ch10.code10_05;

import bookcode.ch10.code10_03.Display;
import bookcode.ch10.code10_03.DisplayDecorator;

public class CrossingDecorator extends DisplayDecorator {
	public CrossingDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	public void draw() {
		super.draw();
		drawCrossing();
	}

	private void drawCrossing() {
		System.out.println("\t 교차로 표시");
	}
}

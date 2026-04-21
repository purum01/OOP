package bookcode.ch14.code14_02;

import bookcode.ch14.code14_01.*;

public class Computer {
	private Body body;
	private Keyboard keyboard;
	private Monitor monitor;
	private Speaker speaker;

	public void addBody(Body body) {
		this.body = body;
	}

	public void addKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public void addMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void addSpeaker(Speaker speaker){
        this.speaker = speaker;
    }

	public int getPrice() {
		int bodyPrice = body.getPrice();
		int keyboardPrice = keyboard.getPrice();
		int monitorPrice = monitor.getPrice();
		int speakPrice = speaker.getPrice();

		return bodyPrice + keyboardPrice + monitorPrice + speakPrice;
	}

	public int getPower() {
		int bodyPower = body.getPower();
		int keyboardPower = keyboard.getPower();
		int monitorPower = monitor.getPower();
		int speakPower = speaker.getPower();

		return bodyPower + keyboardPower + monitorPower + speakPower;
	}
}

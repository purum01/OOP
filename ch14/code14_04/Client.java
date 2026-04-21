package bookcode.ch14.code14_04;

import bookcode.ch14.code14_03.*;

public class Client {
	public static void main(String[] args) {
		Body body = new Body(100, 70);
		Keyboard keyboard = new Keyboard(5, 2);
		Monitor monitor = new Monitor(20, 30);
		Speaker speaker = new Speaker(10, 10);

		Computer computer = new Computer();
		computer.addComponent(body);
		computer.addComponent(keyboard);
		computer.addComponent(monitor);
		computer.addComponent(speaker);

		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();

		System.out.println("Computer Power: " + computerPower + 'W');
		System.out.println("Computer Price: " + computerPrice + "만원");
	}
}

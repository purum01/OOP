package bookcode.ch14.code14_04;

import bookcode.ch14.code14_03.*;

public class Speaker extends ComputerDevice {
	private int price;
	private int power;

	public Speaker(int power, int price) {
		this.power = power;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public int getPower() {
		return power;
	}
}

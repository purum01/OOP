package bookcode.ch14.code14_02;

public class Speaker {
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

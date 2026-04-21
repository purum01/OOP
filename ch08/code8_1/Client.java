package bookcode.ch08.code8_1;

public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Button lampButton = new Button(lamp);
		lampButton.pressed();
	}
}

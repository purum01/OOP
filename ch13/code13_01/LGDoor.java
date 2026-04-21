package bookcode.ch13.code13_01;

public class LGDoor extends Door {
	@Override
	protected void doClose() {
		System.out.println("close LG Door");

	}

	@Override
	protected void doOpen() {
		System.out.println("open LG Door");

	}
}
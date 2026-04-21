package bookcode.ch13.code13_01;

public class HyundaiDoor extends Door {
	@Override
	protected void doClose() {
		System.out.println("close Hyundai Door");

	}

	@Override
	protected void doOpen() {
		System.out.println("open Hyundai Door");

	}
}
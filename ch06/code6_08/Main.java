package bookcode.ch06.code6_08;

/*
 * 인스턴스를 만드는 메서드에 동기화하는 방법
 */
class UserThread extends Thread {

	public UserThread(String name) {
		super(name);
	}

	public void run() {
		Printer printer = Printer.getPrinter();
		printer.print(Thread.currentThread().getName() + " print using " + printer.toString() + ".");
	}
}

class Printer {
	private static Printer printer = null;

	private Printer() {
	}

	public synchronized static Printer getPrinter() {
		if (printer == null) {
			printer = new Printer();
		}
		return printer;
	}

	public void print(String str) {
		System.out.println(str);
	}
}

public class Main {
	private static final int THREAD_NUM = 5;

	public static void main(String[] args) {
		UserThread[] user = new UserThread[THREAD_NUM];
		for (int i = 0; i < THREAD_NUM; i++) {
			user[i] = new UserThread((i + 1) + "user");
			user[i].start();
		}
	}
}
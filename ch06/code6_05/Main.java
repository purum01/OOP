package bookcode.ch06.code6_05;

/*
 * 다중 스레드에서 Printer 클래스를 사용할 때 인스턴스가 1개이상 생성되는 경우 발생
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

	public static Printer getPrinter() {
		if (printer == null) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}

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
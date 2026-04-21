package bookcode.ch06.code6_07;

/*
 * 정적 변수에 인스턴스를 만들어 바로 초기화 하는 방법
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
	private static Printer printer = new Printer();
	private int counter = 0;

	private Printer() {
	}

	public static Printer getPrinter() {
		return printer;
	}

	public void print(String str) {
		counter++;
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
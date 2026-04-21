package bookcode.ch06.code6_11;

/**
 * 싱글턴 패턴 대신 정적 메서드 사용
 */

class Printer {
	private static int counter = 0;

	public synchronized static void print(String str) {
		counter++;
		System.out.println(str + counter);
	}
}

class UserThread extends Thread {
	public UserThread(String name) {
		super(name);
	}

	public void run() {
		Printer.print(Thread.currentThread().getName() + " print using " + ".");
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
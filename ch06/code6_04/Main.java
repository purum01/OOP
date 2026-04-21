package bookcode.ch06.code6_04;

class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void print() {
		Printer printer = Printer.getPrinter();
		printer.print(this.name + " print using " + printer.toString() + ".");
	}
}

public class Main {
	private static final int User_NUM = 5;

	public static void main(String[] args) {
		User[] user = new User[User_NUM];
		for (int i = 0; i < User_NUM; i++) {
			user[i] = new User((i + 1) + "user");
			user[i].print();
		}
	}
}

class Printer {
	private static Printer printer = null;

	private Printer() {
	}

	public static Printer getPrinter() {
		if (printer == null)
			printer = new Printer(); // Printer 인스턴스 생성

		return printer;
	}

	public void print(String str) {
		System.out.println(str);
	}
}

/*
 * 코드 6-14
 */
package bookcode.ch06.code6_14;

public class UsePrinter {
	public void doSomething(Printer printer) {
		String str;
		// 코드 생략
		str = "this is a test";
		printer.print(str);
	}
}

interface Printer {
	public void print(String str);
}

class RealPrinter315 implements Printer { // 싱글턴 패턴을 사용
	private static Printer printer = null;

	private RealPrinter315() {
	}

	public synchronized static Printer getPrinter() {
		if (printer == null) {
			printer = new RealPrinter315();
		}
		return printer;
	}

	public void print(String str) {
		// 실제 프린터 하드웨어를 조작하는 코드드
	}
}

class FakePrinter implements Printer { // 테스트용 가짜 프린터
	private String str;

	public void print(String str) {
		this.str = str;
	}

	public String get() {
		return str;
	}
}
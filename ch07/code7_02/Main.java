// 상태 인터페이스
package bookcode.ch07.code7_02;

public class Main {
	public static void main(String[] args) {
		Light light = new Light(); // OFF 상태

		light.on_button_pushed(); // → Light On!
		light.on_button_pushed(); // → [반응 없음]
		light.off_button_pushed(); // → Light Off!
		

	}
}

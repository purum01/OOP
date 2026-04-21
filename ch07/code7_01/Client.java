package bookcode.ch07.code7_01;

public class Client {
	public static void main(String[] args) {
		Light light = new Light();
		light.off_button_pushed(); // 반응 없음
		light.on_button_pushed();
		light.off_button_pushed();
	}
}

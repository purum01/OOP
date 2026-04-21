package bookcode.ch07.code7_01;

public class Light {
	private static int ON = 0; // 형광등이 켜진 상태
	private static int OFF = 1; // 형광등이 꺼진 상태
	private int state; // 형광등의 현재 상태

	public Light() {
		state = OFF; // 형광등 초기 상태는 꺼져 있는 상태임
	}

	public void on_button_pushed() {
		if (state == ON) {
			System.out.println("반응 없음");
		} else { // 형광등이 꺼져 있을 때 On 버튼을 누르면 켜진 상태로 전환
			System.out.println("Light On!");
			state = ON;
		}
	}

	public void off_button_pushed() {
		if (state == OFF) {
			System.out.println("반응 없음");
		} else { // 형광등이 켜져 있을 때 Off 버튼을 누른면 꺼진 상태로 전환
			System.out.println("Light Off!");
			state = OFF;
		}
	}
}

package bookcode.ch07.code7_03;

import bookcode.ch07.code7_02.Light;
import bookcode.ch07.code7_02.State;


public class OFF implements State {
	private static OFF off = new OFF(); // OFF 클래스의 인슨턴스로 초기화됨

	private OFF() {
	}

	public static OFF getInstance() { // 초기화된 OFF 클래스의 인스턴스를 반환함
		return off;
	}

	public void on_button_pushed(Light light) { // Off 상태일 때 On 버튼을 누르면 On 상태임
		light.setState(ON.getInstance());
		System.out.println("Light On!");
	}

	public void off_button_pushed(Light light) { // Off 상태일 때 Off 버튼을 눌러도 변화 없음
		System.out.println("반응 없음음");
	}

}

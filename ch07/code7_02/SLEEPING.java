package bookcode.ch07.code7_02;

//SLEEPING 상태
public class SLEEPING implements State {
	public void on_button_pushed(Light light) {
		System.out.println("Light On from Sleep!");
		light.setState(new ON());
	}

	public void off_button_pushed(Light light) {
		System.out.println("Light Off from Sleep!");
		light.setState(new OFF());
	}
}

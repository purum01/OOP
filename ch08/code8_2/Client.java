package bookcode.ch08.code8_2;

public class Client {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Button alarmButton = new Button(alarm);
        alarmButton.pressed();
    }
}

package bookcode.ch08.code8_2;

public class Button {
    private Alarm theAlarm;

    public Button(Alarm theAlarm){
        this.theAlarm = theAlarm;
    }

    public void pressed(){
        theAlarm.start(); //버튼을 누르면 알람이 울림
    }
}

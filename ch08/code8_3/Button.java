package bookcode.ch08.code8_3;

public class Button{
    private Lamp theLamp;
    private Alarm theAlarm;
    private Mode theMode;

    public Button(Lamp theLamp, Alarm theAlarm){
        this.theLamp = theLamp;
        this.theAlarm = theAlarm;
    }

    public void setMode(Mode mode){
        this.theMode = mode;
    }

    public void pressed(){
        switch (theMode) {
            case LAMP:   // 램프 모드면 램프를 켬
                theLamp.turnOn();
                break;
        
            case ALARM: //알람 모드면 알람을 울리게 함
                theAlarm.start();
                break;
        }
    }
}
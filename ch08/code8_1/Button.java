package bookcode.ch08.code8_1;

public class Button {
    private Lamp theLamp;

    public Button(Lamp theLamp){
        this.theLamp = theLamp;
    }

    public void pressed(){
        theLamp.turnOn();
    }
}

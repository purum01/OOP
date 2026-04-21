package bookcode.ch10.code10_03;

public class LaneDecorator extends DisplayDecorator   {
    public LaneDecorator(Display decorateDisplay){
        super(decorateDisplay);
    }

    public void draw(){
        super.draw();
        drawLane();
    }
    public void drawLane(){
        System.out.println("\t 차선 표시");
    }
}
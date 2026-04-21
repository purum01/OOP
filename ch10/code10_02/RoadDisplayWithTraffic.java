package bookcode.ch10.code10_02;

import bookcode.ch10.code10_01.RoadDisplay;

public class RoadDisplayWithTraffic extends RoadDisplay{
    public void draw(){
        super.draw();
        drawTraffic();
    }

    private void drawTraffic(){
        System.out.println("교통량 표시");
    }
}
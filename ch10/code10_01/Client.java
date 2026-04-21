package bookcode.ch10.code10_01;

public class Client{
    public static void main(String[] args) {
        RoadDisplay road = new RoadDisplay();
        road.draw();

        RoadDisplay roadWithLane = new RoadDisplayWithLane();
        roadWithLane.draw();
    }
}
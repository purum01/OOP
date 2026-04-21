package bookcode.ch12.code12_02;

public class ElevatorController{
    private int id; //엘리베이터 ID
    private int curFloor; //현재 층

    public ElevatorController(int id){
        this.id = id;
        curFloor = 1;
    }
    public void gotoFloor(int destination){
        System.out.println("Elvator ["+id+"] Floor: "+curFloor);
        curFloor = destination;
        System.out.println(" ==>"+curFloor);
    }

}

package bookcode.ch09.code9_04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Observer{
    public abstract void update();
}

abstract class Subject{
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detatch(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer o : observers) {
            o.update();
        }
    }
}

class ScoreRecord extends Subject{
    private List<Integer> scores = new ArrayList<>();
    public void addScore(int score){
        scores.add(score);
        notifyObservers();
    }

    public List<Integer> getScoreRecord(){
        return scores;
    }
}

class DataSheetView implements Observer{
    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount){
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    public void update(){
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScored(record, viewCount);
    }

    private void displayScored(List<Integer> record, int viewCount){
        System.out.println("List of "+viewCount + " entries: ");
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.println(record.get(i) + " ");
        }
        System.out.println();
    }
}
class MinMaxView implements Observer{
    private ScoreRecord scoreRecord;
    public MinMaxView(ScoreRecord scoreRecord){
        this.scoreRecord = scoreRecord;
    } 

    public void update(){
        List<Integer> record = scoreRecord.getScoreRecord();
        displayMinMax(record);
    }

    private void displayMinMax(List<Integer> record){
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);
        System.out.println("Min: "+min+" Max: "+max);
        System.out.println("---------------------------");
    }
}

public class Client{
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.attach(dataSheetView3);
        scoreRecord.attach(dataSheetView5);
        scoreRecord.attach(minMaxView);

        for (int index = 0; index <= 5 ; index++) {
            int score = index * 10;
            System.out.println("Adding "+score);
            scoreRecord.addScore(score);
        }
    }
}
/* 성적을 다른 형태로 출력하는 경우 : 최소/최대 값만 출력 */
package bookcode.ch09.code9_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MinMaxView {
    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayMinMax(record);
    }

    private void displayMinMax(List<Integer> record) {
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);
        System.out.println("Min: " + min + " Max: " + max);
        System.out.println("---------------------------");
    }
}

class ScoreRecord {
    private List<Integer> scores = new ArrayList<>();
    private MinMaxView minMaxView;

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    public void addScore(int score) {
        scores.add(score);
        minMaxView.update();
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }
}

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.setMinMaxView(minMaxView);

        for (int index = 0; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding " + score);
            scoreRecord.addScore(score);
        }
    }
}
/*
 * 성적을 다른 형태로 출력하는 경우 : 동시에 여러가지 방식으로 성적을 출력
 */
package bookcode.ch09.code9_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DataSheetView {
	private ScoreRecord scoreRecord;
	private int viewCount;

	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}

	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord();
		displayScored(record, viewCount);
	}

	private void displayScored(List<Integer> record, int viewCount) {
		System.out.println("List of " + viewCount + " entries: ");
		for (int i = 0; i < viewCount && i < record.size(); i++) {
			System.out.println(record.get(i) + " ");
		}
		System.out.println();
	}
}

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
	private List<DataSheetView> dataSheetViews = new ArrayList<DataSheetView>();
	private MinMaxView minMaxView;

	public void addDataSheetView(DataSheetView dataSheetView) {
		dataSheetViews.add(dataSheetView);
	}

	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}

	public void addScore(int score) {
		scores.add(score);
		for (DataSheetView dataSheetView : dataSheetViews)
			dataSheetView.update();
		minMaxView.update();
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}

}

public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);

		scoreRecord.addDataSheetView(dataSheetView3);
		scoreRecord.addDataSheetView(dataSheetView5);
		scoreRecord.setMinMaxView(minMaxView);

		for (int index = 0; index <= 5; index++) {
			int score = index * 10;
			System.out.println("Adding " + score);
			scoreRecord.addScore(score);
		}

	}

}

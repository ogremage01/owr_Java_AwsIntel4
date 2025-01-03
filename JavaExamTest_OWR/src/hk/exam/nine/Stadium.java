package hk.exam.nine;

import java.util.List;

public class Stadium implements GamePlay {

	public Stadium() {
	}

	protected void firstPlayerGameSetting() {
		HitterPlayer hp1 = new HitterPlayer();
	}

	protected void secondPlayerGameSetting() {
		HitterPlayer hp2 = new HitterPlayer();
	}

	public void gamePlay() {

	}

	protected int resultStrikes(List<Integer> a, List<Integer> b) {
		return 1;//에러메시지 유발 방지

	}

	protected int resultBalls(List<Integer> a, List<Integer> b) {
		return 1;//에러메시지 유발 방지

	}

}

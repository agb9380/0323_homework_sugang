package kr.ac.kopo.day10.homework;

public class Dice implements Game {

	@Override
	public int startGame(int you) {

		int result = 0; // 승, 패 결과값 return
		int me = (int) (Math.random() * 6) + 1; // 1~6 컴퓨터의 난수

		if (you == me) {
			System.out.println("You Win");
			result = getWin();
		} else {
			System.out.println("You Lose");
			result = getLose();
		}
		return result;
	}

	public int getWin() {
		return 1;
	}

	public int getLose() {
		return 0;
	}

}

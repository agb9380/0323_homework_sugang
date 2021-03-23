package kr.ac.kopo.day10.homework;

public class ScissorsRockPaper implements Game { // 클래스가 인터페이스를 상속할 때는 implements

	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	@Override // 인터페이스를 상속받는 하위클래스는 추상 메소드를 반드시 오버라이딩 해야함
	public int startGame(int you) {

		int result = 0; // 승,패,무 결과값 return
		int me = (int) (Math.random() * 3) + 1; // 컴퓨터의 난수

		if (you == SCISSOR) {
			if (me == PAPER) {
				System.out.println("You Win"); // 내가 이겼음 1 반환
				result = getWin();
			} else if (me == ROCK) {
				System.out.println("You Lose"); // 내가 졌음 0 반환
				result = getLose();
			} else if (me == SCISSOR) {
				System.out.println("비겼습니다."); // 무승부한 횟수 세아리기 위해 비기면 -1 반환
				result = getDraw();
			}
		} else if (you == ROCK) {
			if (me == SCISSOR) {
				System.out.println("You Win");
				result = getWin();
			} else if (me == PAPER) {
				System.out.println("You Lose");
				result = getLose();
			} else if (me == ROCK) {
				System.out.println("비겼습니다.");
				result = getDraw();
			}

		} else if (you == PAPER) {
			if (me == SCISSOR) {
				System.out.println("You Lose");
				result = getLose();

			} else if (me == ROCK) {
				System.out.println("You Win");
				result = getWin();

			} else if (me == ROCK) {
				System.out.println("비겼습니다.");
				result = getDraw();

			}

		}
		return result;
	}

	public int getWin() {
		return 1;
	}

	public int getLose() {
		return 0;
	}

	public int getDraw() {
		return -1;
	}

}

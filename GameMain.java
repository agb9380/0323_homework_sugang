package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		// char형을 int형으로 전환해서 startGame으로 넘겨주기

		GameKind a = new GameKind();
		a.gameExe();

	}
}

class GameKind {

	private int num;
	Scanner sc = new Scanner(System.in);
	
	public void gameExe() {

		System.out.println("게임을 선택하세요 \n A. 가위바위보 \n B. 주사위 값 맞추기 \n C. 종료");
		String inputString = sc.nextLine();

		Game g; // implements도 상속관계라 묵시적 형변환 가능

		if (inputString == "A") {
			g = new ScissorsRockPaper();
			int you = getNum();
			g.startGame(you);
		} else if (inputString == "B") {

		} else if (inputString == "C") {
			// 종료
		} else {
			System.out.println("다시 입력하세요.");
			gameExe();
		}

	}

	public int getNum() {
		System.out.println("가위바위보 게임입니다.");
		System.out.println("가위바위보 중 하나를 선택하세요.\n(1:가위, 2:바위, 3:보");
		int you = sc.nextInt();
		sc.nextLine();
		return you;
	}
}
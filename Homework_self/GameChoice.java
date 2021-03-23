package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameChoice {

	Scanner sc = new Scanner(System.in);

	private int cntWin = 0;
	private int cntLose = 0;
	private int cntDraw = 0;

	public void gameExe() {

		int you; // startGame 매개변수에 전달할 int값
		int result = 0; // 반환되는 승,무,패

		System.out.println("게임을 선택하세요 \n A. 가위바위보 \n B. 주사위 값 맞추기 \n C. 종료");
		char inputString = sc.next().charAt(0);
		Game g; // implements도 상속관계라 묵시적 형변환 가능

		if (inputString == 'A') {
			g = new ScissorsRockPaper();
			you = getRps();
			// g.startGame(you); // startGame() 메소드의 리턴값이 저장됨, 가위바위보의 결과
			result = g.startGame(you); // 메소드가 한 번더 실행되면서 또 출력됨, 처음에 위에꺼랑 밑에꺼랑 둘 다 실행해서 결과 2번 나왔음
			if (result == 1) {
				cntWin++;
			} else if (result == 0) {
				cntLose++;
			} else if (result == -1) {
				cntDraw++;
			}
			gameExe(); // 게임 종류 다시 선택

		} else if (inputString == 'B') {

			g = new Dice();
			you = getDice();
			// g.startGame(you); 가위바위보 메소드와 동일한 문제였음. 리턴값 받으려고 메소드 2번 실행했음..
			result = g.startGame(you);
			if (result == 1) {
				cntWin++;
			} else if (result == 0) {
				cntLose++;

			} 
			gameExe(); // 게임 종류 다시 선택

		} else if (inputString == 'C') {
			System.out.println("게임을 종료합니다.");
			System.out.println("당신의 게임 전적은 " + cntWin + "승 " + cntLose + "패 " + cntDraw + "무 입니다.");
		} else {
			System.out.println("다시 입력하세요.");
			gameExe();
		}
	}

	public int getRps() {
		System.out.println("가위바위보 게임입니다.");
		System.out.println("가위바위보 중 하나를 선택하세요.\n(1:가위, 2:바위, 3:보)");
		int you = sc.nextInt();
		sc.nextLine();
		if (you <= 0 || you >= 4) { // 문자를 입력하는 경우는 에러 발생하면서 종료됨..
			System.out.println("다시 입력하세요.");
			you = getRps();
		}
		return you;
	}

	public int getDice() {
		System.out.println("주사위 값 맞추기 게임입니다.");
		System.out.println("주사위 값을 선택하세요(1~6의 값 중 하나)");
		int you = sc.nextInt();
		sc.nextLine();
		if (you <= 0 || you >= 7) {
			System.out.println("다시 입력하세요.");
			you = getDice();
		}
		return you;
	}

	public void print() {
		System.out.println("게임을 종료합니다.");

	}
}

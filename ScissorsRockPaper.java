package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class ScissorsRockPaper implements Game { // 클래스가 인터페이스를 상속할 때는 implements
	
	
	final static int SCISSOR=1; //가위
	final static int ROCK=2; //바위 
	final static int PAPER=3; //보
	
	Scanner sc =new Scanner (System.in);
	
	
	@Override // 인터페이스를 상속받는 하위클래스는 추상 메소드를 반드시 오버라이딩 해야함
	public int startGame(int you) {
	
		int me= (int)(Math.random()*3)+1; // 컴퓨터의 난수
		
		if (you == SCISSOR) {
			if (me == PAPER) {
				System.out.println("You Lose"); //컴퓨터야 너가 졌어
			}
			else if (me == ROCK) {
				System.out.println("You Win");
			}
			else if (me == SCISSOR) {
				System.out.println("비겼습니다.");
			}
		}else if (you == ROCK) {
			if(me == SCISSOR) {
				System.out.println("You Lose");
			}else if(me == PAPER) {
				System.out.println("You Win");
			}
			else if (me == ROCK) {
				System.out.println("비겼습니다.");
			}
			
			
		} else if(you == PAPER) {
			if(me == SCISSOR) {
				System.out.println("You Win");
			}else if(me == ROCK) {
				System.out.println("You Lose");
			}
			else if (me == ROCK) {
				System.out.println("비겼습니다.");
			}
			
			
		}
			
			
			
			
			
		}else if (you == PAPER) {
			
		}
		
		else {
			System.out.println("다시 입력하세요.");
			startGame(inputNum);
		}
		
		
		
//		return int형을 리턴해야함 
	}
}

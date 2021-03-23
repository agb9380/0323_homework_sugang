package s0323.inter02;

import java.util.Random;

public class ExecptionMain01 {

	public static void main(String[] args) {

		
		System.out.println("main start...");
		
		Random r = new Random();
		int num = r.nextInt(3); //0~2 난수 발생
		System.out.println("num: " + num);
		
		
		
		System.out.println(10 / num); // num이 0이 나오면, 오류가 발생해서 소프트웨어 종료됨 밑의 end가 출력이 안됨 -> main02로 넘어감
		
		System.out.println("main end...");
		
		
		
		
		
		
	}

}
package s0323.inter02;

import java.util.Random;

/*final*/ class Super{
	
	private /* final */ int MAX = 100;
	
	
	public /* final */ void info() {
		System.out.println("Super 클래스에서 정의된 메소드");
		MAX = 50; // final을 이용하면 변수에 다른 값을 할당할 수 없음
	}
}


class Sub extends Super{  // 상위 클래스 자체에 final을 붙이면 상속금지
	@Override
	public void info() {   // 상위 클래스의 info() 메소드에 final을 붙이면 오류 발생
		System.out.println("Sub 클래스에서 재정의된 메소드");
	}
}


class MyRandom extends Random { // 나만의 랜덤 클래스를 만들어보자
	
	/**
	 * bound가 10일 때 1~10사이의 난수를 추출
	 * @param bound 추출정수 범위
	 * @return 1~bound 사이의 난수
	 */
	
	@Override
	public int nextInt(int bound) {
		// TODO Auto-generated method stub
		return super.nextInt(bound) + 1;  // nextInt(100) 0~99  ex) nextInt(3) 0 1 2 여기다가 +1하면 1,2,3
	} 
	
	
}


//class MyString extends String{  string 클래스는 final 클래스 이기 때문에 변경불가
//	
//}


public class FinalMain {
	
	public static void main(String[] args) {
		/*
		 * 1~100사이의 난수를 발생시켜 출력하는 코드를 작성
		 */
		
		Random r = new MyRandom();
		int random = r.nextInt(3); //원래 있는 클래스를 상속받아서 내 마음대로 변경할 수 있음, r.nextInt(100)+ 1;  // nextInt(100)는 0~99 사이의 수가 나옴 여기서 +1 해야 1~100,
		System.out.println("추출된 정수: "+ random);
	}
}





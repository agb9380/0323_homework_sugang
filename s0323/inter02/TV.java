package s0323.inter02;

public interface TV { // 표준 만들기

	/* public static final */ int MAX_VOLUME_SIZE = 50; // 인터페이스로 공간 만들 수 없음!, 모든 변수는 상수로 인식해야함 public static final이
														// 생략되어있음
	int MIN_VOLUME_SIZE = 0;

	/* public abstract */ void powerOn();

	void powerOff();

	void channelUp();

	void channelDown();

	void soundUp();

	void soundDown();

	void mute();

//	void copyright() {   //인터페이스는 추상 메소드만 가능함
//		System.out.println("모든 기술은 TV협회에 귀속됩니다.");
//	} // 이런 copyright 메소드를 하나 추가하고 싶은데, 어떻게 할 수 있을까?, 인터페이스는 추상 메소드만 가져야함, 추상 메소드를 이런식으로 추가하면 구조 자체가 변경됨, 인터페이스도 일반 메소드를 가질 수 있게 1.8버전에 추가됨

	default void copyright() { // 인터페이스에서 구현된 일반 메소드를 활용할 수 있도록함, 여기 디폴트는 접근제한자가 아님, 일반 메소드를 인터페이스에서 이용하자라는
								// 목적으로 나온거는 아님, 유지보수 할 때 기능이 뭔가 더 추가되어야하는데, 이 기능추가로 인해 시스템 전체가 바뀌는게 싫어서 나온게 바로 default 키워드, 인터페이스는 추상 메소드만을 가지는 것!, 설계할 때부터 default 키워드를 사용하지 않는다!
		System.out.println("모든 기술은 TV협회에 귀속됩니다.");
	}

}

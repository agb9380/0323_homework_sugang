package s0323;

public class LGTV {

	public LGTV() {
		System.out.println("LGTV를 구매하였습니다.");
	}

	// 볼륨 조절이 다른 모델과 동일하다는 보장이 없음

	public void turnOn() {
		System.out.println("TV전원 ON");
	}

	public void turnOff() {
		System.out.println("TV전원 OFF");
	}

	public void channelUp() {
		System.out.println("channelUp UP...");
	}

	public void channelDown() {
		System.out.println("channelUp DOWN...");
	}

	public void soundDown() {
		System.out.println("Sound Down...");
	}

	public void soundUp() {
		System.out.println("Sound Up...");
	}

}
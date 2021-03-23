package s0323.inter02;

public class LGTV implements TV {
	
	
	public LGTV() {
		System.out.println("LGTV 구매완료");
	}
	
	@Override
	public void powerOn() {
		System.out.println("TV전원을 킵니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("TV전원을 끕니다.");

	}

	@Override
	public void channelUp() {
		System.out.println("채널 UP...");

	}

	@Override
	public void channelDown() {
		System.out.println("채널 DOWN...");

	}

	@Override
	public void soundUp() {
		System.out.println("볼륨 Up...");
	}

	@Override
	public void soundDown() {
		System.out.println("볼륨 Down...");
	}

	@Override
	public void mute() {
		System.out.println("Mute");

	}

}

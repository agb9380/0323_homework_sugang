package s0323.inter02;


//TV라는 인터페이스를 기반으로 만들것임, 오버라이드 된 것(TV의 추상 메소드를 오버라이드 해야함!!) 추가해야함, 옆에 오류난거 add붙이면 자동으로 완성, 그러나 선택적으로 오버라이드 하고 싶을 때는 소스-> 오버라이드/임플레먼트

public class SamsungTV implements TV {

	private String modelName;
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private boolean muteToggle;
	private int currentVolumeSize;
	
	
	public SamsungTV() {  // 생성자도 만들어줌
		System.out.println("삼성TV 구매 완료");
		modelName="삼성TV";
		power= false;
		volumeSize= 10;
		channelNo=3;
		muteToggle = false;
	}
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("TV전원 ON");
		info(); //채널번호,음량크기가 나옴
	}

	@Override
	public void powerOff() {
		power= false;
		System.out.println("TV전원 OFF");

	}

	@Override
	public void channelUp() {
		System.out.println("channel UP...");
		channelNo = ++ channelNo % 100 + 1;  // 채널번호가 100이면 ++ 되서 101이
		info();

	}

	@Override
	public void channelDown() {
		System.out.println("channel DOWN...");
		channelNo--;
		if (channelNo == 0)
			channelNo = 100;
		info();

	}

	@Override
	public void soundUp() {
		System.out.println("Sound Up...");
		if(muteToggle) // true인 경우, 현재 음소거 중임, 사운드 버튼을 올리면 음소거 해제됨
			currentVolumeSize = volumeSize;
			muteToggle = false; //mute를 해제함
			
		if (volumeSize< TV.MAX_VOLUME_SIZE)
			volumeSize++;
		info();
	}

	@Override
	public void soundDown() {
		System.out.println("Sound Down...");
		if (volumeSize > TV.MIN_VOLUME_SIZE)
			volumeSize--;
		info();
	}

	@Override
	public void mute() {
		System.out.println("음소거");
		
		if(muteToggle) { //true일 때 들어감
			System.out.println("음소거 해제...");
			muteToggle = false;
			volumeSize = currentVolumeSize ; // 원래값으로 돌아와야하는데 모르니까 이것을 저장하기 위한 새로운 변수 추가
		}else {
			System.out.println("음소거 중...");
			currentVolumeSize = volumeSize;
			volumeSize = TV.MIN_VOLUME_SIZE;
			muteToggle= true;
		}
		//muteToggle = !muteToggle;
		
		info();
		
//		volumeSize = TV.MIN_VOLUME_SIZE; // mute 기능을 사용하기 위해 주석처리
//		info();

	}
	
	private void info() {  //info() 메소드는 외부에서 호출할 필요가 없어서 'private' 으로 만들어도됨
		System.out.println("채널번호: " + channelNo+", 음량크기: "+ volumeSize);
	}


	
	
	
}

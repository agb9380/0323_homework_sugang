package s0323.inter02;

import s0323.LGTV;

public class UserMain {

	public static void main(String[] args) {
		
//		List list =new ArrayList();
		
		
		TV tv = new SamsungTV(); // TV의 인터페이스를 상속?받고 있기 때문에 표현가능 
//		TV tv = new LGTV(); // 이게 바로 다형성
		
		
		tv.powerOn();
		tv.channelDown();
		tv.soundUp();
		tv.channelDown();
		tv.soundDown();
		tv.mute();
		tv.mute();
		tv.soundUp();
		tv.powerOff();
		
		
//		LGTV lg = new LGTV();
//		lg.powerOn();
//		lg.channelDown();       
//		lg.channelUp();			
//		lg.soundUp();		
//		lg.soundUp();
//		lg.powerOff();
	}

}

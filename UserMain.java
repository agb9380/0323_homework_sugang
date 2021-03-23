package s0323;

public class UserMain {

	public static void main(String[] args) { //리모콘을 이용해서 TV를 제어함
		
		
		SamsungTV sam=new SamsungTV();
		
		sam.powerOn();
		sam.channelDown();
		sam.channelUp();
		sam.volumeUp();
		sam.volumeDown();
		sam.powerOff();
		
		
//		LGTV lg = new LGTV();
//		lg.powerOn();
//		lg.channelDown();       //이렇게 했더니 에러가 생긴다. 삼성과 엘지가 서로 메소드가 다르기때문임!!, 삼성 
//		lg.channelUp();			// 삼성 리모콘으로 엘지 TV를 조절할 수 없음 항상 같은 브랜드 구매.. => 메소드이름을 동일하게 하면 해결할 수 있음
//		lg.volumeUp();			// 인터페이스를 활용해야함, 상속을 받아있는 상태인데, 다중 상속의 문제가 생길 수 있음, 다중 상속이 가능한 인터페이스를 만들어야함
//		lg.volumeDown();
//		lg.powerOff();
		
		
		
		
	}

}

package s0323.inter02;

import java.util.Random;

public class ExecptionMain02 {

	public static void main(String[] args) {

		System.out.println("main start...");

		Random r = new Random();
		int num = r.nextInt(3); // 0~2 난수 발생
		System.out.println("num: " + num);

		
		String str =null;
		
		
		
		try {
			System.out.println(10 / num); // 예외가 발생할 가능성이 있는것
			
			System.out.println("첫 번째 문자: " + str.charAt(0)); // str이 가리키는 문자열이 없음.. 그래서 오류 발생 => null point exeception
			
		} 
//		catch (ArithmeticException ae) { // ArithmeticException 오류가 발생하면 catch가 처리하겠음 ArithmeticException은 num이 0이 나왔을 때 콘솔에 오류로 뜬 것
////			System.out.println("이유: "+ ae.getMessage()); // 발생한 예외를 ArithmeticException ae가 알고있음 => ae.getMessage() 
//			ae.printStackTrace();  // 예외에 대해서 구체적으로 알 수 있음, 어떤 에러가 어디서 발생했는지
//		
//		} catch (NullPointerException ne ) {  // 멀티 catch 문장 가능, num이 0이 나오면 ArithmeticException이 나옴
//			System.out.println("NullPinterException 진입...");  
//		}
		

		
		//		catch (ArithmeticException | NullPointerException e) // 둘 중 하나의 예외가 발생하면 변수e가 기억하겠다는 것, 이렇게 쓰는것도 가능함, 수많은 예외가 있는데??... 
		// 		모든 예외를 처리할 수 있도록 하는게 바로 묵시적 형변환 Exception e
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("main end...");

	}
}


//예외가 ArithmeticException만 발생할까?? 당연히 여러 개 발생할 수 있음
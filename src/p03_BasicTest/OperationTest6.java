package p03_BasicTest;

//비트 연산자 테스트

public class OperationTest6 {
	public static void main(String[] args) {
		int x = 8;
		int y = 3;
		int result = 0;
		boolean bResult = false;
		
		/* 비트로 변경
		 * 8 : 00000000 00000000 00000000 00001000
		 * 3 : 00000000 00000000 00000000 00000011
		 */
		
		//&
		result = x & y;
		System.out.println("x & y = " + result);
		bResult = true & false;
		System.out.println("true & false = "+ bResult);
	
		//|
		result = x | y;
		System.out.println("x | y = "+result);
		bResult = true | false;
		System.out.println("true | false = "+bResult);
		
		//^ : XOR, 두 피 연산자의 대응되는 비트에서 서로 같은 경우에는 0을, 다른 경우에는 1 반환
		result = x ^ y;
		System.out.println("x ^ y = " + result);
		bResult = true ^ false;
		System.out.println("true ^ false = "+ bResult);
		
		
	}
}

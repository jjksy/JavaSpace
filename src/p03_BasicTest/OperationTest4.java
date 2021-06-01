package p03_BasicTest;

//논리 연산자 테스트

public class OperationTest4 {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		boolean result = false;

		result = x < y && y >= 200;
		System.out.println("x<y&&y>=200  = " + result);

		result = x < y && y < 200;
		System.out.println("x<y&&y<200 =" + result);

		result = x > y && y++ > 200;
		System.out.println("x>y&&y++>200 = " + result);
		System.out.println("y = " + y);

		result = x < y || y >= 200;
		System.out.println("x < y || y >= 200 = " + result);

		result = x < y || y >= 200;
		System.out.println("x<y || y>200 = " + result);
		
		result = x>y || y++ >200;
		System.out.println("x>y || y++>200 = "+result);
		System.out.println("y = "+y);
		
		result = x<y || y++ >200;
		System.out.println("x<y || y++ >200 = "+result);
		System.out.println("y = "+y);
		
		result = !(x>y)	;
		System.out.println("!(x>y) = "+result);

	}
}

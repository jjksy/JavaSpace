package p03_BasicTest;

//비교연산자 테스트

public class OperationTest3 {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		boolean result = false;

		// >
		result = x > y;
		System.out.println("x>y = true");
		// <
		result = x < y;
		System.out.println("x<y = false");
		// >=
		result = x >= y;
		System.out.println("x>=y = true");
		// <=
		result = x <= y;
		System.out.println("x<=y = false");
		// ==
		result = x == y;
		System.out.println("x==y = false");
		// !=
		result = x != y;
		System.out.println("x<=y = true");

	}
}

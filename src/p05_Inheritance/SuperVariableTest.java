package p05_Inheritance;

//상위 클래스의 변수 호출
class Sawon3 {
	String name = "James";
}

class Sales3 extends Sawon3 {
	String name = "BetaGo";

	String displayInfo() {
		String name = "AlphaGo";
		return name;
	}

	String displayInfoThis() {
		String name = "AlphaGo";
		return this.name;
	}

	String displayInfoSuper() {
		String name = "AlphaGo";
		return super.name;
	}
}

public class SuperVariableTest {
	public static void main(String[] args) {
		Sales3 sales3 = new Sales3();
		System.out.println(sales3.displayInfo());
		System.out.println(sales3.displayInfoThis());
		System.out.println(sales3.displayInfoSuper());
	}

}

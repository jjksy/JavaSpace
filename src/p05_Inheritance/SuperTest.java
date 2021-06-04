package p05_Inheritance;
//super & super()

//super 레퍼런스 변수 사용하기

class Sawon {
	String name;
	String dept;
	int salary;

	String displayInfo() {
		//여기 작성
	}
}

class Sales extends Sawon {
	int commition;

	/*
	 * String displayInfo() { return "이름: " + name + ", 부서 :" + dept + ", 연봉 :" +
	 * salary + ", commition = " + commition; }
	 */
	String displayInfo() {
		//여기 작성
	}
}

public class SuperTest {
	public static void main(String[] args) {
		Sales sales = new Sales();
		System.out.println(sales.displayInfo());
	}
}

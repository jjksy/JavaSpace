package p05_Inheritance;
//super & super()

//super 레퍼런스 변수 사용하기

class Sawon {
	String name;
	String dept;
	int salary;

	public Sawon(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	String displayInfo() {
		
		return name + dept + salary;
		
	}
}

class Sales extends Sawon {
	public Sales(String name, String dept, int salary) {
		super(name, dept, salary);
		// TODO Auto-generated constructor stub
	}

	int commition;

	/*
	 * String displayInfo() { return "이름: " + name + ", 부서 :" + dept + ", 연봉 :" +
	 * salary + ", commition = " + commition; }
	 */

}

public class SuperTest {
	public static void main(String[] args) {
		Sales sales = new Sales(null, null, 0);
		System.out.println(sales.displayInfo());
	}
}

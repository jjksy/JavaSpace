package p05_Inheritance;
//super용도 살펴보기

class Sawon2 {
	String name;
	String dept;
	int salary;

	public Sawon2(String name, String dept, int salary) {
		super();
		this.name = "James";
		this.dept = "개발팀";
		this.salary = 30000000;
	}

	String displayInfo() {
		return "이름 : "+ name + ", 부서 : " + dept + ", 연봉:" + salary;
	}

}

class Sales2 extends Sawon2 {
	int commition = 7000000;

	public Sales2(String name, String dept, int salary, int commition) {
		super(name, dept, salary);
	}
	String displayInfo() {
		return super.displayInfo() + ", 수당 : " + commition;
	}

}

public class SuperConstructorTest {
	public static void main(String[] args) {
		Sales2 sales2 = new Sales2(null, null, 0, 0);
		System.out.println(sales2.displayInfo());
	}

}

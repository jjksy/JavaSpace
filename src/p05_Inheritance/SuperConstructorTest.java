package p05_Inheritance;
//super용도 살펴보기

class Sawon2 {
	String name;
	String dept;
	int salary;

	public Sawon2(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	String displayInfo() {
		return name + dept + salary;
	}

}
class Sales2 extends Sawon2{

	public Sales2(String name, String dept, int salary) {
		super(name, dept, salary);
	}
	
}

public class SuperConstructorTest {

}

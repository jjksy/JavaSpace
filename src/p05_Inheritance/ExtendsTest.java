package p05_Inheritance;

//상속기능 사용하기
class Parent{
	int parentVar = 10;
	void nth() {
		System.out.println("parent Method");
	}
	
}
class Child extends Parent{
	int childVar = 20;
	void sth() { 
		System.out.println("child Method");
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("child.parentVar = " + c.parentVar);
		System.out.println("child.childVar ="+ c.childVar);
		c.nth();
		c.sth();
	}
}

package p05_Inheritance;
//Overriding

//자식클래스 에서 메소드를 재정의 한 경우

class OverridingParent {
	void parentMethod() {
		System.out.println("parent Method");
	}
}

class OverridingChild extends OverridingParent {
	void parentMethod() {
		System.out.println("Overriding method");
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();
	}
}

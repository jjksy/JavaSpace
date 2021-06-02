package p05_Inheritance;
//상위클래스를 상속받은 클래스를 다른 클래스가 다시 상속한 경우
class Super{
	int x = 90;
	void superMethod() {
		System.out.println("super Method");
	}
}
class Sub extends Super{
	int y = 10;
	void subMethod() {
		System.out.println("sub Method");
	}
}
class Subsub extends Sub{
	int z = 20;
	void subSubMethod() {
		System.out.println("subSub Method");
	}
}
public class ExtendsTest2 {
	public static void main(String[] args) {
		Subsub ss = new Subsub();
		System.out.println("ss.x =" + ss.x);
		System.out.println("ss.y ="+ss.y);
		System.out.println("ss.z ="+ss.z);
		
		ss.subMethod();
		ss.subMethod();
		ss.subSubMethod();
	}
}

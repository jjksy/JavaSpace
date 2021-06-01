package p01_ObjectTest01_Method;

public class VariableArgument {
	//JDK 1.5에서 인자의 개수를 가변적으로 받을 수 있는 방식이 추가됨.
	//가변적으로 넘어온 인자들은 배열 타입으로 받아진다
	
	void printInfo(String ...infos) {
		if (infos.length != 0) {
			for (int i = 0; i < infos.length; i++) {
				System.out.println(infos[i]);
			}
		}else {
			System.out.println("인자가 없네요");
		}
	}
	public static void main(String[] args) {
		VariableArgument va = new VariableArgument();
		System.out.println("인자 없이");
		va.printInfo();
		System.out.println("인자 하나");
		System.out.println("홍길동");
		System.out.println("직업능력개발");
		System.out.println("인자 세 개");
		System.out.println("홍길동");
		System.out.println("직업 능력 개발");
		System.out.println("1억");
	}
}
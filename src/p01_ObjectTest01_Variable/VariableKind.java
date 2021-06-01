package p01_ObjectTest01_Variable;
//변수 종류 테스트
public class VariableKind {
	//인스턴스 멤버 변수
	int memVar;
	//static 멤버 변수
	static int staticVar;

	public static void main(String[] args) {
		//로컬변수
		int localVar;
		VariableKind vk1 = new VariableKind();
		System.out.println("vk1.memVar = " + vk1.memVar);
		System.out.println("vk1.staticVar = "+ vk1.staticVar);
		System.out.println("VariableKind.staticVar"+VariableKind.staticVar);
		System.out.println("staticVar = " + staticVar);
		VariableKind vk2 = new VariableKind();
		vk2.staticVar = 20;
		System.out.println("vk2.staticVar = "+vk2.staticVar);
	}
}

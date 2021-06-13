package p08_NestedClass_test1;

public class NestedClassEx02 {
	public static void main(String[] args) {
		PiggyBank pb1 = new PiggyBank();
		PiggyBank pb2 = new PiggyBank();
		
		pb1.slot.put(10);
		pb2.slot.put(1000);
		System.out.println("첫번째 저금통 : " + pb1.total);
		System.out.println("두번째 저금통 : " + pb2.total);
	}
}

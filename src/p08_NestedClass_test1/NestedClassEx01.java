package p08_NestedClass_test1;

public class NestedClassEx01 {
	public static void main(String[] args) {
		PiggyBank pb = new PiggyBank();
		PiggyBank pb2 = new PiggyBank();
		PiggyBank pb3 = new PiggyBank();
		//첫번재 저금통 : 0
		//두번째 저금통 : 100
		//세번째 저금통: 0
		
		pb2.slot.put(100);
		System.out.println("첫번째 저금통 : " + pb.total);
		System.out.println("두번째 저금통 : " + pb2.total);
		System.out.println("세번째 저금통 : "+pb3.total);
	}
}

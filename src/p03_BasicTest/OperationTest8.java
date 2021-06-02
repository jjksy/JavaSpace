package p03_BasicTest;

//복합 연산자 테스트

public class OperationTest8 {
	public static void main(String[] args) {
		int x = 5;
		int result = 0;
		
		result = x += 5;
		System.out.println("x+=5 =" + result);
		
		result = x +=3.1;
		System.out.println("x+=3.1="+result);
		
		result = x*=2;
		System.out.println("x*2="+result);
		
		result = x/=2;
		System.out.println("x/=2="+result);
		
		result = x-= 5;
		System.out.println("x-=5 = "+result);
		
		result = x %=2;
		System.out.println("x%=2 ="+result);
	}
}

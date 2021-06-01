package p03_BasicTest;

//증감 연산자 테스트

public class OperationTest5 {
	public static void main(String[] args) {
		int var_inc = 1;
		int var_dec = 1;
		int result = 0;
		
		//++
		result = var_inc++;
		System.out.println("result = "+result);
		System.out.println("var_inc = "+ var_inc);
		System.out.println("-------------------------");
		
		result = ++var_inc;
		System.out.println("result =" +result);
		System.out.println("var_inc = "+var_inc);
		System.out.println("------------------------");
		
		//--
		result = var_dec--;
		System.out.println("result =" +result);
		System.out.println("var_dec = " + var_dec);
		System.out.println("-----------------------");
		
		result = --var_dec;
		System.out.println("result ="+result);
		System.out.println("var_dec ="+var_dec);
	}
}

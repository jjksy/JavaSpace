package p01_ObjectTest01_ClassAndObject;

public class AirConUse {
	public static void main(String[] args) {
		//객체 생성
		AirCon airCon = new AirCon();
		
		
		//변수 사용
		airCon.color = "white";
		airCon.temp = 10;
		airCon.price = 10000;
		
		//메소드 사용
		airCon.tempUp();
		System.out.println("airCon.temp = " + airCon.temp +
				", airCon.color = " + airCon.color + 
				", airCon.price = " + airCon.price + "원");
		airCon.powerOn();
		airCon.powerOff();
		airCon.tempDown();
		
		System.out.println("airCon.temp = " + airCon.temp +
				", airCon.color = " + airCon.color + 
				", airCon.price = " + airCon.price + "원");
	}
}

package p01_ObjectTest01_ClassAndObject;

public class AirCon {
	//변수 정의
	String company;
	String color;
	int price;
	int size;
	int temp;
	
	//메소드 정의
	void powerOn() {
		System.out.println("Power on");
	}
	void powerOff() {
		System.out.println("Power off");
	}
	void tempUp() {
		temp++;
	}
	void tempDown() {
		temp--;
	}
}

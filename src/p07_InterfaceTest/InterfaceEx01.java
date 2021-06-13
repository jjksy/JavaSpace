package p07_InterfaceTest;

public class InterfaceEx01 {
	public static void main(String[] args) {
		SeperateVolume obj1 = new SeperateVolume("8654개", "개미", "베르");
		AppCDInfo obj2 = new AppCDInfo("2018-9001", "Spring");
		
		obj1.checkOut("홍홍", "20210611");
		obj2.checkOut("박삼수", "20210605");
		obj1.checkIn();
		obj2.checkIn();
		
	}
}

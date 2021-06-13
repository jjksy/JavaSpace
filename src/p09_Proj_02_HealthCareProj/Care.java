package p09_Proj_02_HealthCareProj;

import java.util.Scanner;

public class Care {
	Scanner sc = new Scanner(System.in);

	String name; //이름
	int ki, we, age, tel, c; //키,몸무게,나이,전화번호,체중측정결과값
	
	
	
	public void in() {	//정보 입력

		System.out.println("이름 : ");
		name = sc.next();
		System.out.println(name+"님의 키 : ");
		ki = sc.nextInt();
		System.out.println(name+"님의 몸무게 : ");
		we = sc.nextInt();
		System.out.println(name+"님의 나이 : ");
		age = sc.nextInt();
		System.out.println(name+"님의 전화번호 뒷자리 : ");
		tel = sc.nextInt();
		
	}
	public void prn() {//입력된 정보 출력
		System.out.println("[회원 정보 출력]");
		System.out.println("이름 : "+name);
		System.out.println(name+"님의 키 : "+ki);
		System.out.println(name+"님의 몸무게 : "+we);
		System.out.println(name+"님의 나이 : "+age);
		System.out.println(name+"님의 전화번호 뒷자리 : "+tel);
		
	}
	public int jung() {//체중 측정하기
		System.out.println("[회원 비만도 출력]");
		//비만도 계산 작성
		//과체중입니다. 정상체중입니다.저체중입니다 >> 조건문
		double a = (ki - 100) * 0.9;
		if(we > a) {
			System.out.println("과체중");
			c = (int) (we -a);
		}else if(we < a) {
			System.out.println("저체중");
			c = (int) (a-we);
		}else {
			System.out.println("표준체중");
		}
		return c;
	}
	
	
}
	

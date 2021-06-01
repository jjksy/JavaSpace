package p02_StudentSumAvg02;

import java.util.Scanner;

public class Teacher {
	//클래스 변수
	Student s = new Student();
	Scanner sc = new Scanner(System.in);
	
	
	//생성자
	
	public Teacher() {

	}
	
	//학생 정보 입력
	public void inPut() {
		
		System.out.println("학생 이름 입력 :");
		s.setName(sc.next());
		System.out.println(s.getName()+"의 국어 점수");
		s.setKor(sc.nextInt());
		System.out.println(s.getName()+"의 영어 점수");
		s.setEng(sc.nextInt());
		System.out.println(s.getName()+"의 수학 점수");
		s.setMath(sc.nextInt());
		
		
		System.out.println("========입력완료=======");
		
		
	}
	//합계 sum
//	public void sum() {
//		System.out.println(s.getEng()+s.getKor()+s.getMath());
//	
//	}
	public int sum() {
		int sum = s.getEng()+s.getKor()+s.getMath();
		return sum;
	}

	
	
	//평균 avg
	public int avg(int no) {
		int avg = no/3;
		return avg;
	}
}

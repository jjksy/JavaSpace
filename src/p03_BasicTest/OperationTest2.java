package p03_BasicTest;

import java.util.Scanner;

//총점, 평균 구하기 예제

public class OperationTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int avg = 0;
		
		System.out.println("Kor: ");
		int kor = sc.nextInt();
		System.out.println("Eng: ");
		int eng = sc.nextInt();
		System.out.println("Sci: ");
		int sci = sc.nextInt();
		
		total = kor + eng + sci;
		avg = total/3;

		System.out.println("total = " + total);
		System.out.println("avg = " + avg);
	}
}

package p02_StudentSumAvg02;

import java.util.Scanner;

public class SchoolMain {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 총점 출력");
			System.out.println("3. 학생 평균 출력");
			System.out.println("4. 프로 그램 종료");

			int input = sc.nextInt();
			if (input == 1) {
				t.inPut();
			} else if (input == 2) {
				System.out.println(t.sum());
			} else if (input == 3) {
				System.out.println(t.avg(t.sum()));
			} else if (input == 4) {
				System.out.println("종료");
				break;
			} else {
				break;
			}

		}
	}
}

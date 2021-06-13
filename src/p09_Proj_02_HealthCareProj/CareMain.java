package p09_Proj_02_HealthCareProj;

import java.util.Scanner;

public class CareMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 몇명인지에 따라 몇 번 반복인지 보여줘?
		System.out.println("회원 수 입력 : ");

		// 입력 받은 회원 수를 i에 저장해서 i만큼 반복 > 입력 폼 i개 보여주기, 출력 폼 i개 출력하기
		Care c[] = new Care[sc.nextInt()]; // 매우 중요

		boolean flag = true;

		while (flag) {
			// 반복
			System.out.println("번호 입력 (1.정보입력   2.정보출력   3.비만도 출력   4.종료 : )");
			int num = sc.nextInt();

				if (num == 1) {
					System.out.println("[회원 정보 입력]");
					for (int i = 0; i < c.length; i++) {
						c[i] = new Care();
						
						c[i].in(); // 입력 폼 출력
					}

				} else if (num == 2) {
					// prn()
					for (int i = 0; i < c.length; i++) {		
						c[i].prn();
					}

				} else if (num == 3) {
					// jung()
				for (int i = 0; i < c.length; i++) {										
					c[i].jung();
				}
				} else if (num == 4) {
					System.out.println("[종료]");
					break;
				} else {
					System.out.println("[다시선택]");
				}
			}
		}

//		// 조건문으로 .. > 1 : in();, 2: prn(); 3: jung();
//		in(); // 정보입력
//		prn(); // 입력된 정보 출력
//		jung(); // 체중 측정
	}


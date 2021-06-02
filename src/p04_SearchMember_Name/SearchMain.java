package p04_SearchMember_Name;
//사용자로부터 이름을 입력받는 Main클래스

//이름으로 검색 예제
import java.util.Scanner;

public class SearchMain {
	public static void main(String[] args) {
		// 객체 생성
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		SearchService ss = new SearchService();
		
	
		
		do {
			System.out.println("검색할 회원 이름을 입력하세요");
			
			//입력
			String name = sc.next();
			boolean result = ss.searchMember(name);
			
			if(!result) {
				
				System.out.println("해당 회원이 없습니다");
			}break;
			
		}while(true);
//		sc.close();
	}
}

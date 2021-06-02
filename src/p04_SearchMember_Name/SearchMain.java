package p04_SearchMember_Name;
//사용자로부터 이름을 입력받는 Main클래스

//이름으로 검색 예제
import java.util.Scanner;

public class SearchMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SearchService sv = new SearchService();// 기본생성자 실행
		do {
			System.out.println("검색할 회원이름을 입력하세요?");
			String name = sc.next();// 홍길동
			boolean searchResult = sv.searchMember(name);// true
			if (searchResult)
				break;
			System.out.println("해당 회원이 없습니다.");
		} while (true);
		sc.close();
	}

}

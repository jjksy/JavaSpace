package p04_SearchMember_Name;

//회원 이름으로 배열 객체에서 회원을 검색하는 실질적인 기능이 정의되는 클래스
public class SearchService {
	Member member = new Member();

//	public SearchService() {
//		"홍길동", 167, 77, "대한민국"
//		"James",187, 67, "미국"
//		"다나까", 166,57,"일본"
//		"마윈", 177,80,"중국"
//		"인도인",199,88,"인도"
//	}

	boolean searchMember(String name) {
		boolean searchResult = false;
		return searchResult;
		

	}

// return searchResult;
//}

private void printInfo(/*여기도 써야함..*/) {
	System.out.println(member.getName() + "으로 찾은 결과");
	System.out.println("이름 : "+member.getName());
	System.out.println("신장 : "+member.getHeight());
	System.out.println("몸무게 : "+member.getWeight());
	System.out.println("국가 : " + member.getNation());
	
}
}

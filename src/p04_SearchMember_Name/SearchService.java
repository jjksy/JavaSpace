package p04_SearchMember_Name;


//회원 이름으로 배열 객체에서 회원을 검색하는 실질적인 기능이 정의되는 클래스
public class SearchService {
	Member[] member = new Member[5];

	public SearchService() {
		member[0]= new Member("홍길동", 167, 77, "대한민국");
		member[1]= new Member("James", 187, 67, "미국");
		member[2]= new Member("다나까", 166, 57, "일본");
		member[3]= new Member("마윈", 177, 80, "중국");
		member[4]= new Member("간디", 199, 77, "인도");
	}

	boolean searchMember(String name) {//name: scanner입력:홍길동
		boolean searchResult = false;//true
		for(int i=0; i<member.length; i++)//5
			if(member[i].getName().equals(name)) {//배열(홍길동) == 스캐너(홍길동)
				printInfo(member[i]);//m[0]:주소값
				searchResult= true;
	}

 return searchResult;
}

private void printInfo(Member member) {
	System.out.println(member.getName() + "으로 찾은 결과");
	System.out.println("이름 : "+member.getName());
	System.out.println("신장 : "+member.getHeight());
	System.out.println("몸무게 : "+member.getWeight());
	System.out.println("국가 : " + member.getNation());
	
}
}

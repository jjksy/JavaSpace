package p07_InterfaceTest;

public class AppCDInfo extends CDInfo implements Lendable{
	String borrower;
	String checkOutDate;
	byte state;

	public AppCDInfo(String registerNo, String title) {
		super.setRegisterNo(registerNo);
		super.setTitle(title);
	}

	@Override
	public void checkOut(String borrower, String date) {
		this.borrower = borrower;
		this.checkOutDate = date;
		System.out.println(this.title+"가 대출되었습니다");
		System.out.println("대출인 " + this.borrower);
		System.out.println("대출일 " + this.checkOutDate);

	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		
		System.out.println(this.title+"가 반납되었습니다");
	}

}

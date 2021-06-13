package p07_InterfaceTest;

public class SeperateVolume implements Lendable{
	String requestNo; 
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	
	public SeperateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		this.borrower = borrower;
		this.checkOutDate = date;
		System.out.println(this.bookTitle+"가 대출되었습니다");
		System.out.println("대출인 " + this.borrower);
		System.out.println("대출일 " + this.checkOutDate);
		
	}
	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		System.out.println(this.bookTitle+"가 반납되었습니다");
	}
	
	
}

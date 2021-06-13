package p07_InterfaceTest;

public interface Lendable {
	//대출, 반납
	public void checkOut(String borrower, String date);
	public void checkIn();
}

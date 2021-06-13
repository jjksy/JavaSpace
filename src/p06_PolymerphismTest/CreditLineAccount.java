package p06_PolymerphismTest;

public class CreditLineAccount extends Account{
	public CreditLineAccount(String accountNo, String ownerName, int balance, int i) {
		super(accountNo, ownerName, balance);
		// TODO Auto-generated constructor stub
	}



	public int creditLine;
	
	
	
	//인출한다 기능을 다시 구현하는 메소드
	public int withdraw(int amount) throws Exception{
		return amount;
		
		
	}
}

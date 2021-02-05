package customer.beans;

public class Account {
	private int accountId;
	private double totalPurchase;
	
	public Account(int accountId, double totalPurchase) {
		this.accountId = accountId;
		this.totalPurchase = totalPurchase;
	}
	
	public int getAccountId() {
		return accountId;
	}
	
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public double getTotalPurchase(){
		return totalPurchase;
	}
	
	public void setTotalPurchase(double totalPurchase) {
		this.totalPurchase = totalPurchase;
	}

}

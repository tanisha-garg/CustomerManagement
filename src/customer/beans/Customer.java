package customer.beans;

public class Customer {
	
	//Creating objects
	private int id;
	private String name;
	private Account account;
	
	//Creating parameterized constructor
	public Customer(int id, String name, Account account) {
		this.id = id;
		this.name = name;
		this.account = account;
	}
	
	public Customer() {
		this(-1, "null", null);
	}
	
	//Creating getter and setter methods
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
}

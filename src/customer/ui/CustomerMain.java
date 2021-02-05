package customer.ui;

import customer.beans.*;

public class CustomerMain {

	public static void main(String[] args) {
		CustomerMain project = new CustomerMain();
		project.start();
	}
	
	void start() {
		//Creating Array
		Customer customers[] = new Customer[4];
		
		//Creating Account object
		Account account1 = new Account(101, 100);
		Account account2 = new Account(102, 200);
		Account account3 = new Account(103, 600);
		Account account4 = new Account(104, 350);
		
		//Customer1
		Customer itCustomer1 = new ITCustomer(1, "Tanisha", account1, "hp");
		
		//Customer2
		Customer itCustomer2 = new ITCustomer(2, "Srinidhi", account2, "dell");
		
		//Customer3
		Customer creditCustomer1 = new CreditCustomer(3, "Pallavi", account3, 50);
		
		//Customer 4
		Customer creditCustomer2 = new CreditCustomer(4, "Sindhuja", account4, 80);
		
		//Inserting into Array
		customers[0] = itCustomer1;
		customers[1] = itCustomer2;
		customers[2] = creditCustomer1;
		customers[3] = creditCustomer2;
		
		for(int index = 0; index < customers.length; index++) {
			Customer iteratedCustomer = customers[index];
			if(iteratedCustomer instanceof ITCustomer) {
				ITCustomer itCustomer = (ITCustomer)iteratedCustomer;
				displayCustomer(itCustomer);
			}
			if(iteratedCustomer instanceof CreditCustomer) {
				CreditCustomer creditCustomer = (CreditCustomer)iteratedCustomer;
				displayCustomer(creditCustomer);
			}
		}
	}
	
	//Displaying Customer and Account details
	void displayBaseCustomer(Customer customer) {
		int id = customer.getId();
		String name = customer.getName();
		Account account = customer.getAccount();
		int accountId = account.getAccountId();
		double totalPurchase = account.getTotalPurchase();
		System.out.println("Customer "+id+" is "+name);
		System.out.println("Account id and Total Purchase is: "+accountId+" "+totalPurchase);
	}
	
	//Displaying ITCustomer information
	void displayCustomer(ITCustomer customer) {
		displayBaseCustomer(customer);
		String laptop = customer.getLaptop();
		System.out.println("Laptop Used: "+laptop+"\n");
	}
	
	//Displaying CreditCustomer information
	void displayCustomer(CreditCustomer customer) {
		displayBaseCustomer(customer);
		double creditTaken = customer.getCreditTaken();
		System.out.println("Credit Taken: "+creditTaken+"\n");
	}
	
	

}

package oop;

public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id,Customer customer,double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	public int getID() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer() {
		this.id = 0;
		this.customer = customer;
		this.amount = 0;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.id = 0;
		this.customer = null;
		this.amount = amount;
	}
//	public int getCustomerID() {
//		return id;
//	}

}

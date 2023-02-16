package oop;

public class ATMData {
	private String accountNumber;
	private String password;
	
	public ATMData(String id,String pass) {
		 accountNumber = id ;
		 password = pass ;
	}
	public String getId() {
		return accountNumber;
	}
	public String getPass() {
		return password;
	}

}

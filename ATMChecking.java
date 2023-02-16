package oop;
import java.io.*;
import java.util.*;

public class ATMChecking extends ATMData {
	private int money;
	
	public ATMChecking(String id,String pass,int money ) {
		super(id,pass);
		this.money = money;
	}
	public boolean checkBookBank() {
		try {
			Scanner fil = new Scanner(new File("ATMBookBank.txt"));
			boolean check = false;
		    System.out.println("Sorry, your id or password "
		    		+ "is wrong, or yur amount not enough.");
		    
	}
	public void show() {
		if() {
			
		}
		else if() {
			
		}
		else{
			
		}
	}
 
}

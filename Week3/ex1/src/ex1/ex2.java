package ex1;
import javax.swing.*;
import java.text.*;

public class ex2 {
	static final int pricePerson = 299;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberofCustomer = Integer.parseInt
				(JOptionPane.showInputDialog("How many customer per bill"));
		double totalPrice = numberofCustomer * pricePerson;
		int memberCard;
		memberCard = JOptionPane.showConfirmDialog(null,
				"Total Price is "+totalPrice + "baht."
		        +"\nDo you have a member card?");
		if (memberCard==0) {
			totalPrice = totalPrice*90/100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "  );
		}else if (memberCard == 1);	
		}
		

	}



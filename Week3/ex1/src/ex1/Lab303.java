package ex1;
import javax.swing.*;
import java.text.*;
import java.util.*;


public class Lab303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int bank1000;
		int bank500;
		int bank100;
		int sale1000;
		int sale500;
		int sale100;
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+balance+"\ninput moner to withdraw:"));
        
		bank1000 = number / 1000;
		sale1000 = number%1000;
		
		bank500 = sale1000 / 500;
		sale500 = sale1000%500;
		
		bank100 = sale500 / 100;
		sale100 = sale500%100;
	 	
		if(number > balance) 
        {
        	JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(number>=20000)
        {
        	JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more than 20000","ERROR",JOptionPane.ERROR_MESSAGE);

        }
        else if(sale100!=0)
        {
        	JOptionPane.showMessageDialog(null,"Error:Cannot withdraw "+number%100+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);

        }
        else
        {
        	JOptionPane.showMessageDialog(null,"You withdraw "+frm.format(number)+"\n1,000 = "+bank1000+"\n500 = "+bank500+"\n100 = "+bank100);

        }
	}

}

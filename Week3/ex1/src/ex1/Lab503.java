package ex1;
import javax.swing.*;

public class Lab503 {
	static int inputYear;
	public static void main(String[] args) {
		inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input Year"));
		//boolean chkYear = checkYear(inputYear);
		//System.out.println(chkYear);
		while(!checkYear(inputYear)) {
			inputYear = Integer.parseInt(
					JOptionPane.showInputDialog("Please input year between 1000-3000"+ "\nInput Year, again"));
		}
		/*if(isLeapYear(inputYear)) {
			JOptionPane.showInputDialog(null, inputYear+" is Leap Year");
		}else {
			JOptionPane.showInputDialog(null, inputYear+" is not Leap Year");
		}*/
		JOptionPane.showMessageDialog(null, inputYear+(
				isLeapYear(inputYear)
				?" Is  "
				:" Is not ")+'leap Year");

	}
	
	private static boolean isLeapYear(int inputYear2) {
		return false;
	}

	public static boolean checkYear(int year) {
		if((year%4==0) && ((year%100!=0)||(year%400==0))) {
			return true;
		}else {
			return false;
		}
		
	}

}

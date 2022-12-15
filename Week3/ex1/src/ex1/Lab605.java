package ex1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab605 {
	static String Even ="";
	static String Odd ="";

	static Scanner scan = new Scanner(System.in);
	static int number[] = new int[5];

	public static void main(String[] args) {
		for(int i=0;i<number.length;i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+":"));
		}
		showEven (number);
		showOdd(number);
	}
	public static void showEven(int[] nums) {
		
	
		
		for (int _nums : nums ) {
			if (_nums%2==0)
			Even += _nums + " ";
		
	}
		JOptionPane.showMessageDialog(null,"List of even numbe \n"+Even);
}
public static void showOdd(int[] nums) {
		
	
		
		for (int _nums : nums ) {
			if (_nums%2!=0)
			Odd += _nums + " ";
		
	}
		JOptionPane.showMessageDialog(null,"List of Odd numbe \n"+Odd);
}
}


/*int j =1;
		for (int sum=0;i<num.length();i++) {
			if (number[i]/2==0);
			System.out.print(number[1]);
		}*/
		//
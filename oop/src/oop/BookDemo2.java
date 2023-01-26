package oop;
import java.util.Scanner;
import javax.swing.*;


public class BookDemo2 {

//	private static final String break = null;
	private static String pageP;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = JOptionPane.showInputDialog("Input author name: ");
		String email = JOptionPane.showInputDialog("Input author e-mail: ");
		String title = JOptionPane.showInputDialog("Input book title: ");
		pageP = JOptionPane.showInputDialog("Input book page: ");
		int page = Integer.parseInt(pageP);
		int  page1 = JOptionPane.showConfirmDialog
				(null,"Is the page correct?",
						"Confirm",
						JOptionPane.YES_NO_OPTION);
		
		while(true) {
			if(page1 == JOptionPane.YES_OPTION) {
				break;
			}
			pageP = JOptionPane.showInputDialog("Input book page,again: ");
			Author1 auth = null;
			Book1 book =  new Book1(title,auth,page);
			JOptionPane.showMessageDialog(null,"Book Title : "+title+"\nAuthor name : "+name+"("+pageP+"page"+")"+"\nAuthor e-mail : "+email);
			page = Integer.parseInt(pageP);
			page1 = JOptionPane.showConfirmDialog
					(null,"Is the page correct?",
							"Confirm",
							JOptionPane.YES_NO_OPTION);
			
		}
		Author1 auth = null;
		Book1 book =  new Book1(title,auth,page);
		JOptionPane.showMessageDialog(null,"Book Title : "+title+"\nAuthor name : "+name+"("+pageP+"page"+")"+"\nAuthor e-mail : "+email);
		
		
		 
		
		

	}

}

import javax.swing.*;

public class Lab502 {
	static String email;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputEmail();
		
	}
	public static void inputEmail() {
		String answer="";
		do {
		email = JOptionPane.showInputDialog("Input your e-mail");
		checkEmail(email);
		answer = JOptionPane.showInputDialog("Continue[y||Y to continue]");
	   }while (answer.equalsIgnoreCase("y"));
	}
	
	public static void checkEmail(String chkEmail) {
		while(chkEmail.startsWith("@")||chkEmail.contains(" ")) {
			chkEmail = JOptionPane.showInputDialog
					("Input your e-mail, again : ");
		}
		chkEmail = chkEmail.toLowerCase();
		JOptionPane.showInputDialog(null,
				chkEmail(chkEmail) ? "your e-mail")
				
				
	}

}
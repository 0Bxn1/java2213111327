package ex1;
import javax.swing.*;
public class ex1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input Full name:");
		int birthYear = Integer.parseInt
				(JOptionPane.showInputDialog("Input Birth year:"));
		while(birthYear<1989||birthYear>2018);
		   birthYear = Integer.parseInt
			    (JOptionPane.showInputDialog("Input Birth year:")); 
		   
		int gender = JOptionPane.showConfirmDialog(null,
				"Are you Female?",
				"Gender",
				JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null,"Full name:"+name+"\nBirth Year:"+birthYear+
				"\nYou're"+(gender == 0?"fm":"m"));
				

	}

}
package project1;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class Example_402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail");
		while(inputEmail.startsWith("@")||inputEmail.contains("")) {
			inputEmail = JOptionPane.showInputDialog
					("input your e-mail, again :");
		}
		inputEmail = inputEmail.toLowerCase();
		/*if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com"));
				JOptionPane.showMessageDiLog(null, "Your e-mail is "+inputEmail);
    	}else { 
		        JOtionPane.showMessageDiLog(null, "Your e-mail is not hotmailor gmail dot com ");
		        
	}*/
		boolean check = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null,
				check ? "your e-mail is " + inputEmail : "Ypur e-mail is not gmail or gmail dot com");
	}			
	}

package project1;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		if(!fullname.contains(" ")) {
			System.out.print("Incorrect Name");
		}
		else
        {
        	String firstName = fullname.substring(0,fullname.indexOf(' '));
        	String lastName = fullname.substring(fullname.indexOf(' ')+1);
        	System.out.println("First Name: "+firstName.toUpperCase());
        	System.out.println("Last Name: "+lastName.toLowerCase());
        }

	}

}

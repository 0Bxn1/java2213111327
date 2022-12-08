package ex1;
import java.util.Scanner;

import javax.swing.*;

public class Lab504 {
	static String fullname;
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your name, separated by a space.");
		String fullname = scan.nextLine(); 
		int name = fullname.indexOf(' ');
		String firstName = fullname.substring(0,name);
		System.out.println(abbreviatName(fullname).toUpperCase()+firstName);
	} 
	public static String abbreviatName (String fullname) {
		String dot="";
		for(int i=0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				dot+=fullname.charAt(i+1)+".";
			}
		}
		
		return dot;
	}

}

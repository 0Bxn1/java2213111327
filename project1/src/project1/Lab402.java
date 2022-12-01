package project1;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith("."))
		{
			System.out.print("The sentence msh end with full stop point : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		for(int i=0;i<sentence.length();i++) {
		  if(sentence.charAt(i)!=' ') {
		   System.out.print(sentence.charAt(i));
		}
		  else {
			  System.out.println();
		  }
	   }
	 }
    }
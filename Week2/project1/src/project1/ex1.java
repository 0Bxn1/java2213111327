package project1;
import java.util.*;
import java.text.*;

public class ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input two integers (a b) : ");
		int a =scan.nextInt();
		int b =scan.nextInt();
		int sum = a+b;
		int num = 0;
		System.out.println("Sum two integers : "+(sum));
		while (sum!=0)
		{
			sum/=10;
			num++;
			
		}
		System.out.print("Digit number of sum of said to integers : "+num);
		
        
	}

}

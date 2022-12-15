package ex1;
import java.util.Scanner;

public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  number []= new int[5];
		for{int i=0;i<number.length;i++){
			System.out.println("Input number "+(i+1)+ ":");
					number [1] = scan.nextInt();
		}
		System.out.println();
			int totalNumber = sumOfPos(number);
			System.out.print("Summation of positove number is "+totalNumber);
			System.out.print("Summation of positove number is "+ sumOfPos(number));
			
		}
		public static int sumOfPos (int[] nums) {
			
		}

		
		
		
		
		
		
		
		

	}

}

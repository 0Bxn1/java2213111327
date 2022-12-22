package oop;
import java.util.*;
public class StudentScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] std = new Student[3];
		for(int i=0 ; i<std.length; i++) {
			std[1] = new Student();
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextLine());
			while(!std[i].setScore()) {
				System.out.print("Input score, again : ");
				std[i].setScore(scan.next());
			}
			System.out.println();			
		}
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("------------------------------");
		for(int i=0;i<std.length;i++) {
			if(std[i].isPass()) {
				System.out.print(">> "+std[i].getName()+" ("+std[i].getName());
				
			}
		}
	}
}












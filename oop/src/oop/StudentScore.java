package oop;
import java.util.*;
public class StudentScore {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("How many student in class : ");
		int num = scn.nextInt();
		Student[] std = new Student[num];
		System.out.println();
		for(int i=0 ; i<std.length; i++) {
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			System.out.println("-------------------------------------");
			std[i] = new Student();
			System.out.print("Input student name : ");
			std[i].setName(scn.next());
			System.out.print("Input student score : ");
			std[i].setScore(scn.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scn.nextInt());
			}
			System.out.println();			
		}
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("------------------------------");
		for(Student _std : std) {
			if(_std.isPass()) {
				System.out.println(">> "+_std.getName()+" ("+_std.getScore()+")");
				
			}
		}
	}
}












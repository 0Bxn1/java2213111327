package oop;

import java.util.Scanner;

public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static piggybank pb = new piggybank();
	
	public static void main(String[] args) {
		
		//piggybank pb = new piggybank();
		
//		pb.setPiggyBank(500);
//		System.out.println("Money Total : "+ pb.getTotal());
//		pb.addTwo(34);
//		System.out.println("Add 2 Baht Money : "+ 34);
//		pb.addTen(13);
//		System.out.println("Add 10 Baht Money : "+ 13);
//		System.out.println("Money Total : " + pb.getTotal());
//		pb.addFive(100);
		sizeofPiggyBank();
	}

	public static void sizeofPiggyBank() {
		System.out.print("Money Total: "+pb.getTotal());
		System.out.print("Please define size of PiggyBank");
//		int size = scan.nextint();
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your PiggyBank:" + pb.getTotal());
		inputCoin();
		
	}
	public static void inputCoin() {
		System.out.println("\n===========================");
		System.out.println("Menu ");
		System.out.println("=============================");
		System.out.println("[1] one baht.");
		System.out.println("[2] two baht.");
		System.out.println("[3] five baht.");
		System.out.println("[4] ten baht.");
		System.out.println("[5] Exit");
		System.out.println("=============================");
		System.out.print("Please choice : ");
		int choice = scan.nextInt();
		if(choice==1) {
	    	   System.out.print("Insert 1 baht");
	    	   pb.addOne(scan.nextInt());
	    	   System.out.print("Money Total : "+ pb.getTotal());
		    }
		
		System.out.print("Money Total : "+ pb.getTotal());
	    System
		else if(choice==2) {
	    	   System.out.print("Insert 1 baht");
	    	   pb.addOne(scan.nextInt());
	    	   System.out.print("Money Total : "+ pb.getTotal());
		    }
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

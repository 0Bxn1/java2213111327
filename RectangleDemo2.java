package oop;

import java.util.Scanner;

public class RectangleDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter width");
		double width = scan.nextDouble();
		System.out.println("Enter length");
		double length = scan.nextDouble();
		Rectangle2 rec = new Rectangle2(width,length, null);
		System.out.println(rec+"\nArea of Rectangle is "+rec.getArea());
	}

}

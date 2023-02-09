package oop;
import java.util.Scanner;

public class ShapeDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cy1 = new Cylinder[5];
		for (int i=0;i<cy1.length;i++) {
			System.out.print("Input radius & hight : ");
			double radius = scan.nextDouble();
			double hight = scan.nextDouble();
			cy1[i]=new Cylinder(radius,hight);
			}
		 int i =1;
		 for(Cylinder  _cy1:cy1) {
			 System.out.print("Cylinder"+i+", volume="+_cy1.getVolume());;
			 i++;
		 }
	}

}

package oop;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder(double radius,double height) {
		super(radius,null);
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public double getVolume() {
		return super.getArea()*height;
	}
	public double getArea() {
		return Math.PI*2*getHeight()*getRadius();
	}
	public String toString() {
		return "height= "+getHeight()+","+super.toString();
	}

}

package oop;

public class  Rectangle2  {
	private double width;
	private double length;
	
	public Rectangle2(double width, double length,String color) {
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getLength() {
		return this.length;
	}
	public double getArea() {
		return getWidth()*getLength();
	}
	public String toString() {
		return "Rectangle[width= "+this.width+",length="+this.length+",color="+ color+"]";
	}

}


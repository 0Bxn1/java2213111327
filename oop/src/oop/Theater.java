package oop;

public class Theater extends Movie {
	private int theaterNo;
	
	public Theater(String id,String name,Director director,int theaterNo) {
		super(id,name,director);
		this.theaterNo = theaterNo;
	}
	public Theater() {
		super();
		this.theaterNo = 0;
	}
	public String getTheatherName() {
		if(theaterNo>=11) {
			return "Basic Theater";
		 }
		else if(theaterNo >=12&&theaterNo <=14 ) {
			return "Sweet Theater";
		}
		else if (theaterNo == 15){
			return "Premium Theater";
		}
		else {
			return" ";
		}
	}
	public String toString() {
		return getTheatherName()+":"+ super.toString();
	}

}

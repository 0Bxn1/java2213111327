package oop;

public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;
	private int month;
	private int day;
	private int year;
	
	public Date() {
//		dMonth = 1;
//		dDay = 1;
//		dYear = 1900;
		setDate(month,day,year);
	}
	public Date(int month,int day,int year) {
		 dMonth = month;
		 dDay = day;
		 dYear = year;
	}
	public void setDate(int month,int day,int year) {
		 dMonth = month;
		 dDay = day;
		 dYear = year;
	 
	}
	public int getMonth() {
		return dMonth;
	}
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toString() {
		return getMonth()+"-"+getDay()+"-"+getYear();
	}

}

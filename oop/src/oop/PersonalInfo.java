package oop;

public class PersonalInfo {
	private Person name;
	private Date bDay;
	private int personID;
	
	public PersonalInfo() {
		name = new Person();
		bDay = new Date();
		personID = 0;
	}
	public void PersonalInfo(String first,String last,
			int month,int day,int year,
			int ID) 
	{
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personID = ID;
	}
	public void setPersonalInfo(String first,String last,
			int month,int day,int year,
			int ID) {
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personID = ID;
	}
	public String toString() {
		return"name :"+name.toString()+"\nDate of birth : "+ bDay.toString()+"\nPersonal ID : "+personID;
	}

}

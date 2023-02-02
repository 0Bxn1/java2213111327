package oop;

public class Director {
	private String name;
	private String email;
	private char gender;
	
	public Director(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Director(String name,String email) {
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGenderName() {
		return gender=='m'|| gender=='M'?"Male"
				:gender=='f'|| gender=='F'?"Female"
						:null;
//	   switch(this.gender) {
//	   case  'm'|'M':
//	   System.out.print("Male");
//	   break;
//	   
//	   case  'f'|'F':
//	   System.out.print("Female");
//	   break;
//	   
//	   default:
//	   System.out.print(' ');
//	   break;
//	   }
//	   return  getGenderName();
	}
	public String toString() {
		return name+" ("+email+";"+getGenderName()+")";
	}

}

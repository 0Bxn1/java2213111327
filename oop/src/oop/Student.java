package oop;

public class Student {
	public String name;
	public int score;
	
	
public void setName(String Name) {
	name = Name;
  }
public String getName() {
	return name;
  }
public void setScore(int Score) {
	score = Score;
}
public int getScore() {
	return score;
}
public boolean checkScore() {
	if (score >= 0 && score <= 100)
		return true;
	else
		return false;
}
public boolean isPass() {
	return (score >= 50)?true:false;
}
public String findGrade(int score) {
	return score < 50?"F" : (score< 55?"D" :(score< 60?"D+" :(score< 65?"C" : (score< 70?"C+" : (score< 75?"B" :(score< 80?"B+" : "A" ) ))) ) );
	
}

}
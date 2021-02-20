
public class course {
private String name;
private int id;
private int numOfTeachers;
private int howManylectures;
private boolean havePractice;

public course(String name,int id,int numOfTeachers,int numOfLectures,boolean havePractice) {
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getNumOfTeachers() {
	return numOfTeachers;
}

public void setNumOfTeachers(int numOfTeachers) {
	this.numOfTeachers = numOfTeachers;
}

public int getHowManylectures() {
	return howManylectures;
}

public void setHowManylectures(int howManylectures) {
	this.howManylectures = howManylectures;
}

public boolean isHavePractice() {
	return havePractice;
}

public void setHavePractice(boolean havePractice) {
	this.havePractice = havePractice;
}
}

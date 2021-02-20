import java.util.ArrayList;

public class topic {
private int id ;
private String name;
private ArrayList<course> courses;
private int numOfPointsToFinish;
private double minBegrootScore;
private double minpsecometryScore;
private ArrayList<student> students=new ArrayList<student>();


public topic(int id,String name,ArrayList<course> courses,int numOfPoints,double minBegrootScore,double psecometryScore) {
	setId(id);
	setName(name);
	setCourses(courses);
	setNumOfPointsToFinish(numOfPoints);
	
}


public double getMinBegrootScore() {
	return minBegrootScore;
}


public void setMinBegrootScore(double minBegrootScore) {
	this.minBegrootScore = minBegrootScore;
}


public double getPsecometryScore() {
	return minpsecometryScore;
}


public void setPsecometryScore(double psecometryScore) {
	this.minpsecometryScore = psecometryScore;
}


public ArrayList<student> getStudents() {
	return students;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<course> getCourses() {
	return courses;
}
public void setCourses(ArrayList<course> courses) {
	this.courses = courses;
}
public int getNumOfPointsToFinish() {
	return numOfPointsToFinish;
}
public void setNumOfPointsToFinish(int numOfPointsToFinish) {
	this.numOfPointsToFinish = numOfPointsToFinish;
}
 public void addCourse(course c){
	 if(!courses.contains(c)) {
		 courses.add(c);
	 }
}
 public void removeCourse(course c){
	 if(courses.contains(c)) {
		 courses.remove(c);
	 }
}
 
 public void addStudent(student s) throws Exception{
	 if(s.getBegrotGradesAvg()>minBegrootScore&&s.getPsychomtre()>minpsecometryScore&&!students.contains(s)) {
		 students.add(s);
		 System.out.println("welcome to "+ name);
	 }
	 
 
	 else if(s.getBegrotGradesAvg()<minBegrootScore){
		 throw new Exception("cant Add beacuase the begrout isn't enough"); 
	 }
	 else if(s.getPsychomtre()<minpsecometryScore){
		 throw new Exception("cant Add beacuase the pscometry isn't enough"); 
	 }
}
 
 public void removeStudent(student s) {
	 if(students.contains(s)) {
		 students.remove(s);
	 }
 }
}
import java.util.ArrayList;

public class topic {
private int id ;
private String name;
private ArrayList<course> courses;
private int numOfPointsToFinish;


public topic(int id,String name,ArrayList<course> courses,int numOfPoints) {
	setId(id);
	setName(name);
	setCourses(courses);
	setNumOfPointsToFinish(numOfPoints);
	
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
}

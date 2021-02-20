
public class practice {
	private course course;
	private int numOfHomeWork;
	private double percentageOfHomework;
	
	
	public practice (course course,int numOfHomework,double percantageOfHomework) {
		setCourse(course);
		setNumOfHomeWork(numOfHomework);
		setPercentageOfHomework(percantageOfHomework);
	}
	
	public course getCourse() {
		return course;
	}
	public void setCourse(course course) {
		this.course = course;
	}
	public int getNumOfHomeWork() {
		return numOfHomeWork;
	}
	public void setNumOfHomeWork(int numOfHomeWork) {
		this.numOfHomeWork = numOfHomeWork;
	}
	public double getPercentageOfHomework() {
		return percentageOfHomework;
	}
	public void setPercentageOfHomework(double percentageOfHomework) {
		this.percentageOfHomework = percentageOfHomework;
	}
	

}

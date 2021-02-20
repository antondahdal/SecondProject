
public class exam {
private int scoreToPass;
private double percenteageOfCourse;
private boolean openExam;

public exam(int score,double percentage,boolean open) {
	setScoreToPass(score);
	setPercenteageOfCourse(percentage);
	setOpenExam(open);
}

public int getScoreToPass() {
	return scoreToPass;
}

public void setScoreToPass(int scoreToPass) {
	this.scoreToPass = scoreToPass;
}

public double getPercenteageOfCourse() {
	return percenteageOfCourse;
}

public void setPercenteageOfCourse(double percenteageOfCourse) {
	this.percenteageOfCourse = percenteageOfCourse;
}

public boolean isOpenExam() {
	return openExam;
}

public void setOpenExam(boolean openExam) {
	this.openExam = openExam;
}

}

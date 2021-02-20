
public class homework {
private String name;
private double percentage;
private double score;

public homework(String name,double percentage,double score) {
	setName(name);
	setPercentage(percentage);
	setScore(score);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPercentage() {
	return percentage;
}

public void setPercentage(double percentage) {
	this.percentage = percentage;
}

public double getScore() {
	return score;
}

public void setScore(double score) {
	this.score = score;
}


}

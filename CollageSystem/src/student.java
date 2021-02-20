
public class student extends person {
	private int psychomtre;
	private int begrotGradesAvg;
	
	public student(String name,int id,String gender,int age,String adress,int psychomtre,int bagrotGradesAvg) {
		super(name,id,gender,age,adress);
		setPsychomtre(psychomtre);
		setBegrotGradesAvg(bagrotGradesAvg);
	}

	public int getPsychomtre() {
		return psychomtre;
	}

	public void setPsychomtre(int psychomtre) {
		this.psychomtre = psychomtre;
	}

	public int getBegrotGradesAvg() {
		return begrotGradesAvg;
	}

	public void setBegrotGradesAvg(int begrotGradesAvg) {
		this.begrotGradesAvg = begrotGradesAvg;
	}
}

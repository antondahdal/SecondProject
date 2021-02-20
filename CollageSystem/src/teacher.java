import java.util.ArrayList;
public class teacher extends person {
 private ArrayList<String> subjects;
 private boolean teachesAnotherPlace;
 private boolean haveACar;
 
 public teacher(String name,int id,String gender,int age,String adress,ArrayList<String> subjects,boolean teachAnotherPlace,boolean haveACar) {
	 super(name,id,gender,age,adress);
	 setSubjects(subjects);
	 setTeachesAnotherPlace(teachAnotherPlace);
	 setHaveACar(haveACar);
	 
 }

public ArrayList<String> getSubjects() {
	return subjects;
}

public void setSubjects(ArrayList<String> subjects) {
	this.subjects = subjects;
}

public boolean isTeachesAnotherPlace() {
	return teachesAnotherPlace;
}

public void setTeachesAnotherPlace(boolean teachesAnotherPlace) {
	this.teachesAnotherPlace = teachesAnotherPlace;
}

public boolean isHaveACar() {
	return haveACar;
}

public void setHaveACar(boolean haveACar) {
	this.haveACar = haveACar;
}
	public void addSubject(String sub) {
		if(!this.subjects.contains(sub)) {
			subjects.add(sub);
		}
	}
	public void deleteSub(String sub) {
		if(this.subjects.contains(sub)) {
			subjects.remove(sub);
		}
	}
}
